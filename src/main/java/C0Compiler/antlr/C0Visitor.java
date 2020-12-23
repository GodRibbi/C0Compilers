// Generated from D:/Project/Java/qwer/src/main/java/org/example\C0.g4 by ANTLR 4.8
package C0Compiler.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link C0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface C0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link C0Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(C0Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(C0Parser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(C0Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(C0Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#funvoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunvoid(C0Parser.FunvoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#funint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunint(C0Parser.FunintContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(C0Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(C0Parser.OtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#otherrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherrt(C0Parser.OtherrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#senlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenlist(C0Parser.SenlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Iffun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIffun(C0Parser.IffunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Whilefun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilefun(C0Parser.WhilefunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Senlistfun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenlistfun(C0Parser.SenlistfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Personalfun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonalfun(C0Parser.PersonalfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Valuefun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuefun(C0Parser.ValuefunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Readfun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadfun(C0Parser.ReadfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Writefun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritefun(C0Parser.WritefunContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#ifsys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfsys(C0Parser.IfsysContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#ifsysadd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfsysadd(C0Parser.IfsysaddContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#elsesyss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsesyss(C0Parser.ElsesyssContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#whilesys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilesys(C0Parser.WhilesysContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#personal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonal(C0Parser.PersonalContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(C0Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#returnsys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsys(C0Parser.ReturnsysContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#returnsysvoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsysvoid(C0Parser.ReturnsysvoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(C0Parser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(C0Parser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(C0Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#expadd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpadd(C0Parser.ExpaddContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(C0Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#termadd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermadd(C0Parser.TermaddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Idfun}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdfun(C0Parser.IdfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expfun}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpfun(C0Parser.ExpfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Intfun}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntfun(C0Parser.IntfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Perfuns}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerfuns(C0Parser.PerfunsContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#perFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerFun(C0Parser.PerFunContext ctx);
}