// Generated from /Users/tangbean/code/AI/AI-Code-Interpreter-Mask/ai-code-interpreter-mask/src/main/resources/org/tangbean/aicodeinterpretermask/grammers/ruby/Ruby.g4 by ANTLR 4.12.0
package org.tangbean.aicodeinterpretermask.grammers.ruby;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RubyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, REQUIRE=5, END=6, DEF=7, RETURN=8, 
		PIR=9, SUPER=10, IF=11, ELSE=12, ELSIF=13, UNLESS=14, WHILE=15, RETRY=16, 
		BREAK=17, FOR=18, TRUE=19, FALSE=20, PLUS=21, MINUS=22, MUL=23, DIV=24, 
		MOD=25, EXP=26, EQUAL=27, NOT_EQUAL=28, GREATER=29, LESS=30, LESS_EQUAL=31, 
		GREATER_EQUAL=32, ASSIGN=33, PLUS_ASSIGN=34, MINUS_ASSIGN=35, MUL_ASSIGN=36, 
		DIV_ASSIGN=37, MOD_ASSIGN=38, EXP_ASSIGN=39, BIT_AND=40, BIT_OR=41, BIT_XOR=42, 
		BIT_NOT=43, BIT_SHL=44, BIT_SHR=45, AND=46, OR=47, NOT=48, LEFT_RBRACKET=49, 
		RIGHT_RBRACKET=50, LEFT_SBRACKET=51, RIGHT_SBRACKET=52, NIL=53, SL_COMMENT=54, 
		ML_COMMENT=55, WS=56, INT=57, FLOAT=58, ID=59, ID_GLOBAL=60, ID_FUNCTION=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", 
			"END", "DEF", "RETURN", "PIR", "SUPER", "IF", "ELSE", "ELSIF", "UNLESS", 
			"WHILE", "RETRY", "BREAK", "FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", 
			"DIV", "MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", 
			"GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", 
			"BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", 
			"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "SL_COMMENT", 
			"ML_COMMENT", "WS", "INT", "FLOAT", "ID", "ID_GLOBAL", "ID_FUNCTION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "';'", null, "'require'", "'end'", "'def'", "'return'", 
			"'pir'", "'super'", "'if'", "'else'", "'elsif'", "'unless'", "'while'", 
			"'retry'", "'break'", "'for'", "'true'", "'false'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'**'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", 
			"'~'", "'<<'", "'>>'", null, null, null, "'('", "')'", "'['", "']'", 
			"'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", 
			"RETURN", "PIR", "SUPER", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", 
			"BREAK", "FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
			"EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
			"ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", 
			"BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", 
			"LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", 
			"WS", "INT", "FLOAT", "ID", "ID_GLOBAL", "ID_FUNCTION"
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


	public RubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ruby.g4"; }

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
		"\u0004\u0000=\u019b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0084\b\u0001\n"+
		"\u0001\f\u0001\u0087\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u008d\b\u0001\n\u0001\f\u0001\u0090\t\u0001\u0001\u0001"+
		"\u0003\u0001\u0093\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0003\u0004\u009a\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u013a\b.\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u0140\b/\u00010\u00010\u00010\u00010\u00030\u0146\b0\u0001"+
		"1\u00011\u00012\u00012\u00013\u00013\u00014\u00014\u00015\u00015\u0001"+
		"5\u00015\u00016\u00016\u00056\u0156\b6\n6\f6\u0159\t6\u00016\u00036\u015c"+
		"\b6\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00057\u0168\b7\n7\f7\u016b\t7\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00037\u0173\b7\u00017\u00017\u00018\u00048\u0178\b8\u000b8\f8\u0179"+
		"\u00018\u00018\u00019\u00049\u017f\b9\u000b9\f9\u0180\u0001:\u0005:\u0184"+
		"\b:\n:\f:\u0187\t:\u0001:\u0001:\u0004:\u018b\b:\u000b:\f:\u018c\u0001"+
		";\u0001;\u0005;\u0191\b;\n;\f;\u0194\t;\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0003\u0085\u008e\u0169\u0000>\u0001\u0000\u0003\u0001\u0005"+
		"\u0002\u0007\u0003\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0013"+
		"\t\u0015\n\u0017\u000b\u0019\f\u001b\r\u001d\u000e\u001f\u000f!\u0010"+
		"#\u0011%\u0012\'\u0013)\u0014+\u0015-\u0016/\u00171\u00183\u00195\u001a"+
		"7\u001b9\u001c;\u001d=\u001e?\u001fA C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/"+
		"a0c1e2g3i4k5m6o7q8s9u:w;y<{=\u0001\u0000\u0006\u0002\u0000\n\n\r\r\u0002"+
		"\u0000\t\t  \u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u0000??\u01ab\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001"+
		"\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000"+
		"\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000"+
		"[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001"+
		"\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000"+
		"\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000"+
		"i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001"+
		"\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000"+
		"\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0000"+
		"w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{\u0001"+
		"\u0000\u0000\u0000\u0001}\u0001\u0000\u0000\u0000\u0003\u0092\u0001\u0000"+
		"\u0000\u0000\u0005\u0094\u0001\u0000\u0000\u0000\u0007\u0096\u0001\u0000"+
		"\u0000\u0000\t\u0099\u0001\u0000\u0000\u0000\u000b\u009d\u0001\u0000\u0000"+
		"\u0000\r\u00a5\u0001\u0000\u0000\u0000\u000f\u00a9\u0001\u0000\u0000\u0000"+
		"\u0011\u00ad\u0001\u0000\u0000\u0000\u0013\u00b4\u0001\u0000\u0000\u0000"+
		"\u0015\u00b8\u0001\u0000\u0000\u0000\u0017\u00be\u0001\u0000\u0000\u0000"+
		"\u0019\u00c1\u0001\u0000\u0000\u0000\u001b\u00c6\u0001\u0000\u0000\u0000"+
		"\u001d\u00cc\u0001\u0000\u0000\u0000\u001f\u00d3\u0001\u0000\u0000\u0000"+
		"!\u00d9\u0001\u0000\u0000\u0000#\u00df\u0001\u0000\u0000\u0000%\u00e5"+
		"\u0001\u0000\u0000\u0000\'\u00e9\u0001\u0000\u0000\u0000)\u00ee\u0001"+
		"\u0000\u0000\u0000+\u00f4\u0001\u0000\u0000\u0000-\u00f6\u0001\u0000\u0000"+
		"\u0000/\u00f8\u0001\u0000\u0000\u00001\u00fa\u0001\u0000\u0000\u00003"+
		"\u00fc\u0001\u0000\u0000\u00005\u00fe\u0001\u0000\u0000\u00007\u0101\u0001"+
		"\u0000\u0000\u00009\u0104\u0001\u0000\u0000\u0000;\u0107\u0001\u0000\u0000"+
		"\u0000=\u0109\u0001\u0000\u0000\u0000?\u010b\u0001\u0000\u0000\u0000A"+
		"\u010e\u0001\u0000\u0000\u0000C\u0111\u0001\u0000\u0000\u0000E\u0113\u0001"+
		"\u0000\u0000\u0000G\u0116\u0001\u0000\u0000\u0000I\u0119\u0001\u0000\u0000"+
		"\u0000K\u011c\u0001\u0000\u0000\u0000M\u011f\u0001\u0000\u0000\u0000O"+
		"\u0122\u0001\u0000\u0000\u0000Q\u0126\u0001\u0000\u0000\u0000S\u0128\u0001"+
		"\u0000\u0000\u0000U\u012a\u0001\u0000\u0000\u0000W\u012c\u0001\u0000\u0000"+
		"\u0000Y\u012e\u0001\u0000\u0000\u0000[\u0131\u0001\u0000\u0000\u0000]"+
		"\u0139\u0001\u0000\u0000\u0000_\u013f\u0001\u0000\u0000\u0000a\u0145\u0001"+
		"\u0000\u0000\u0000c\u0147\u0001\u0000\u0000\u0000e\u0149\u0001\u0000\u0000"+
		"\u0000g\u014b\u0001\u0000\u0000\u0000i\u014d\u0001\u0000\u0000\u0000k"+
		"\u014f\u0001\u0000\u0000\u0000m\u0153\u0001\u0000\u0000\u0000o\u015f\u0001"+
		"\u0000\u0000\u0000q\u0177\u0001\u0000\u0000\u0000s\u017e\u0001\u0000\u0000"+
		"\u0000u\u0185\u0001\u0000\u0000\u0000w\u018e\u0001\u0000\u0000\u0000y"+
		"\u0195\u0001\u0000\u0000\u0000{\u0198\u0001\u0000\u0000\u0000}~\u0005"+
		"\\\u0000\u0000~\u007f\u0005\"\u0000\u0000\u007f\u0002\u0001\u0000\u0000"+
		"\u0000\u0080\u0085\u0005\"\u0000\u0000\u0081\u0084\u0003\u0001\u0000\u0000"+
		"\u0082\u0084\b\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u0093\u0005\"\u0000\u0000\u0089\u008e\u0005\'\u0000\u0000\u008a\u008d"+
		"\u0003\u0001\u0000\u0000\u008b\u008d\b\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0093\u0005\'\u0000\u0000\u0092\u0080\u0001\u0000"+
		"\u0000\u0000\u0092\u0089\u0001\u0000\u0000\u0000\u0093\u0004\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005,\u0000\u0000\u0095\u0006\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005;\u0000\u0000\u0097\b\u0001\u0000\u0000\u0000"+
		"\u0098\u009a\u0005\r\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\n\u0000\u0000\u009c\n\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005r\u0000\u0000\u009e\u009f\u0005e\u0000\u0000\u009f\u00a0\u0005q"+
		"\u0000\u0000\u00a0\u00a1\u0005u\u0000\u0000\u00a1\u00a2\u0005i\u0000\u0000"+
		"\u00a2\u00a3\u0005r\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4\f"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005e\u0000\u0000\u00a6\u00a7\u0005"+
		"n\u0000\u0000\u00a7\u00a8\u0005d\u0000\u0000\u00a8\u000e\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005d\u0000\u0000\u00aa\u00ab\u0005e\u0000\u0000\u00ab"+
		"\u00ac\u0005f\u0000\u0000\u00ac\u0010\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005r\u0000\u0000\u00ae\u00af\u0005e\u0000\u0000\u00af\u00b0\u0005t"+
		"\u0000\u0000\u00b0\u00b1\u0005u\u0000\u0000\u00b1\u00b2\u0005r\u0000\u0000"+
		"\u00b2\u00b3\u0005n\u0000\u0000\u00b3\u0012\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005p\u0000\u0000\u00b5\u00b6\u0005i\u0000\u0000\u00b6\u00b7\u0005"+
		"r\u0000\u0000\u00b7\u0014\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005s\u0000"+
		"\u0000\u00b9\u00ba\u0005u\u0000\u0000\u00ba\u00bb\u0005p\u0000\u0000\u00bb"+
		"\u00bc\u0005e\u0000\u0000\u00bc\u00bd\u0005r\u0000\u0000\u00bd\u0016\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005i\u0000\u0000\u00bf\u00c0\u0005f\u0000"+
		"\u0000\u00c0\u0018\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005e\u0000\u0000"+
		"\u00c2\u00c3\u0005l\u0000\u0000\u00c3\u00c4\u0005s\u0000\u0000\u00c4\u00c5"+
		"\u0005e\u0000\u0000\u00c5\u001a\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005"+
		"e\u0000\u0000\u00c7\u00c8\u0005l\u0000\u0000\u00c8\u00c9\u0005s\u0000"+
		"\u0000\u00c9\u00ca\u0005i\u0000\u0000\u00ca\u00cb\u0005f\u0000\u0000\u00cb"+
		"\u001c\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005u\u0000\u0000\u00cd\u00ce"+
		"\u0005n\u0000\u0000\u00ce\u00cf\u0005l\u0000\u0000\u00cf\u00d0\u0005e"+
		"\u0000\u0000\u00d0\u00d1\u0005s\u0000\u0000\u00d1\u00d2\u0005s\u0000\u0000"+
		"\u00d2\u001e\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005w\u0000\u0000\u00d4"+
		"\u00d5\u0005h\u0000\u0000\u00d5\u00d6\u0005i\u0000\u0000\u00d6\u00d7\u0005"+
		"l\u0000\u0000\u00d7\u00d8\u0005e\u0000\u0000\u00d8 \u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005r\u0000\u0000\u00da\u00db\u0005e\u0000\u0000\u00db"+
		"\u00dc\u0005t\u0000\u0000\u00dc\u00dd\u0005r\u0000\u0000\u00dd\u00de\u0005"+
		"y\u0000\u0000\u00de\"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005b\u0000"+
		"\u0000\u00e0\u00e1\u0005r\u0000\u0000\u00e1\u00e2\u0005e\u0000\u0000\u00e2"+
		"\u00e3\u0005a\u0000\u0000\u00e3\u00e4\u0005k\u0000\u0000\u00e4$\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005f\u0000\u0000\u00e6\u00e7\u0005o\u0000"+
		"\u0000\u00e7\u00e8\u0005r\u0000\u0000\u00e8&\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005t\u0000\u0000\u00ea\u00eb\u0005r\u0000\u0000\u00eb\u00ec\u0005"+
		"u\u0000\u0000\u00ec\u00ed\u0005e\u0000\u0000\u00ed(\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0005f\u0000\u0000\u00ef\u00f0\u0005a\u0000\u0000\u00f0"+
		"\u00f1\u0005l\u0000\u0000\u00f1\u00f2\u0005s\u0000\u0000\u00f2\u00f3\u0005"+
		"e\u0000\u0000\u00f3*\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005+\u0000"+
		"\u0000\u00f5,\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005-\u0000\u0000\u00f7"+
		".\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005*\u0000\u0000\u00f90\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005/\u0000\u0000\u00fb2\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005%\u0000\u0000\u00fd4\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005*\u0000\u0000\u00ff\u0100\u0005*\u0000\u0000\u01006\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005=\u0000\u0000\u0102\u0103\u0005=\u0000"+
		"\u0000\u01038\u0001\u0000\u0000\u0000\u0104\u0105\u0005!\u0000\u0000\u0105"+
		"\u0106\u0005=\u0000\u0000\u0106:\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		">\u0000\u0000\u0108<\u0001\u0000\u0000\u0000\u0109\u010a\u0005<\u0000"+
		"\u0000\u010a>\u0001\u0000\u0000\u0000\u010b\u010c\u0005<\u0000\u0000\u010c"+
		"\u010d\u0005=\u0000\u0000\u010d@\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		">\u0000\u0000\u010f\u0110\u0005=\u0000\u0000\u0110B\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005=\u0000\u0000\u0112D\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0005+\u0000\u0000\u0114\u0115\u0005=\u0000\u0000\u0115F\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0005-\u0000\u0000\u0117\u0118\u0005=\u0000"+
		"\u0000\u0118H\u0001\u0000\u0000\u0000\u0119\u011a\u0005*\u0000\u0000\u011a"+
		"\u011b\u0005=\u0000\u0000\u011bJ\u0001\u0000\u0000\u0000\u011c\u011d\u0005"+
		"/\u0000\u0000\u011d\u011e\u0005=\u0000\u0000\u011eL\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0005%\u0000\u0000\u0120\u0121\u0005=\u0000\u0000\u0121"+
		"N\u0001\u0000\u0000\u0000\u0122\u0123\u0005*\u0000\u0000\u0123\u0124\u0005"+
		"*\u0000\u0000\u0124\u0125\u0005=\u0000\u0000\u0125P\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0005&\u0000\u0000\u0127R\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0005|\u0000\u0000\u0129T\u0001\u0000\u0000\u0000\u012a\u012b\u0005"+
		"^\u0000\u0000\u012bV\u0001\u0000\u0000\u0000\u012c\u012d\u0005~\u0000"+
		"\u0000\u012dX\u0001\u0000\u0000\u0000\u012e\u012f\u0005<\u0000\u0000\u012f"+
		"\u0130\u0005<\u0000\u0000\u0130Z\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		">\u0000\u0000\u0132\u0133\u0005>\u0000\u0000\u0133\\\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0005a\u0000\u0000\u0135\u0136\u0005n\u0000\u0000\u0136"+
		"\u013a\u0005d\u0000\u0000\u0137\u0138\u0005&\u0000\u0000\u0138\u013a\u0005"+
		"&\u0000\u0000\u0139\u0134\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u013a^\u0001\u0000\u0000\u0000\u013b\u013c\u0005o\u0000\u0000"+
		"\u013c\u0140\u0005r\u0000\u0000\u013d\u013e\u0005|\u0000\u0000\u013e\u0140"+
		"\u0005|\u0000\u0000\u013f\u013b\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u0140`\u0001\u0000\u0000\u0000\u0141\u0142\u0005n\u0000"+
		"\u0000\u0142\u0143\u0005o\u0000\u0000\u0143\u0146\u0005t\u0000\u0000\u0144"+
		"\u0146\u0005!\u0000\u0000\u0145\u0141\u0001\u0000\u0000\u0000\u0145\u0144"+
		"\u0001\u0000\u0000\u0000\u0146b\u0001\u0000\u0000\u0000\u0147\u0148\u0005"+
		"(\u0000\u0000\u0148d\u0001\u0000\u0000\u0000\u0149\u014a\u0005)\u0000"+
		"\u0000\u014af\u0001\u0000\u0000\u0000\u014b\u014c\u0005[\u0000\u0000\u014c"+
		"h\u0001\u0000\u0000\u0000\u014d\u014e\u0005]\u0000\u0000\u014ej\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005n\u0000\u0000\u0150\u0151\u0005i\u0000"+
		"\u0000\u0151\u0152\u0005l\u0000\u0000\u0152l\u0001\u0000\u0000\u0000\u0153"+
		"\u0157\u0005#\u0000\u0000\u0154\u0156\b\u0000\u0000\u0000\u0155\u0154"+
		"\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015b"+
		"\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015c"+
		"\u0005\r\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0005"+
		"\n\u0000\u0000\u015en\u0001\u0000\u0000\u0000\u015f\u0160\u0005=\u0000"+
		"\u0000\u0160\u0161\u0005b\u0000\u0000\u0161\u0162\u0005e\u0000\u0000\u0162"+
		"\u0163\u0005g\u0000\u0000\u0163\u0164\u0005i\u0000\u0000\u0164\u0165\u0005"+
		"n\u0000\u0000\u0165\u0169\u0001\u0000\u0000\u0000\u0166\u0168\t\u0000"+
		"\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000"+
		"\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0005=\u0000\u0000\u016d\u016e\u0005e\u0000\u0000"+
		"\u016e\u016f\u0005n\u0000\u0000\u016f\u0170\u0005d\u0000\u0000\u0170\u0172"+
		"\u0001\u0000\u0000\u0000\u0171\u0173\u0005\r\u0000\u0000\u0172\u0171\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0005\n\u0000\u0000\u0175p\u0001\u0000"+
		"\u0000\u0000\u0176\u0178\u0007\u0001\u0000\u0000\u0177\u0176\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u00068\u0000\u0000\u017cr\u0001\u0000\u0000\u0000"+
		"\u017d\u017f\u0007\u0002\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0001\u0000\u0000\u0000\u0181t\u0001\u0000\u0000\u0000\u0182"+
		"\u0184\u0007\u0002\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184"+
		"\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185"+
		"\u0186\u0001\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187"+
		"\u0185\u0001\u0000\u0000\u0000\u0188\u018a\u0005.\u0000\u0000\u0189\u018b"+
		"\u0007\u0002\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018dv\u0001\u0000\u0000\u0000\u018e\u0192\u0007"+
		"\u0003\u0000\u0000\u018f\u0191\u0007\u0004\u0000\u0000\u0190\u018f\u0001"+
		"\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193x\u0001\u0000"+
		"\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0005$\u0000"+
		"\u0000\u0196\u0197\u0003w;\u0000\u0197z\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0003w;\u0000\u0199\u019a\u0007\u0005\u0000\u0000\u019a|\u0001"+
		"\u0000\u0000\u0000\u0013\u0000\u0083\u0085\u008c\u008e\u0092\u0099\u0139"+
		"\u013f\u0145\u0157\u015b\u0169\u0172\u0179\u0180\u0185\u018c\u0192\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}