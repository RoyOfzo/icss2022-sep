// Generated from C:/Users/rwitt/OneDrive - HAN/school jaar 3/app/compiler opdracht/icss2022-sep/startcode/src/main/antlr4/nl/han/ica/icss/parser/ICSS.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ICSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IF=4, ELSE=5, BOX_BRACKET_OPEN=6, BOX_BRACKET_CLOSE=7, 
		TRUE=8, FALSE=9, PIXELSIZE=10, PERCENTAGE=11, SCALAR=12, COLOR=13, ID_IDENT=14, 
		CLASS_IDENT=15, LOWER_IDENT=16, CAPITAL_IDENT=17, WS=18, COMMENT=19, OPEN_BRACE=20, 
		CLOSE_BRACE=21, SEMICOLON=22, COLON=23, PLUS=24, MIN=25, MUL=26, ASSIGNMENT_OPERATOR=27, 
		GREATER_THAN=28, LESS_THAN=29, TILDE=30, AT=31;
	public static final int
		RULE_stylesheet = 0, RULE_classSelector = 1, RULE_idSelector = 2, RULE_tagSelector = 3, 
		RULE_attributeSelector = 4, RULE_variableAssignment = 5, RULE_universalSelector = 6, 
		RULE_attribute = 7, RULE_pseudoClass = 8, RULE_pseudoElement = 9, RULE_atRule = 10, 
		RULE_variable = 11, RULE_bool = 12, RULE_scale = 13, RULE_percentage = 14, 
		RULE_pixelSize = 15, RULE_colorValue = 16, RULE_nonOperatorValues = 17, 
		RULE_operatorValues = 18, RULE_expression = 19, RULE_value = 20, RULE_property = 21, 
		RULE_declaration = 22, RULE_declarationBlock = 23, RULE_ifClause = 24, 
		RULE_elseClause = 25, RULE_stylerule = 26, RULE_statement = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "classSelector", "idSelector", "tagSelector", "attributeSelector", 
			"variableAssignment", "universalSelector", "attribute", "pseudoClass", 
			"pseudoElement", "atRule", "variable", "bool", "scale", "percentage", 
			"pixelSize", "colorValue", "nonOperatorValues", "operatorValues", "expression", 
			"value", "property", "declaration", "declarationBlock", "ifClause", "elseClause", 
			"stylerule", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'('", "')'", "'if'", "'else'", "'['", "']'", "'TRUE'", 
			"'FALSE'", null, null, null, null, null, null, null, null, null, null, 
			"'{'", "'}'", "';'", "':'", "'+'", "'-'", "'*'", "':='", "'>'", "'<'", 
			"'~'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IF", "ELSE", "BOX_BRACKET_OPEN", "BOX_BRACKET_CLOSE", 
			"TRUE", "FALSE", "PIXELSIZE", "PERCENTAGE", "SCALAR", "COLOR", "ID_IDENT", 
			"CLASS_IDENT", "LOWER_IDENT", "CAPITAL_IDENT", "WS", "COMMENT", "OPEN_BRACE", 
			"CLOSE_BRACE", "SEMICOLON", "COLON", "PLUS", "MIN", "MUL", "ASSIGNMENT_OPERATOR", 
			"GREATER_THAN", "LESS_THAN", "TILDE", "AT"
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
	public String getGrammarFileName() { return "ICSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ICSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ICSSParser.EOF, 0); }
		public List<VariableAssignmentContext> variableAssignment() {
			return getRuleContexts(VariableAssignmentContext.class);
		}
		public VariableAssignmentContext variableAssignment(int i) {
			return getRuleContext(VariableAssignmentContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StyleruleContext> stylerule() {
			return getRuleContexts(StyleruleContext.class);
		}
		public StyleruleContext stylerule(int i) {
			return getRuleContext(StyleruleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2214838338L) != 0)) {
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(56);
					variableAssignment();
					}
					break;
				case 2:
					{
					setState(57);
					statement();
					}
					break;
				case 3:
					{
					setState(58);
					stylerule();
					}
					break;
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends ParserRuleContext {
		public TerminalNode CLASS_IDENT() { return getToken(ICSSParser.CLASS_IDENT, 0); }
		public ClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSelectorContext classSelector() throws RecognitionException {
		ClassSelectorContext _localctx = new ClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(CLASS_IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends ParserRuleContext {
		public TerminalNode ID_IDENT() { return getToken(ICSSParser.ID_IDENT, 0); }
		public IdSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdSelectorContext idSelector() throws RecognitionException {
		IdSelectorContext _localctx = new IdSelectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID_IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagSelectorContext extends ParserRuleContext {
		public TerminalNode LOWER_IDENT() { return getToken(ICSSParser.LOWER_IDENT, 0); }
		public TerminalNode CAPITAL_IDENT() { return getToken(ICSSParser.CAPITAL_IDENT, 0); }
		public TagSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterTagSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitTagSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitTagSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagSelectorContext tagSelector() throws RecognitionException {
		TagSelectorContext _localctx = new TagSelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tagSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==LOWER_IDENT || _la==CAPITAL_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeSelectorContext extends ParserRuleContext {
		public TerminalNode BOX_BRACKET_OPEN() { return getToken(ICSSParser.BOX_BRACKET_OPEN, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode BOX_BRACKET_CLOSE() { return getToken(ICSSParser.BOX_BRACKET_CLOSE, 0); }
		public AttributeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterAttributeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitAttributeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitAttributeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSelectorContext attributeSelector() throws RecognitionException {
		AttributeSelectorContext _localctx = new AttributeSelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attributeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(BOX_BRACKET_OPEN);
			setState(73);
			attribute();
			setState(74);
			match(BOX_BRACKET_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(ICSSParser.ASSIGNMENT_OPERATOR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ICSSParser.SEMICOLON, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			variable();
			setState(77);
			match(ASSIGNMENT_OPERATOR);
			setState(78);
			value();
			setState(79);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UniversalSelectorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(ICSSParser.MUL, 0); }
		public UniversalSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universalSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterUniversalSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitUniversalSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitUniversalSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalSelectorContext universalSelector() throws RecognitionException {
		UniversalSelectorContext _localctx = new UniversalSelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_universalSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(MUL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(ICSSParser.ASSIGNMENT_OPERATOR, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public PseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitPseudoClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitPseudoClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pseudoClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			attribute();
			setState(86);
			match(ASSIGNMENT_OPERATOR);
			setState(87);
			property();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoElementContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(ICSSParser.ASSIGNMENT_OPERATOR, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public PseudoElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterPseudoElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitPseudoElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitPseudoElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoElementContext pseudoElement() throws RecognitionException {
		PseudoElementContext _localctx = new PseudoElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pseudoElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			attribute();
			setState(90);
			match(ASSIGNMENT_OPERATOR);
			setState(91);
			property();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ICSSParser.AT, 0); }
		public TerminalNode LOWER_IDENT() { return getToken(ICSSParser.LOWER_IDENT, 0); }
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(AT);
			setState(94);
			match(LOWER_IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode CAPITAL_IDENT() { return getToken(ICSSParser.CAPITAL_IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(96);
				match(T__0);
				}
			}

			setState(99);
			match(CAPITAL_IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ICSSParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ICSSParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScaleContext extends ParserRuleContext {
		public TerminalNode SCALAR() { return getToken(ICSSParser.SCALAR, 0); }
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(SCALAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PercentageContext extends ParserRuleContext {
		public TerminalNode PERCENTAGE() { return getToken(ICSSParser.PERCENTAGE, 0); }
		public PercentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterPercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitPercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitPercentage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentageContext percentage() throws RecognitionException {
		PercentageContext _localctx = new PercentageContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_percentage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(PERCENTAGE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PixelSizeContext extends ParserRuleContext {
		public TerminalNode PIXELSIZE() { return getToken(ICSSParser.PIXELSIZE, 0); }
		public PixelSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pixelSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterPixelSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitPixelSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitPixelSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PixelSizeContext pixelSize() throws RecognitionException {
		PixelSizeContext _localctx = new PixelSizeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pixelSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(PIXELSIZE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColorValueContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(ICSSParser.COLOR, 0); }
		public ColorValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitColorValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorValueContext colorValue() throws RecognitionException {
		ColorValueContext _localctx = new ColorValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_colorValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(COLOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NonOperatorValuesContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ColorValueContext colorValue() {
			return getRuleContext(ColorValueContext.class,0);
		}
		public NonOperatorValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonOperatorValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterNonOperatorValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitNonOperatorValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitNonOperatorValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonOperatorValuesContext nonOperatorValues() throws RecognitionException {
		NonOperatorValuesContext _localctx = new NonOperatorValuesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nonOperatorValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				{
				setState(111);
				bool();
				}
				break;
			case COLOR:
				{
				setState(112);
				colorValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorValuesContext extends ParserRuleContext {
		public PixelSizeContext pixelSize() {
			return getRuleContext(PixelSizeContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public TerminalNode CAPITAL_IDENT() { return getToken(ICSSParser.CAPITAL_IDENT, 0); }
		public OperatorValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterOperatorValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitOperatorValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitOperatorValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorValuesContext operatorValues() throws RecognitionException {
		OperatorValuesContext _localctx = new OperatorValuesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operatorValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIXELSIZE:
				{
				setState(115);
				pixelSize();
				}
				break;
			case PERCENTAGE:
				{
				setState(116);
				percentage();
				}
				break;
			case SCALAR:
				{
				setState(117);
				scale();
				}
				break;
			case CAPITAL_IDENT:
				{
				setState(118);
				match(CAPITAL_IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorValuesContext operatorValues() {
			return getRuleContext(OperatorValuesContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ICSSParser.MUL, 0); }
		public TerminalNode PLUS() { return getToken(ICSSParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(ICSSParser.MIN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(122);
				match(T__1);
				setState(123);
				expression(0);
				setState(124);
				match(T__2);
				}
				break;
			case PIXELSIZE:
			case PERCENTAGE:
			case SCALAR:
			case CAPITAL_IDENT:
				{
				setState(126);
				operatorValues();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(130);
						match(MUL);
						}
						setState(131);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(133);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MIN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NonOperatorValuesContext nonOperatorValues() {
			return getRuleContext(NonOperatorValuesContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case PIXELSIZE:
			case PERCENTAGE:
			case SCALAR:
			case CAPITAL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(140);
					match(T__0);
					}
				}

				setState(143);
				expression(0);
				}
				break;
			case TRUE:
			case FALSE:
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				nonOperatorValues();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode LOWER_IDENT() { return getToken(ICSSParser.LOWER_IDENT, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(LOWER_IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ICSSParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			property();
			setState(150);
			match(COLON);
			setState(151);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationBlockContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ICSSParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ICSSParser.SEMICOLON, i);
		}
		public List<IfClauseContext> ifClause() {
			return getRuleContexts(IfClauseContext.class);
		}
		public IfClauseContext ifClause(int i) {
			return getRuleContext(IfClauseContext.class,i);
		}
		public DeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitDeclarationBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationBlockContext declarationBlock() throws RecognitionException {
		DeclarationBlockContext _localctx = new DeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declarationBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(157);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LOWER_IDENT:
						{
						setState(153);
						declaration();
						setState(154);
						match(SEMICOLON);
						}
						break;
					case IF:
						{
						setState(156);
						ifClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOWER_IDENT) {
				{
				setState(162);
				declaration();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(163);
					match(SEMICOLON);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class IfClauseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ICSSParser.IF, 0); }
		public TerminalNode BOX_BRACKET_OPEN() { return getToken(ICSSParser.BOX_BRACKET_OPEN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode BOX_BRACKET_CLOSE() { return getToken(ICSSParser.BOX_BRACKET_CLOSE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ICSSParser.OPEN_BRACE, 0); }
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ICSSParser.CLOSE_BRACE, 0); }
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitIfClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfClauseContext ifClause() throws RecognitionException {
		IfClauseContext _localctx = new IfClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF);
			setState(169);
			match(BOX_BRACKET_OPEN);
			setState(170);
			variable();
			setState(171);
			match(BOX_BRACKET_CLOSE);
			setState(172);
			match(OPEN_BRACE);
			setState(173);
			declarationBlock();
			setState(174);
			match(CLOSE_BRACE);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(175);
				elseClause();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ICSSParser.ELSE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ICSSParser.OPEN_BRACE, 0); }
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ICSSParser.CLOSE_BRACE, 0); }
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ELSE);
			setState(179);
			match(OPEN_BRACE);
			setState(180);
			declarationBlock();
			setState(181);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleruleContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(ICSSParser.OPEN_BRACE, 0); }
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ICSSParser.CLOSE_BRACE, 0); }
		public List<ClassSelectorContext> classSelector() {
			return getRuleContexts(ClassSelectorContext.class);
		}
		public ClassSelectorContext classSelector(int i) {
			return getRuleContext(ClassSelectorContext.class,i);
		}
		public List<IdSelectorContext> idSelector() {
			return getRuleContexts(IdSelectorContext.class);
		}
		public IdSelectorContext idSelector(int i) {
			return getRuleContext(IdSelectorContext.class,i);
		}
		public List<TagSelectorContext> tagSelector() {
			return getRuleContexts(TagSelectorContext.class);
		}
		public TagSelectorContext tagSelector(int i) {
			return getRuleContext(TagSelectorContext.class,i);
		}
		public List<UniversalSelectorContext> universalSelector() {
			return getRuleContexts(UniversalSelectorContext.class);
		}
		public UniversalSelectorContext universalSelector(int i) {
			return getRuleContext(UniversalSelectorContext.class,i);
		}
		public List<AttributeSelectorContext> attributeSelector() {
			return getRuleContexts(AttributeSelectorContext.class);
		}
		public AttributeSelectorContext attributeSelector(int i) {
			return getRuleContext(AttributeSelectorContext.class,i);
		}
		public StyleruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylerule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylerule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylerule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitStylerule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleruleContext stylerule() throws RecognitionException {
		StyleruleContext _localctx = new StyleruleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_stylerule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS_IDENT:
					{
					setState(183);
					classSelector();
					}
					break;
				case ID_IDENT:
					{
					setState(184);
					idSelector();
					}
					break;
				case LOWER_IDENT:
				case CAPITAL_IDENT:
					{
					setState(185);
					tagSelector();
					}
					break;
				case MUL:
					{
					setState(186);
					universalSelector();
					}
					break;
				case BOX_BRACKET_OPEN:
					{
					setState(187);
					attributeSelector();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67354688L) != 0) );
			setState(192);
			match(OPEN_BRACE);
			setState(193);
			declarationBlock();
			setState(194);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			atRule();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000<\b\u0000\n\u0000"+
		"\f\u0000?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0003\u000bb\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011r\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012x\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0080\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0088\b\u0013\n\u0013\f\u0013\u008b\t\u0013"+
		"\u0001\u0014\u0003\u0014\u008e\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0092\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u009e\b\u0017\n\u0017\f\u0017\u00a1\t\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00a5\b\u0017\u0003\u0017\u00a7\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00b1\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0004\u001a\u00bd\b\u001a\u000b\u001a\f\u001a\u00be\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0000"+
		"\u0001&\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0003\u0001\u0000\u0010\u0011"+
		"\u0001\u0000\b\t\u0001\u0000\u0018\u0019\u00c1\u0000=\u0001\u0000\u0000"+
		"\u0000\u0002B\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006"+
		"F\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000"+
		"\u0000\fQ\u0001\u0000\u0000\u0000\u000eS\u0001\u0000\u0000\u0000\u0010"+
		"U\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014]\u0001"+
		"\u0000\u0000\u0000\u0016a\u0001\u0000\u0000\u0000\u0018e\u0001\u0000\u0000"+
		"\u0000\u001ag\u0001\u0000\u0000\u0000\u001ci\u0001\u0000\u0000\u0000\u001e"+
		"k\u0001\u0000\u0000\u0000 m\u0001\u0000\u0000\u0000\"q\u0001\u0000\u0000"+
		"\u0000$w\u0001\u0000\u0000\u0000&\u007f\u0001\u0000\u0000\u0000(\u0091"+
		"\u0001\u0000\u0000\u0000*\u0093\u0001\u0000\u0000\u0000,\u0095\u0001\u0000"+
		"\u0000\u0000.\u009f\u0001\u0000\u0000\u00000\u00a8\u0001\u0000\u0000\u0000"+
		"2\u00b2\u0001\u0000\u0000\u00004\u00bc\u0001\u0000\u0000\u00006\u00c4"+
		"\u0001\u0000\u0000\u00008<\u0003\n\u0005\u00009<\u00036\u001b\u0000:<"+
		"\u00034\u001a\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0000\u0000\u0001A\u0001\u0001\u0000\u0000\u0000"+
		"BC\u0005\u000f\u0000\u0000C\u0003\u0001\u0000\u0000\u0000DE\u0005\u000e"+
		"\u0000\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0007\u0000\u0000\u0000"+
		"G\u0007\u0001\u0000\u0000\u0000HI\u0005\u0006\u0000\u0000IJ\u0003\u000e"+
		"\u0007\u0000JK\u0005\u0007\u0000\u0000K\t\u0001\u0000\u0000\u0000LM\u0003"+
		"\u0016\u000b\u0000MN\u0005\u001b\u0000\u0000NO\u0003(\u0014\u0000OP\u0005"+
		"\u0016\u0000\u0000P\u000b\u0001\u0000\u0000\u0000QR\u0005\u001a\u0000"+
		"\u0000R\r\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u000f\u0001"+
		"\u0000\u0000\u0000UV\u0003\u000e\u0007\u0000VW\u0005\u001b\u0000\u0000"+
		"WX\u0003*\u0015\u0000X\u0011\u0001\u0000\u0000\u0000YZ\u0003\u000e\u0007"+
		"\u0000Z[\u0005\u001b\u0000\u0000[\\\u0003*\u0015\u0000\\\u0013\u0001\u0000"+
		"\u0000\u0000]^\u0005\u001f\u0000\u0000^_\u0005\u0010\u0000\u0000_\u0015"+
		"\u0001\u0000\u0000\u0000`b\u0005\u0001\u0000\u0000a`\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0011"+
		"\u0000\u0000d\u0017\u0001\u0000\u0000\u0000ef\u0007\u0001\u0000\u0000"+
		"f\u0019\u0001\u0000\u0000\u0000gh\u0005\f\u0000\u0000h\u001b\u0001\u0000"+
		"\u0000\u0000ij\u0005\u000b\u0000\u0000j\u001d\u0001\u0000\u0000\u0000"+
		"kl\u0005\n\u0000\u0000l\u001f\u0001\u0000\u0000\u0000mn\u0005\r\u0000"+
		"\u0000n!\u0001\u0000\u0000\u0000or\u0003\u0018\f\u0000pr\u0003 \u0010"+
		"\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r#\u0001\u0000"+
		"\u0000\u0000sx\u0003\u001e\u000f\u0000tx\u0003\u001c\u000e\u0000ux\u0003"+
		"\u001a\r\u0000vx\u0005\u0011\u0000\u0000ws\u0001\u0000\u0000\u0000wt\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x%\u0001\u0000\u0000\u0000yz\u0006\u0013\uffff\uffff\u0000z{\u0005\u0002"+
		"\u0000\u0000{|\u0003&\u0013\u0000|}\u0005\u0003\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~\u0080\u0003$\u0012\u0000\u007fy\u0001\u0000\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0089\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\n\u0004\u0000\u0000\u0082\u0083\u0005\u001a\u0000\u0000\u0083"+
		"\u0088\u0003&\u0013\u0005\u0084\u0085\n\u0003\u0000\u0000\u0085\u0086"+
		"\u0007\u0002\u0000\u0000\u0086\u0088\u0003&\u0013\u0004\u0087\u0081\u0001"+
		"\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u008b\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\'\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u008e\u0005\u0001\u0000\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0003&\u0013\u0000\u0090\u0092\u0003\"\u0011"+
		"\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092)\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0010\u0000\u0000"+
		"\u0094+\u0001\u0000\u0000\u0000\u0095\u0096\u0003*\u0015\u0000\u0096\u0097"+
		"\u0005\u0017\u0000\u0000\u0097\u0098\u0003(\u0014\u0000\u0098-\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0003,\u0016\u0000\u009a\u009b\u0005\u0016\u0000"+
		"\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009e\u00030\u0018\u0000"+
		"\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003,\u0016\u0000\u00a3"+
		"\u00a5\u0005\u0016\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"/\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0004\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0006\u0000\u0000\u00aa\u00ab\u0003\u0016\u000b\u0000\u00ab\u00ac"+
		"\u0005\u0007\u0000\u0000\u00ac\u00ad\u0005\u0014\u0000\u0000\u00ad\u00ae"+
		"\u0003.\u0017\u0000\u00ae\u00b0\u0005\u0015\u0000\u0000\u00af\u00b1\u0003"+
		"2\u0019\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b11\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0005\u0000"+
		"\u0000\u00b3\u00b4\u0005\u0014\u0000\u0000\u00b4\u00b5\u0003.\u0017\u0000"+
		"\u00b5\u00b6\u0005\u0015\u0000\u0000\u00b63\u0001\u0000\u0000\u0000\u00b7"+
		"\u00bd\u0003\u0002\u0001\u0000\u00b8\u00bd\u0003\u0004\u0002\u0000\u00b9"+
		"\u00bd\u0003\u0006\u0003\u0000\u00ba\u00bd\u0003\f\u0006\u0000\u00bb\u00bd"+
		"\u0003\b\u0004\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005"+
		"\u0014\u0000\u0000\u00c1\u00c2\u0003.\u0017\u0000\u00c2\u00c3\u0005\u0015"+
		"\u0000\u0000\u00c35\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\u0014\n"+
		"\u0000\u00c57\u0001\u0000\u0000\u0000\u0011;=aqw\u007f\u0087\u0089\u008d"+
		"\u0091\u009d\u009f\u00a4\u00a6\u00b0\u00bc\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}