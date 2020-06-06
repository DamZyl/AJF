import org.objectweb.asm.*;

import java.text.ParseException;

public final class TreeCompilationListener extends JfkGrammarBaseListener {
    private final MethodVisitor _mv;
    private int _currentTreeDepth, _maxTreeDepth;
    private TreeEvaluationVisitor _tev = new TreeEvaluationVisitor();

    public int getTreeDepth(){
        return this._maxTreeDepth;
    }

    public TreeCompilationListener(MethodVisitor mv) {
        this._mv = mv;
    }

    @Override
    public void enterExpression(JfkGrammarParser.ExpressionContext ctx) {
        this._currentTreeDepth = 0;
        this._maxTreeDepth = 0;
    }

    @Override
    public void exitExpression(JfkGrammarParser.ExpressionContext ctx) {
        if (null == ctx.op) // number
        {
            this._currentTreeDepth++;
            if (this._currentTreeDepth > this._maxTreeDepth)
                this._maxTreeDepth = this._currentTreeDepth;

            try {
                this._mv.visitLdcInsn((int)_tev.numbersConversion(ctx));
                return;
            } catch (Exception e) {
                throw new IllegalArgumentException("Number is not of the integer type.");
            }
        }
        switch(ctx.op.getType()) {
            case JfkGrammarParser.MUL:
                this._mv.visitInsn(Opcodes.IMUL);
                break;
            case JfkGrammarParser.DIV:
                this._mv.visitInsn(Opcodes.IDIV);
                break;
            case JfkGrammarParser.ADD:
                this._mv.visitInsn(Opcodes.IADD);
                break;
            case JfkGrammarParser.SUB:
                this._mv.visitInsn(Opcodes.ISUB);
                break;
            case JfkGrammarParser.POW:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "pow", "(DD)D", false);
                break;
            case JfkGrammarParser.MOD:
                this._mv.visitInsn(Opcodes.IDIV);
                break;
            case JfkGrammarParser.LP:
                return;
            case JfkGrammarParser.RP:
                return;
            default:
                throw new IllegalArgumentException();
        }
        this._currentTreeDepth--;
    }
}
