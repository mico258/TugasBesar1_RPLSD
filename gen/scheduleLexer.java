// Generated from D:/informatika/semester7/rplsd/TugasBesar1_RPLSD\schedule.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scheduleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, CONFIGURATION=5, REQUIREMENT=6, AVAILIBILITY=7, 
		WHITESPACE=8, NUMBER=9, CHAR=10, WORD=11, SENTENCE=12, BOOLEAN=13, NEWLINE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "CONFIGURATION", "REQUIREMENT", "AVAILIBILITY", 
		"WHITESPACE", "NUMBER", "CHAR", "WORD", "SENTENCE", "BOOLEAN", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'%'", "';'", null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "CONFIGURATION", "REQUIREMENT", "AVAILIBILITY", 
		"WHITESPACE", "NUMBER", "CHAR", "WORD", "SENTENCE", "BOOLEAN", "NEWLINE"
	};
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


	public scheduleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "schedule.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6C\n\6\r\6\16\6D"+
		"\3\6\6\6H\n\6\r\6\16\6I\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6\7\6T\n\6\f"+
		"\6\16\6W\13\6\3\6\3\6\3\6\3\7\7\7]\n\7\f\7\16\7`\13\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7o\n\7\r\7\16\7p\3\7\3\7\3\7\3"+
		"\b\7\bw\n\b\f\b\16\bz\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\6\b\u008a\n\b\r\b\16\b\u008b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\6\n\u0096\n\n\r\n\16\n\u0097\3\13\5\13\u009b\n\13\3\f\6\f\u009e\n"+
		"\f\r\f\16\f\u009f\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13\r\6\r\u00a9"+
		"\n\r\r\r\16\r\u00aa\3\16\3\16\3\17\5\17\u00b0\n\17\3\17\3\17\6\17\u00b4"+
		"\n\17\r\17\16\17\u00b5\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\3\2\4\3\2\62;\3\2\62\63\2\u00c6\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5%\3\2\2\2\7)\3\2\2\2\t+\3\2"+
		"\2\2\13\60\3\2\2\2\r^\3\2\2\2\17x\3\2\2\2\21\u0090\3\2\2\2\23\u0095\3"+
		"\2\2\2\25\u009a\3\2\2\2\27\u009d\3\2\2\2\31\u00a8\3\2\2\2\33\u00ac\3\2"+
		"\2\2\35\u00b3\3\2\2\2\37 \7d\2\2 !\7g\2\2!\"\7i\2\2\"#\7k\2\2#$\7p\2\2"+
		"$\4\3\2\2\2%&\7g\2\2&\'\7p\2\2\'(\7f\2\2(\6\3\2\2\2)*\7\'\2\2*\b\3\2\2"+
		"\2+,\7=\2\2,\n\3\2\2\2-/\5\21\t\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60"+
		"\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7e\2\2\64\65\7q\2\2\65\66"+
		"\7p\2\2\66\67\7h\2\2\678\7k\2\289\7i\2\29:\7w\2\2:;\7t\2\2;<\7c\2\2<="+
		"\7v\2\2=>\7k\2\2>?\7q\2\2?@\7p\2\2@B\3\2\2\2AC\5\21\t\2BA\3\2\2\2CD\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\5\23\n\2GF\3\2\2\2HI\3\2\2\2IG"+
		"\3\2\2\2IJ\3\2\2\2JN\3\2\2\2KM\5\21\t\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QU\7~\2\2RT\5\21\t\2SR\3\2\2\2TW\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\5\31\r\2YZ\7=\2\2Z\f\3\2\2"+
		"\2[]\5\21\t\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3"+
		"\2\2\2ab\7t\2\2bc\7g\2\2cd\7s\2\2de\7w\2\2ef\7k\2\2fg\7t\2\2gh\7g\2\2"+
		"hi\7o\2\2ij\7g\2\2jk\7p\2\2kl\7v\2\2ln\3\2\2\2mo\5\21\t\2nm\3\2\2\2op"+
		"\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\5\31\r\2st\7=\2\2t\16\3\2\2\2"+
		"uw\5\21\t\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2"+
		"\2{|\7c\2\2|}\7x\2\2}~\7c\2\2~\177\7k\2\2\177\u0080\7n\2\2\u0080\u0081"+
		"\7k\2\2\u0081\u0082\7d\2\2\u0082\u0083\7k\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7v\2\2\u0086\u0087\7{\2\2\u0087\u0089\3\2\2"+
		"\2\u0088\u008a\5\21\t\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\33"+
		"\16\2\u008e\u008f\7=\2\2\u008f\20\3\2\2\2\u0090\u0091\7\"\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\b\t\2\2\u0093\22\3\2\2\2\u0094\u0096\t\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\24\3\2\2\2\u0099\u009b\4C|\2\u009a\u0099\3\2\2\2\u009b\26\3"+
		"\2\2\2\u009c\u009e\5\25\13\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\30\3\2\2\2\u00a1\u00a5\5\27\f"+
		"\2\u00a2\u00a4\5\21\t\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a1\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\32\3\2\2\2\u00ac\u00ad\t\3\2\2\u00ad\34\3\2\2\2\u00ae"+
		"\u00b0\7\17\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00b4\7\f\2\2\u00b2\u00b4\7\17\2\2\u00b3\u00af\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\36\3\2\2\2\24\2\60DINU^px\u008b\u0097\u009a\u009f\u00a5\u00aa"+
		"\u00af\u00b3\u00b5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}