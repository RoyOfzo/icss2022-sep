// Generated from C:/Users/rwitt/OneDrive - HAN/school jaar 3/app/compiler opdracht/icss2022-sep/startcode/src/main/antlr4/nl/han/ica/icss/parser/ICSS.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ICSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IF=2, ELSE=3, BOX_BRACKET_OPEN=4, BOX_BRACKET_CLOSE=5, TRUE=6, 
		FALSE=7, PIXELSIZE=8, PERCENTAGE=9, SCALAR=10, COLOR=11, ID_IDENT=12, 
		CLASS_IDENT=13, LOWER_IDENT=14, CAPITAL_IDENT=15, WS=16, COMMENT=17, OPEN_BRACE=18, 
		CLOSE_BRACE=19, SEMICOLON=20, COLON=21, PLUS=22, MIN=23, MUL=24, ASSIGNMENT_OPERATOR=25, 
		GREATER_THAN=26, LESS_THAN=27, TILDE=28, AT=29, OPEN_PARENTHESES=30, CLOSE_PARENTHESES=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "IF", "ELSE", "BOX_BRACKET_OPEN", "BOX_BRACKET_CLOSE", "TRUE", 
			"FALSE", "PIXELSIZE", "PERCENTAGE", "SCALAR", "COLOR", "ID_IDENT", "CLASS_IDENT", 
			"LOWER_IDENT", "CAPITAL_IDENT", "WS", "COMMENT", "OPEN_BRACE", "CLOSE_BRACE", 
			"SEMICOLON", "COLON", "PLUS", "MIN", "MUL", "ASSIGNMENT_OPERATOR", "GREATER_THAN", 
			"LESS_THAN", "TILDE", "AT", "OPEN_PARENTHESES", "CLOSE_PARENTHESES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'if'", "'else'", "'['", "']'", "'TRUE'", "'FALSE'", null, 
			null, null, null, null, null, null, null, null, null, "'{'", "'}'", "';'", 
			"':'", "'+'", "'-'", "'*'", "':='", "'>'", "'<'", "'~'", "'@'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IF", "ELSE", "BOX_BRACKET_OPEN", "BOX_BRACKET_CLOSE", "TRUE", 
			"FALSE", "PIXELSIZE", "PERCENTAGE", "SCALAR", "COLOR", "ID_IDENT", "CLASS_IDENT", 
			"LOWER_IDENT", "CAPITAL_IDENT", "WS", "COMMENT", "OPEN_BRACE", "CLOSE_BRACE", 
			"SEMICOLON", "COLON", "PLUS", "MIN", "MUL", "ASSIGNMENT_OPERATOR", "GREATER_THAN", 
			"LESS_THAN", "TILDE", "AT", "OPEN_PARENTHESES", "CLOSE_PARENTHESES"
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


	public ICSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ICSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u00bd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007Z\b\u0007"+
		"\u000b\u0007\f\u0007[\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004"+
		"\bb\b\b\u000b\b\f\bc\u0001\b\u0001\b\u0001\t\u0004\ti\b\t\u000b\t\f\t"+
		"j\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0004\u000bw\b\u000b\u000b\u000b\f\u000bx\u0001\f\u0001"+
		"\f\u0004\f}\b\f\u000b\f\f\f~\u0001\r\u0001\r\u0005\r\u0083\b\r\n\r\f\r"+
		"\u0086\t\r\u0001\u000e\u0001\u000e\u0005\u000e\u008a\b\u000e\n\u000e\f"+
		"\u000e\u008d\t\u000e\u0001\u000f\u0004\u000f\u0090\b\u000f\u000b\u000f"+
		"\f\u000f\u0091\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u009a\b\u0010\n\u0010\f\u0010\u009d\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0000\u0000\u001f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f\u0001\u0000\b\u0001\u000009\u0002\u000009af\u0003\u0000"+
		"--09az\u0001\u0000az\u0001\u0000AZ\u0004\u000009AZ__az\u0003\u0000\t\n"+
		"\r\r  \u0002\u0000\n\n\r\r\u00c5\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?\u0001\u0000"+
		"\u0000\u0000\u0003A\u0001\u0000\u0000\u0000\u0005D\u0001\u0000\u0000\u0000"+
		"\u0007I\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bM\u0001"+
		"\u0000\u0000\u0000\rR\u0001\u0000\u0000\u0000\u000fY\u0001\u0000\u0000"+
		"\u0000\u0011a\u0001\u0000\u0000\u0000\u0013h\u0001\u0000\u0000\u0000\u0015"+
		"l\u0001\u0000\u0000\u0000\u0017t\u0001\u0000\u0000\u0000\u0019z\u0001"+
		"\u0000\u0000\u0000\u001b\u0080\u0001\u0000\u0000\u0000\u001d\u0087\u0001"+
		"\u0000\u0000\u0000\u001f\u008f\u0001\u0000\u0000\u0000!\u0095\u0001\u0000"+
		"\u0000\u0000#\u00a0\u0001\u0000\u0000\u0000%\u00a2\u0001\u0000\u0000\u0000"+
		"\'\u00a4\u0001\u0000\u0000\u0000)\u00a6\u0001\u0000\u0000\u0000+\u00a8"+
		"\u0001\u0000\u0000\u0000-\u00aa\u0001\u0000\u0000\u0000/\u00ac\u0001\u0000"+
		"\u0000\u00001\u00ae\u0001\u0000\u0000\u00003\u00b1\u0001\u0000\u0000\u0000"+
		"5\u00b3\u0001\u0000\u0000\u00007\u00b5\u0001\u0000\u0000\u00009\u00b7"+
		"\u0001\u0000\u0000\u0000;\u00b9\u0001\u0000\u0000\u0000=\u00bb\u0001\u0000"+
		"\u0000\u0000?@\u0005!\u0000\u0000@\u0002\u0001\u0000\u0000\u0000AB\u0005"+
		"i\u0000\u0000BC\u0005f\u0000\u0000C\u0004\u0001\u0000\u0000\u0000DE\u0005"+
		"e\u0000\u0000EF\u0005l\u0000\u0000FG\u0005s\u0000\u0000GH\u0005e\u0000"+
		"\u0000H\u0006\u0001\u0000\u0000\u0000IJ\u0005[\u0000\u0000J\b\u0001\u0000"+
		"\u0000\u0000KL\u0005]\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u0005T"+
		"\u0000\u0000NO\u0005R\u0000\u0000OP\u0005U\u0000\u0000PQ\u0005E\u0000"+
		"\u0000Q\f\u0001\u0000\u0000\u0000RS\u0005F\u0000\u0000ST\u0005A\u0000"+
		"\u0000TU\u0005L\u0000\u0000UV\u0005S\u0000\u0000VW\u0005E\u0000\u0000"+
		"W\u000e\u0001\u0000\u0000\u0000XZ\u0007\u0000\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005p\u0000\u0000^_\u0005"+
		"x\u0000\u0000_\u0010\u0001\u0000\u0000\u0000`b\u0007\u0000\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005%\u0000"+
		"\u0000f\u0012\u0001\u0000\u0000\u0000gi\u0007\u0000\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000k\u0014\u0001\u0000\u0000\u0000lm\u0005#\u0000"+
		"\u0000mn\u0007\u0001\u0000\u0000no\u0007\u0001\u0000\u0000op\u0007\u0001"+
		"\u0000\u0000pq\u0007\u0001\u0000\u0000qr\u0007\u0001\u0000\u0000rs\u0007"+
		"\u0001\u0000\u0000s\u0016\u0001\u0000\u0000\u0000tv\u0005#\u0000\u0000"+
		"uw\u0007\u0002\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0018\u0001"+
		"\u0000\u0000\u0000z|\u0005.\u0000\u0000{}\u0007\u0002\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u001a\u0001\u0000\u0000\u0000\u0080"+
		"\u0084\u0007\u0003\u0000\u0000\u0081\u0083\u0007\u0002\u0000\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u001c\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u008b\u0007\u0004\u0000\u0000\u0088\u008a\u0007\u0005\u0000\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u001e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e"+
		"\u0090\u0007\u0006\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0006\u000f\u0000\u0000\u0094 \u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005/\u0000\u0000\u0096\u0097\u0005/\u0000\u0000\u0097\u009b\u0001\u0000"+
		"\u0000\u0000\u0098\u009a\b\u0007\u0000\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0006\u0010\u0000"+
		"\u0000\u009f\"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005{\u0000\u0000"+
		"\u00a1$\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005}\u0000\u0000\u00a3&"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005;\u0000\u0000\u00a5(\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005:\u0000\u0000\u00a7*\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005+\u0000\u0000\u00a9,\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005-\u0000\u0000\u00ab.\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005*"+
		"\u0000\u0000\u00ad0\u0001\u0000\u0000\u0000\u00ae\u00af\u0005:\u0000\u0000"+
		"\u00af\u00b0\u0005=\u0000\u0000\u00b02\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005>\u0000\u0000\u00b24\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005<"+
		"\u0000\u0000\u00b46\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005~\u0000\u0000"+
		"\u00b68\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005@\u0000\u0000\u00b8:"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005(\u0000\u0000\u00ba<\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005)\u0000\u0000\u00bc>\u0001\u0000\u0000\u0000"+
		"\n\u0000[cjx~\u0084\u008b\u0091\u009b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}