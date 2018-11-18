// Generated from /Users/mico/RPLSD/src/main/antlr4/com/rplsd/scheduling/schedule.g4 by ANTLR 4.7
package main.antlr4.com.rplsd.scheduling;
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
		CONSTRAINT=8, WHITESPACE=9, NUMBER=10, CHAR=11, WORD=12, SENTENCE=13, 
		BOOLEAN=14, NEWLINE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "CONFIGURATION", "REQUIREMENT", "AVAILIBILITY", 
		"CONSTRAINT", "WHITESPACE", "NUMBER", "CHAR", "WORD", "SENTENCE", "BOOLEAN", 
		"NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'%'", "';'", null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "CONFIGURATION", "REQUIREMENT", "AVAILIBILITY", 
		"CONSTRAINT", "WHITESPACE", "NUMBER", "CHAR", "WORD", "SENTENCE", "BOOLEAN", 
		"NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\7\6\61\n\6\f\6\16\6\64\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6E\n"+
		"\6\r\6\16\6F\3\6\6\6J\n\6\r\6\16\6K\3\6\7\6O\n\6\f\6\16\6R\13\6\3\6\3"+
		"\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\3\6\3\6\3\7\7\7_\n\7\f\7\16\7b\13\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7q\n\7\r\7\16\7r\3"+
		"\7\3\7\3\7\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u008c\n\b\r\b\16\b\u008d\3\b\3\b\3\b\3\t"+
		"\7\t\u0094\n\t\f\t\16\t\u0097\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\6\t\u00a5\n\t\r\t\16\t\u00a6\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\6\13\u00b6\n\13\r\13\16\13\u00b7\3\f\5\f\u00bb"+
		"\n\f\3\r\6\r\u00be\n\r\r\r\16\r\u00bf\3\16\3\16\7\16\u00c4\n\16\f\16\16"+
		"\16\u00c7\13\16\6\16\u00c9\n\16\r\16\16\16\u00ca\3\17\3\17\3\20\5\20\u00d0"+
		"\n\20\3\20\3\20\6\20\u00d4\n\20\r\20\16\20\u00d5\2\2\21\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\4\3"+
		"\2\62;\3\2\62\63\2\u00e8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\3!\3\2\2\2\5\'\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13\62\3\2\2\2\r`\3\2"+
		"\2\2\17z\3\2\2\2\21\u0095\3\2\2\2\23\u00b0\3\2\2\2\25\u00b5\3\2\2\2\27"+
		"\u00ba\3\2\2\2\31\u00bd\3\2\2\2\33\u00c8\3\2\2\2\35\u00cc\3\2\2\2\37\u00d3"+
		"\3\2\2\2!\"\7d\2\2\"#\7g\2\2#$\7i\2\2$%\7k\2\2%&\7p\2\2&\4\3\2\2\2\'("+
		"\7g\2\2()\7p\2\2)*\7f\2\2*\6\3\2\2\2+,\7\'\2\2,\b\3\2\2\2-.\7=\2\2.\n"+
		"\3\2\2\2/\61\5\23\n\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7e\2\2\66\67\7q\2\2\678\7p\2"+
		"\289\7h\2\29:\7k\2\2:;\7i\2\2;<\7w\2\2<=\7t\2\2=>\7c\2\2>?\7v\2\2?@\7"+
		"k\2\2@A\7q\2\2AB\7p\2\2BD\3\2\2\2CE\5\23\n\2DC\3\2\2\2EF\3\2\2\2FD\3\2"+
		"\2\2FG\3\2\2\2GI\3\2\2\2HJ\5\25\13\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3"+
		"\2\2\2LP\3\2\2\2MO\5\23\n\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS"+
		"\3\2\2\2RP\3\2\2\2SW\7~\2\2TV\5\23\n\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2W"+
		"X\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\5\33\16\2[\\\7=\2\2\\\f\3\2\2\2]_\5\23"+
		"\n\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7t"+
		"\2\2de\7g\2\2ef\7s\2\2fg\7w\2\2gh\7k\2\2hi\7t\2\2ij\7g\2\2jk\7o\2\2kl"+
		"\7g\2\2lm\7p\2\2mn\7v\2\2np\3\2\2\2oq\5\23\n\2po\3\2\2\2qr\3\2\2\2rp\3"+
		"\2\2\2rs\3\2\2\2st\3\2\2\2tu\5\33\16\2uv\7=\2\2v\16\3\2\2\2wy\5\23\n\2"+
		"xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7c\2\2"+
		"~\177\7x\2\2\177\u0080\7c\2\2\u0080\u0081\7k\2\2\u0081\u0082\7n\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\7d\2\2\u0084\u0085\7k\2\2\u0085\u0086\7n\2\2"+
		"\u0086\u0087\7k\2\2\u0087\u0088\7v\2\2\u0088\u0089\7{\2\2\u0089\u008b"+
		"\3\2\2\2\u008a\u008c\5\23\n\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\5\35\17\2\u0090\u0091\7=\2\2\u0091\20\3\2\2\2\u0092\u0094\5\23\n\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7e\2\2\u0099"+
		"\u009a\7q\2\2\u009a\u009b\7p\2\2\u009b\u009c\7u\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\5\23\n\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5\25\13\2\u00a9\u00aa\7<\2\2\u00aa"+
		"\u00ab\5\25\13\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\5\25\13\2\u00ad\u00ae"+
		"\7<\2\2\u00ae\u00af\5\25\13\2\u00af\22\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\b\n\2\2\u00b3\24\3\2\2\2\u00b4\u00b6\t\2\2"+
		"\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\26\3\2\2\2\u00b9\u00bb\4C|\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\30\3\2\2\2\u00bc\u00be\5\27\f\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2"+
		"\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\32\3\2\2\2\u00c1\u00c5"+
		"\5\31\r\2\u00c2\u00c4\5\23\n\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\34\3\2\2\2\u00cc\u00cd\t\3\2\2\u00cd\36\3\2\2\2\u00ce"+
		"\u00d0\7\17\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d4\7\f\2\2\u00d2\u00d4\7\17\2\2\u00d3\u00cf\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6 \3\2\2\2\26\2\62FKPW`rz\u008d\u0095\u00a6\u00b7\u00ba\u00bf"+
		"\u00c5\u00ca\u00cf\u00d3\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}