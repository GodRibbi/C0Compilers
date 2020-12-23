// Generated from D:/Project/Java/qwer/src/main/java/org/example\C0.g4 by ANTLR 4.8
package C0Compiler.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link C0Parser}.
 */
public interface C0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link C0Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(C0Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(C0Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(C0Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(C0Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(C0Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(C0Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(C0Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(C0Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#funvoid}.
	 * @param ctx the parse tree
	 */
	void enterFunvoid(C0Parser.FunvoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#funvoid}.
	 * @param ctx the parse tree
	 */
	void exitFunvoid(C0Parser.FunvoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#funint}.
	 * @param ctx the parse tree
	 */
	void enterFunint(C0Parser.FunintContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#funint}.
	 * @param ctx the parse tree
	 */
	void exitFunint(C0Parser.FunintContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(C0Parser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(C0Parser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(C0Parser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(C0Parser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#otherrt}.
	 * @param ctx the parse tree
	 */
	void enterOtherrt(C0Parser.OtherrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#otherrt}.
	 * @param ctx the parse tree
	 */
	void exitOtherrt(C0Parser.OtherrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#senlist}.
	 * @param ctx the parse tree
	 */
	void enterSenlist(C0Parser.SenlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#senlist}.
	 * @param ctx the parse tree
	 */
	void exitSenlist(C0Parser.SenlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Iffun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void enterIffun(C0Parser.IffunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Iffun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void exitIffun(C0Parser.IffunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Whilefun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void enterWhilefun(C0Parser.WhilefunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Whilefun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void exitWhilefun(C0Parser.WhilefunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Senlistfun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void enterSenlistfun(C0Parser.SenlistfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Senlistfun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void exitSenlistfun(C0Parser.SenlistfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Personalfun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void enterPersonalfun(C0Parser.PersonalfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Personalfun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void exitPersonalfun(C0Parser.PersonalfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Valuefun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void enterValuefun(C0Parser.ValuefunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Valuefun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void exitValuefun(C0Parser.ValuefunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Readfun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void enterReadfun(C0Parser.ReadfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Readfun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void exitReadfun(C0Parser.ReadfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Writefun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void enterWritefun(C0Parser.WritefunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Writefun}
	 * labeled alternative in {@link C0Parser#sen}.
	 * @param ctx the parse tree
	 */
	void exitWritefun(C0Parser.WritefunContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#ifsys}.
	 * @param ctx the parse tree
	 */
	void enterIfsys(C0Parser.IfsysContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#ifsys}.
	 * @param ctx the parse tree
	 */
	void exitIfsys(C0Parser.IfsysContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#ifsysadd}.
	 * @param ctx the parse tree
	 */
	void enterIfsysadd(C0Parser.IfsysaddContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#ifsysadd}.
	 * @param ctx the parse tree
	 */
	void exitIfsysadd(C0Parser.IfsysaddContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#elsesyss}.
	 * @param ctx the parse tree
	 */
	void enterElsesyss(C0Parser.ElsesyssContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#elsesyss}.
	 * @param ctx the parse tree
	 */
	void exitElsesyss(C0Parser.ElsesyssContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#whilesys}.
	 * @param ctx the parse tree
	 */
	void enterWhilesys(C0Parser.WhilesysContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#whilesys}.
	 * @param ctx the parse tree
	 */
	void exitWhilesys(C0Parser.WhilesysContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#personal}.
	 * @param ctx the parse tree
	 */
	void enterPersonal(C0Parser.PersonalContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#personal}.
	 * @param ctx the parse tree
	 */
	void exitPersonal(C0Parser.PersonalContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(C0Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(C0Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#returnsys}.
	 * @param ctx the parse tree
	 */
	void enterReturnsys(C0Parser.ReturnsysContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#returnsys}.
	 * @param ctx the parse tree
	 */
	void exitReturnsys(C0Parser.ReturnsysContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#returnsysvoid}.
	 * @param ctx the parse tree
	 */
	void enterReturnsysvoid(C0Parser.ReturnsysvoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#returnsysvoid}.
	 * @param ctx the parse tree
	 */
	void exitReturnsysvoid(C0Parser.ReturnsysvoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(C0Parser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(C0Parser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(C0Parser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(C0Parser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(C0Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(C0Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#expadd}.
	 * @param ctx the parse tree
	 */
	void enterExpadd(C0Parser.ExpaddContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#expadd}.
	 * @param ctx the parse tree
	 */
	void exitExpadd(C0Parser.ExpaddContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(C0Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(C0Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#termadd}.
	 * @param ctx the parse tree
	 */
	void enterTermadd(C0Parser.TermaddContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#termadd}.
	 * @param ctx the parse tree
	 */
	void exitTermadd(C0Parser.TermaddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Idfun}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdfun(C0Parser.IdfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Idfun}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdfun(C0Parser.IdfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expfun}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpfun(C0Parser.ExpfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expfun}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpfun(C0Parser.ExpfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Intfun}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIntfun(C0Parser.IntfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Intfun}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIntfun(C0Parser.IntfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Perfuns}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterPerfuns(C0Parser.PerfunsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Perfuns}
	 * labeled alternative in {@link C0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitPerfuns(C0Parser.PerfunsContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#perFun}.
	 * @param ctx the parse tree
	 */
	void enterPerFun(C0Parser.PerFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#perFun}.
	 * @param ctx the parse tree
	 */
	void exitPerFun(C0Parser.PerFunContext ctx);
}