// Generated from D:/Project/Java/qwer/src/main/java/org/example\C0.g4 by ANTLR 4.8
package C0Compiler.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class C0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTSYS=1, VOIDSYS=2, COMMA=3, SCANFSYS=4, PRINTFSYS=5, RETURNSYS=6, WHILESYS=7, 
		MAINSYS=8, ENDSYS=9, IFSYS=10, EQUALSYS=11, ELSESYS=12, LBRACE=13, RBRACE=14, 
		LPARENTHESE=15, RPARENTHESE=16, ID=17, INT=18, AddSub=19, Mul=20, WS=21;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_program = 2, RULE_var = 3, RULE_funvoid = 4, 
		RULE_funint = 5, RULE_main = 6, RULE_other = 7, RULE_otherrt = 8, RULE_senlist = 9, 
		RULE_sen = 10, RULE_ifsys = 11, RULE_ifsysadd = 12, RULE_elsesyss = 13, 
		RULE_whilesys = 14, RULE_personal = 15, RULE_value = 16, RULE_returnsys = 17, 
		RULE_returnsysvoid = 18, RULE_read = 19, RULE_write = 20, RULE_exp = 21, 
		RULE_expadd = 22, RULE_term = 23, RULE_termadd = 24, RULE_factor = 25, 
		RULE_perFun = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "program", "var", "funvoid", "funint", "main", "other", 
			"otherrt", "senlist", "sen", "ifsys", "ifsysadd", "elsesyss", "whilesys", 
			"personal", "value", "returnsys", "returnsysvoid", "read", "write", "exp", 
			"expadd", "term", "termadd", "factor", "perFun"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'void'", "','", "'scanf'", "'printf'", "'return'", "'while'", 
			"'main'", "';'", "'if'", "'='", "'else'", "'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTSYS", "VOIDSYS", "COMMA", "SCANFSYS", "PRINTFSYS", "RETURNSYS", 
			"WHILESYS", "MAINSYS", "ENDSYS", "IFSYS", "EQUALSYS", "ELSESYS", "LBRACE", 
			"RBRACE", "LPARENTHESE", "RPARENTHESE", "ID", "INT", "AddSub", "Mul", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "C0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public C0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				stat();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTSYS || _la==VOIDSYS );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<FunvoidContext> funvoid() {
			return getRuleContexts(FunvoidContext.class);
		}
		public FunvoidContext funvoid(int i) {
			return getRuleContext(FunvoidContext.class,i);
		}
		public List<FunintContext> funint() {
			return getRuleContexts(FunintContext.class);
		}
		public FunintContext funint(int i) {
			return getRuleContext(FunintContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					var();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(69);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VOIDSYS:
						{
						setState(67);
						funvoid();
						}
						break;
					case INTSYS:
						{
						setState(68);
						funint();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(74);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode INTSYS() { return getToken(C0Parser.INTSYS, 0); }
		public List<TerminalNode> ID() { return getTokens(C0Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(C0Parser.ID, i);
		}
		public TerminalNode ENDSYS() { return getToken(C0Parser.ENDSYS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(C0Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(C0Parser.COMMA, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(INTSYS);
			setState(77);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(78);
				match(COMMA);
				setState(79);
				match(ID);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(ENDSYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunvoidContext extends ParserRuleContext {
		public TerminalNode VOIDSYS() { return getToken(C0Parser.VOIDSYS, 0); }
		public TerminalNode ID() { return getToken(C0Parser.ID, 0); }
		public TerminalNode LPARENTHESE() { return getToken(C0Parser.LPARENTHESE, 0); }
		public TerminalNode RPARENTHESE() { return getToken(C0Parser.RPARENTHESE, 0); }
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public FunvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterFunvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitFunvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitFunvoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunvoidContext funvoid() throws RecognitionException {
		FunvoidContext _localctx = new FunvoidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(VOIDSYS);
			setState(88);
			match(ID);
			setState(89);
			match(LPARENTHESE);
			setState(90);
			match(RPARENTHESE);
			setState(91);
			other();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunintContext extends ParserRuleContext {
		public TerminalNode INTSYS() { return getToken(C0Parser.INTSYS, 0); }
		public TerminalNode ID() { return getToken(C0Parser.ID, 0); }
		public TerminalNode LPARENTHESE() { return getToken(C0Parser.LPARENTHESE, 0); }
		public TerminalNode RPARENTHESE() { return getToken(C0Parser.RPARENTHESE, 0); }
		public OtherrtContext otherrt() {
			return getRuleContext(OtherrtContext.class,0);
		}
		public FunintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterFunint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitFunint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitFunint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunintContext funint() throws RecognitionException {
		FunintContext _localctx = new FunintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(INTSYS);
			setState(94);
			match(ID);
			setState(95);
			match(LPARENTHESE);
			setState(96);
			match(RPARENTHESE);
			setState(97);
			otherrt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode VOIDSYS() { return getToken(C0Parser.VOIDSYS, 0); }
		public TerminalNode MAINSYS() { return getToken(C0Parser.MAINSYS, 0); }
		public TerminalNode LPARENTHESE() { return getToken(C0Parser.LPARENTHESE, 0); }
		public TerminalNode RPARENTHESE() { return getToken(C0Parser.RPARENTHESE, 0); }
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(VOIDSYS);
			setState(100);
			match(MAINSYS);
			setState(101);
			match(LPARENTHESE);
			setState(102);
			match(RPARENTHESE);
			setState(103);
			other();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(C0Parser.LBRACE, 0); }
		public SenlistContext senlist() {
			return getRuleContext(SenlistContext.class,0);
		}
		public ReturnsysvoidContext returnsysvoid() {
			return getRuleContext(ReturnsysvoidContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(C0Parser.RBRACE, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_other);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LBRACE);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTSYS) {
				{
				{
				setState(106);
				var();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			senlist();
			setState(113);
			returnsysvoid();
			setState(114);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherrtContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(C0Parser.LBRACE, 0); }
		public SenlistContext senlist() {
			return getRuleContext(SenlistContext.class,0);
		}
		public ReturnsysContext returnsys() {
			return getRuleContext(ReturnsysContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(C0Parser.RBRACE, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public OtherrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterOtherrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitOtherrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitOtherrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherrtContext otherrt() throws RecognitionException {
		OtherrtContext _localctx = new OtherrtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_otherrt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(LBRACE);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTSYS) {
				{
				{
				setState(117);
				var();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			senlist();
			setState(124);
			returnsys();
			setState(125);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenlistContext extends ParserRuleContext {
		public List<SenContext> sen() {
			return getRuleContexts(SenContext.class);
		}
		public SenContext sen(int i) {
			return getRuleContext(SenContext.class,i);
		}
		public SenlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterSenlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitSenlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitSenlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenlistContext senlist() throws RecognitionException {
		SenlistContext _localctx = new SenlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_senlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			sen();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCANFSYS) | (1L << PRINTFSYS) | (1L << WHILESYS) | (1L << IFSYS) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(128);
				sen();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenContext extends ParserRuleContext {
		public SenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sen; }
	 
		public SenContext() { }
		public void copyFrom(SenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhilefunContext extends SenContext {
		public WhilesysContext whilesys() {
			return getRuleContext(WhilesysContext.class,0);
		}
		public WhilefunContext(SenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterWhilefun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitWhilefun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitWhilefun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValuefunContext extends SenContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValuefunContext(SenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterValuefun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitValuefun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitValuefun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IffunContext extends SenContext {
		public IfsysContext ifsys() {
			return getRuleContext(IfsysContext.class,0);
		}
		public IffunContext(SenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterIffun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitIffun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitIffun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadfunContext extends SenContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ReadfunContext(SenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterReadfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitReadfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitReadfun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PersonalfunContext extends SenContext {
		public PersonalContext personal() {
			return getRuleContext(PersonalContext.class,0);
		}
		public PersonalfunContext(SenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterPersonalfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitPersonalfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitPersonalfun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WritefunContext extends SenContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public WritefunContext(SenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterWritefun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitWritefun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitWritefun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SenlistfunContext extends SenContext {
		public TerminalNode LBRACE() { return getToken(C0Parser.LBRACE, 0); }
		public SenlistContext senlist() {
			return getRuleContext(SenlistContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(C0Parser.RBRACE, 0); }
		public SenlistfunContext(SenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterSenlistfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitSenlistfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitSenlistfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenContext sen() throws RecognitionException {
		SenContext _localctx = new SenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sen);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new IffunContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				ifsys();
				}
				break;
			case 2:
				_localctx = new WhilefunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				whilesys();
				}
				break;
			case 3:
				_localctx = new SenlistfunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(LBRACE);
				setState(137);
				senlist();
				setState(138);
				match(RBRACE);
				}
				break;
			case 4:
				_localctx = new PersonalfunContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				personal();
				}
				break;
			case 5:
				_localctx = new ValuefunContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				value();
				}
				break;
			case 6:
				_localctx = new ReadfunContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				read();
				}
				break;
			case 7:
				_localctx = new WritefunContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				write();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfsysContext extends ParserRuleContext {
		public IfsysaddContext ifsysadd() {
			return getRuleContext(IfsysaddContext.class,0);
		}
		public SenContext sen() {
			return getRuleContext(SenContext.class,0);
		}
		public ElsesyssContext elsesyss() {
			return getRuleContext(ElsesyssContext.class,0);
		}
		public IfsysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifsys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterIfsys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitIfsys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitIfsys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfsysContext ifsys() throws RecognitionException {
		IfsysContext _localctx = new IfsysContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifsys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			ifsysadd();
			setState(147);
			sen();
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(148);
				elsesyss();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfsysaddContext extends ParserRuleContext {
		public TerminalNode IFSYS() { return getToken(C0Parser.IFSYS, 0); }
		public TerminalNode LPARENTHESE() { return getToken(C0Parser.LPARENTHESE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPARENTHESE() { return getToken(C0Parser.RPARENTHESE, 0); }
		public IfsysaddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifsysadd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterIfsysadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitIfsysadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitIfsysadd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfsysaddContext ifsysadd() throws RecognitionException {
		IfsysaddContext _localctx = new IfsysaddContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifsysadd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IFSYS);
			setState(152);
			match(LPARENTHESE);
			setState(153);
			exp();
			setState(154);
			match(RPARENTHESE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsesyssContext extends ParserRuleContext {
		public TerminalNode ELSESYS() { return getToken(C0Parser.ELSESYS, 0); }
		public SenContext sen() {
			return getRuleContext(SenContext.class,0);
		}
		public ElsesyssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsesyss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterElsesyss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitElsesyss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitElsesyss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsesyssContext elsesyss() throws RecognitionException {
		ElsesyssContext _localctx = new ElsesyssContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elsesyss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ELSESYS);
			setState(157);
			sen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilesysContext extends ParserRuleContext {
		public Token op;
		public TerminalNode WHILESYS() { return getToken(C0Parser.WHILESYS, 0); }
		public TerminalNode LPARENTHESE() { return getToken(C0Parser.LPARENTHESE, 0); }
		public TerminalNode RPARENTHESE() { return getToken(C0Parser.RPARENTHESE, 0); }
		public SenContext sen() {
			return getRuleContext(SenContext.class,0);
		}
		public TerminalNode ID() { return getToken(C0Parser.ID, 0); }
		public TerminalNode INT() { return getToken(C0Parser.INT, 0); }
		public WhilesysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilesys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterWhilesys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitWhilesys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitWhilesys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilesysContext whilesys() throws RecognitionException {
		WhilesysContext _localctx = new WhilesysContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whilesys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(WHILESYS);
			setState(160);
			match(LPARENTHESE);
			setState(161);
			((WhilesysContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((WhilesysContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(162);
			match(RPARENTHESE);
			setState(163);
			sen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonalContext extends ParserRuleContext {
		public PerFunContext perFun() {
			return getRuleContext(PerFunContext.class,0);
		}
		public TerminalNode ENDSYS() { return getToken(C0Parser.ENDSYS, 0); }
		public PersonalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterPersonal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitPersonal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitPersonal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonalContext personal() throws RecognitionException {
		PersonalContext _localctx = new PersonalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_personal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			perFun();
			setState(166);
			match(ENDSYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(C0Parser.ID, 0); }
		public TerminalNode EQUALSYS() { return getToken(C0Parser.EQUALSYS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ENDSYS() { return getToken(C0Parser.ENDSYS, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(EQUALSYS);
			setState(170);
			exp();
			setState(171);
			match(ENDSYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnsysContext extends ParserRuleContext {
		public TerminalNode RETURNSYS() { return getToken(C0Parser.RETURNSYS, 0); }
		public TerminalNode LPARENTHESE() { return getToken(C0Parser.LPARENTHESE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPARENTHESE() { return getToken(C0Parser.RPARENTHESE, 0); }
		public TerminalNode ENDSYS() { return getToken(C0Parser.ENDSYS, 0); }
		public ReturnsysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnsys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterReturnsys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitReturnsys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitReturnsys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnsysContext returnsys() throws RecognitionException {
		ReturnsysContext _localctx = new ReturnsysContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnsys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(RETURNSYS);
			setState(174);
			match(LPARENTHESE);
			setState(175);
			exp();
			setState(176);
			match(RPARENTHESE);
			setState(177);
			match(ENDSYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnsysvoidContext extends ParserRuleContext {
		public TerminalNode RETURNSYS() { return getToken(C0Parser.RETURNSYS, 0); }
		public TerminalNode ENDSYS() { return getToken(C0Parser.ENDSYS, 0); }
		public ReturnsysvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnsysvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterReturnsysvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitReturnsysvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitReturnsysvoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnsysvoidContext returnsysvoid() throws RecognitionException {
		ReturnsysvoidContext _localctx = new ReturnsysvoidContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnsysvoid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNSYS) {
				{
				setState(179);
				match(RETURNSYS);
				setState(180);
				match(ENDSYS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode SCANFSYS() { return getToken(C0Parser.SCANFSYS, 0); }
		public TerminalNode LPARENTHESE() { return getToken(C0Parser.LPARENTHESE, 0); }
		public TerminalNode ID() { return getToken(C0Parser.ID, 0); }
		public TerminalNode RPARENTHESE() { return getToken(C0Parser.RPARENTHESE, 0); }
		public TerminalNode ENDSYS() { return getToken(C0Parser.ENDSYS, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(SCANFSYS);
			setState(184);
			match(LPARENTHESE);
			setState(185);
			match(ID);
			setState(186);
			match(RPARENTHESE);
			setState(187);
			match(ENDSYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode PRINTFSYS() { return getToken(C0Parser.PRINTFSYS, 0); }
		public TerminalNode LPARENTHESE() { return getToken(C0Parser.LPARENTHESE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPARENTHESE() { return getToken(C0Parser.RPARENTHESE, 0); }
		public TerminalNode ENDSYS() { return getToken(C0Parser.ENDSYS, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(PRINTFSYS);
			setState(190);
			match(LPARENTHESE);
			setState(191);
			exp();
			setState(192);
			match(RPARENTHESE);
			setState(193);
			match(ENDSYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<ExpaddContext> expadd() {
			return getRuleContexts(ExpaddContext.class);
		}
		public ExpaddContext expadd(int i) {
			return getRuleContext(ExpaddContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			term();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AddSub) {
				{
				{
				setState(196);
				expadd();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpaddContext extends ParserRuleContext {
		public TerminalNode AddSub() { return getToken(C0Parser.AddSub, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpaddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expadd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterExpadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitExpadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitExpadd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaddContext expadd() throws RecognitionException {
		ExpaddContext _localctx = new ExpaddContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expadd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(AddSub);
			setState(203);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<TermaddContext> termadd() {
			return getRuleContexts(TermaddContext.class);
		}
		public TermaddContext termadd(int i) {
			return getRuleContext(TermaddContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			factor();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Mul) {
				{
				{
				setState(206);
				termadd();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermaddContext extends ParserRuleContext {
		public TerminalNode Mul() { return getToken(C0Parser.Mul, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermaddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termadd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterTermadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitTermadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitTermadd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermaddContext termadd() throws RecognitionException {
		TermaddContext _localctx = new TermaddContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termadd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(Mul);
			setState(213);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PerfunsContext extends FactorContext {
		public PerFunContext perFun() {
			return getRuleContext(PerFunContext.class,0);
		}
		public PerfunsContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterPerfuns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitPerfuns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitPerfuns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntfunContext extends FactorContext {
		public TerminalNode INT() { return getToken(C0Parser.INT, 0); }
		public IntfunContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterIntfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitIntfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitIntfun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdfunContext extends FactorContext {
		public TerminalNode ID() { return getToken(C0Parser.ID, 0); }
		public IdfunContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterIdfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitIdfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitIdfun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpfunContext extends FactorContext {
		public TerminalNode LPARENTHESE() { return getToken(C0Parser.LPARENTHESE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPARENTHESE() { return getToken(C0Parser.RPARENTHESE, 0); }
		public ExpfunContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterExpfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitExpfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitExpfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new IdfunContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ExpfunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(LPARENTHESE);
				setState(217);
				exp();
				setState(218);
				match(RPARENTHESE);
				}
				break;
			case 3:
				_localctx = new IntfunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(INT);
				}
				break;
			case 4:
				_localctx = new PerfunsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				perFun();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PerFunContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(C0Parser.ID, 0); }
		public TerminalNode LPARENTHESE() { return getToken(C0Parser.LPARENTHESE, 0); }
		public TerminalNode RPARENTHESE() { return getToken(C0Parser.RPARENTHESE, 0); }
		public PerFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterPerFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitPerFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitPerFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerFunContext perFun() throws RecognitionException {
		PerFunContext _localctx = new PerFunContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_perFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
			setState(225);
			match(LPARENTHESE);
			setState(226);
			match(RPARENTHESE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00e7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16\2;\3\3\3\3\3\4\7\4"+
		"A\n\4\f\4\16\4D\13\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\7\5S\n\5\f\5\16\5V\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\tn\n\t\f\t\16\tq\13"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\7\13\u0084\n\13\f\13\16\13\u0087\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0093\n\f\3\r\3\r\3\r\5\r\u0098\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24"+
		"\u00b8\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\7\27\u00c8\n\27\f\27\16\27\u00cb\13\27\3\30\3\30\3\30\3\31"+
		"\3\31\7\31\u00d2\n\31\f\31\16\31\u00d5\13\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u00e1\n\33\3\34\3\34\3\34\3\34\3\34\2\2"+
		"\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\3\3"+
		"\2\23\24\2\u00e0\29\3\2\2\2\4=\3\2\2\2\6B\3\2\2\2\bN\3\2\2\2\nY\3\2\2"+
		"\2\f_\3\2\2\2\16e\3\2\2\2\20k\3\2\2\2\22v\3\2\2\2\24\u0081\3\2\2\2\26"+
		"\u0092\3\2\2\2\30\u0094\3\2\2\2\32\u0099\3\2\2\2\34\u009e\3\2\2\2\36\u00a1"+
		"\3\2\2\2 \u00a7\3\2\2\2\"\u00aa\3\2\2\2$\u00af\3\2\2\2&\u00b7\3\2\2\2"+
		"(\u00b9\3\2\2\2*\u00bf\3\2\2\2,\u00c5\3\2\2\2.\u00cc\3\2\2\2\60\u00cf"+
		"\3\2\2\2\62\u00d6\3\2\2\2\64\u00e0\3\2\2\2\66\u00e2\3\2\2\28:\5\4\3\2"+
		"98\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=>\5\6\4\2>\5\3\2\2"+
		"\2?A\5\b\5\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CI\3\2\2\2DB\3\2\2"+
		"\2EH\5\n\6\2FH\5\f\7\2GE\3\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2JL\3\2\2\2KI\3\2\2\2LM\5\16\b\2M\7\3\2\2\2NO\7\3\2\2OT\7\23\2\2PQ\7"+
		"\5\2\2QS\7\23\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT"+
		"\3\2\2\2WX\7\13\2\2X\t\3\2\2\2YZ\7\4\2\2Z[\7\23\2\2[\\\7\21\2\2\\]\7\22"+
		"\2\2]^\5\20\t\2^\13\3\2\2\2_`\7\3\2\2`a\7\23\2\2ab\7\21\2\2bc\7\22\2\2"+
		"cd\5\22\n\2d\r\3\2\2\2ef\7\4\2\2fg\7\n\2\2gh\7\21\2\2hi\7\22\2\2ij\5\20"+
		"\t\2j\17\3\2\2\2ko\7\17\2\2ln\5\b\5\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op"+
		"\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\5\24\13\2st\5&\24\2tu\7\20\2\2u\21\3\2"+
		"\2\2vz\7\17\2\2wy\5\b\5\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3"+
		"\2\2\2|z\3\2\2\2}~\5\24\13\2~\177\5$\23\2\177\u0080\7\20\2\2\u0080\23"+
		"\3\2\2\2\u0081\u0085\5\26\f\2\u0082\u0084\5\26\f\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\25"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0093\5\30\r\2\u0089\u0093\5\36\20"+
		"\2\u008a\u008b\7\17\2\2\u008b\u008c\5\24\13\2\u008c\u008d\7\20\2\2\u008d"+
		"\u0093\3\2\2\2\u008e\u0093\5 \21\2\u008f\u0093\5\"\22\2\u0090\u0093\5"+
		"(\25\2\u0091\u0093\5*\26\2\u0092\u0088\3\2\2\2\u0092\u0089\3\2\2\2\u0092"+
		"\u008a\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0091\3\2\2\2\u0093\27\3\2\2\2\u0094\u0095\5\32\16\2\u0095"+
		"\u0097\5\26\f\2\u0096\u0098\5\34\17\2\u0097\u0096\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\31\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009b\7\21\2\2\u009b"+
		"\u009c\5,\27\2\u009c\u009d\7\22\2\2\u009d\33\3\2\2\2\u009e\u009f\7\16"+
		"\2\2\u009f\u00a0\5\26\f\2\u00a0\35\3\2\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3"+
		"\7\21\2\2\u00a3\u00a4\t\2\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6\5\26\f"+
		"\2\u00a6\37\3\2\2\2\u00a7\u00a8\5\66\34\2\u00a8\u00a9\7\13\2\2\u00a9!"+
		"\3\2\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\5,\27\2"+
		"\u00ad\u00ae\7\13\2\2\u00ae#\3\2\2\2\u00af\u00b0\7\b\2\2\u00b0\u00b1\7"+
		"\21\2\2\u00b1\u00b2\5,\27\2\u00b2\u00b3\7\22\2\2\u00b3\u00b4\7\13\2\2"+
		"\u00b4%\3\2\2\2\u00b5\u00b6\7\b\2\2\u00b6\u00b8\7\13\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\'\3\2\2\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb"+
		"\7\21\2\2\u00bb\u00bc\7\23\2\2\u00bc\u00bd\7\22\2\2\u00bd\u00be\7\13\2"+
		"\2\u00be)\3\2\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c1\7\21\2\2\u00c1\u00c2"+
		"\5,\27\2\u00c2\u00c3\7\22\2\2\u00c3\u00c4\7\13\2\2\u00c4+\3\2\2\2\u00c5"+
		"\u00c9\5\60\31\2\u00c6\u00c8\5.\30\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca-\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00cd\7\25\2\2\u00cd\u00ce\5\60\31\2\u00ce/\3\2\2\2\u00cf"+
		"\u00d3\5\64\33\2\u00d0\u00d2\5\62\32\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\61\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\7\26\2\2\u00d7\u00d8\5\64\33\2\u00d8\63\3\2"+
		"\2\2\u00d9\u00e1\7\23\2\2\u00da\u00db\7\21\2\2\u00db\u00dc\5,\27\2\u00dc"+
		"\u00dd\7\22\2\2\u00dd\u00e1\3\2\2\2\u00de\u00e1\7\24\2\2\u00df\u00e1\5"+
		"\66\34\2\u00e0\u00d9\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\65\3\2\2\2\u00e2\u00e3\7\23\2\2\u00e3\u00e4\7\21"+
		"\2\2\u00e4\u00e5\7\22\2\2\u00e5\67\3\2\2\2\20;BGIToz\u0085\u0092\u0097"+
		"\u00b7\u00c9\u00d3\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}