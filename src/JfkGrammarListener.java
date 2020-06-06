import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JfkGrammarParser}.
 */
public interface JfkGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JfkGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JfkGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JfkGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JfkGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JfkGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JfkGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JfkGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JfkGrammarParser.ExpressionContext ctx);
}