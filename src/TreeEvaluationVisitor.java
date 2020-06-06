public final class TreeEvaluationVisitor extends JfkGrammarBaseVisitor<Double>
{
    private double result;

    public Double visitExpression(JfkGrammarParser.ExpressionContext ctx) throws IllegalArgumentException
    {
        if (null == ctx.op) // number
        {
            try
            {
                return numbersConversion(ctx);
            }

            catch (Exception e)
            {
                throw new IllegalArgumentException();
            }
        }

        Function<Double, Double, Double> operand;
        switch(ctx.op.getType()) {
            case JfkGrammarParser.MUL:
                operand = (a, b) -> a * b;
                break;
            case JfkGrammarParser.DIV:
                operand = (a, b) -> a / b;
                break;
            case JfkGrammarParser.ADD:
                operand = (a, b) -> a + b;
                break;
            case JfkGrammarParser.SUB:
                operand = (a, b) -> a - b;
                break;
            case JfkGrammarParser.POW:
                operand = (a, b) -> Math.pow(a, b);
                break;
            case JfkGrammarParser.MOD:
                operand = (a, b) -> a % b;
                break;
            case JfkGrammarParser.LP:
                return visit(ctx.expression(0));
            case JfkGrammarParser.RP:
                return visit(ctx.expression(0));
            default:
                throw new IllegalArgumentException();
        }

        double left = visit(ctx.expression(0));
        double right;

        if(ctx.expression(1)!=null)
        {
            right = visit(ctx.expression(1));
        }

        else
        {
            right = left;
            left = 0;
        }

        //System.out.println(left + " " + right);
        return operand.binary(left, right);
    }

    public double numbersConversion(JfkGrammarParser.ExpressionContext ctx)
    {
        String number = ctx.getText();

        if(number.substring(0,1).equals("0"))
        {
            if(number.substring(1,2).equals("x"))
            {
                this.result = Integer.parseInt(number.substring(2), 16);
            }

            else if(!number.substring(1,2).equals("0"))
            {
                this.result = Integer.parseInt(number.substring(1), 8);
            }
        }

        else
        {
            this.result = Integer.parseInt(number);
        }

       return result;
    }
}
