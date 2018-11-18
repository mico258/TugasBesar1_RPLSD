// Generated from .\src\main\antlr4\com\rplsd\scheduling\schedule.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, CONFIGURATION=3, REQUIREMENT=4, AVAILIBILITY=5, CONSTRAINT=6, 
		WHITESPACE=7, NEWLINE=8, TITIK_KOMA=9, BRACKET_OPEN=10, BRACKET_CLOSE=11, 
		VERTICAL=12, NUMBER=13, CHAR=14, WORD=15, SENTENCE=16, BOOLEAN=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "CONFIGURATION", "REQUIREMENT", "AVAILIBILITY", "CONSTRAINT", 
		"WHITESPACE", "NEWLINE", "TITIK_KOMA", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"VERTICAL", "NUMBER", "CHAR", "WORD", "SENTENCE", "BOOLEAN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "CONFIGURATION", "REQUIREMENT", "AVAILIBILITY", "CONSTRAINT", 
		"WHITESPACE", "NEWLINE", "TITIK_KOMA", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"VERTICAL", "NUMBER", "CHAR", "WORD", "SENTENCE", "BOOLEAN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00fc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\7\4\61\n\4\f\4\16\4"+
		"\64\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6"+
		"\4E\n\4\r\4\16\4F\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4T\n\4"+
		"\r\4\16\4U\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4q\n\4\f\4\16\4t"+
		"\13\4\3\4\3\4\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u008b\n\5\r\5\16\5\u008c\3\5\3\5\3\5\3\6"+
		"\7\6\u0093\n\6\f\6\16\6\u0096\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\6\6\u00a6\n\6\r\6\16\6\u00a7\3\6\3\6\3\6\3\7\7\7"+
		"\u00ae\n\7\f\7\16\7\u00b1\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\6\7\u00bf\n\7\r\7\16\7\u00c0\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\5\t\u00d1\n\t\3\t\3\t\6\t\u00d5\n\t\r\t\16\t"+
		"\u00d6\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16\u00e4\n\16"+
		"\r\16\16\16\u00e5\3\17\5\17\u00e9\n\17\3\20\6\20\u00ec\n\20\r\20\16\20"+
		"\u00ed\3\21\3\21\7\21\u00f2\n\21\f\21\16\21\u00f5\13\21\6\21\u00f7\n\21"+
		"\r\21\16\21\u00f8\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\4\3\2\62;\3\2\62"+
		"\63\2\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5+\3\2\2\2\7\62\3\2\2\2\tz\3\2\2\2\13\u0094\3"+
		"\2\2\2\r\u00af\3\2\2\2\17\u00cb\3\2\2\2\21\u00d4\3\2\2\2\23\u00da\3\2"+
		"\2\2\25\u00dc\3\2\2\2\27\u00de\3\2\2\2\31\u00e0\3\2\2\2\33\u00e3\3\2\2"+
		"\2\35\u00e8\3\2\2\2\37\u00eb\3\2\2\2!\u00f6\3\2\2\2#\u00fa\3\2\2\2%&\7"+
		"d\2\2&\'\7g\2\2\'(\7i\2\2()\7k\2\2)*\7p\2\2*\4\3\2\2\2+,\7g\2\2,-\7p\2"+
		"\2-.\7f\2\2.\6\3\2\2\2/\61\5\17\b\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3"+
		"\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7e\2\2\66\67\7"+
		"q\2\2\678\7p\2\289\7h\2\29:\7k\2\2:;\7i\2\2;<\7w\2\2<=\7t\2\2=>\7c\2\2"+
		">?\7v\2\2?@\7k\2\2@A\7q\2\2AB\7p\2\2BD\3\2\2\2CE\5\17\b\2DC\3\2\2\2EF"+
		"\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7e\2\2IJ\7c\2\2JK\7r\2\2KL\7"+
		"c\2\2LM\7e\2\2MN\7k\2\2NO\7v\2\2OP\7{\2\2PQ\7?\2\2QS\3\2\2\2RT\5\33\16"+
		"\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VZ\3\2\2\2WY\5\17\b\2XW\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]a\5\31\r\2^`"+
		"\5\17\b\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2"+
		"de\7h\2\2ef\7c\2\2fg\7e\2\2gh\7k\2\2hi\7n\2\2ij\7k\2\2jk\7v\2\2kl\7{\2"+
		"\2lm\7?\2\2mr\3\2\2\2nq\5!\21\2oq\5\33\16\2pn\3\2\2\2po\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\5\23\n\2v\b\3\2\2\2wy\5"+
		"\17\b\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~"+
		"\7t\2\2~\177\7g\2\2\177\u0080\7s\2\2\u0080\u0081\7w\2\2\u0081\u0082\7"+
		"k\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7o\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u008b\5\17\b\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5!\21\2\u008f"+
		"\u0090\5\23\n\2\u0090\n\3\2\2\2\u0091\u0093\5\17\b\2\u0092\u0091\3\2\2"+
		"\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7c\2\2\u0098\u0099\7x\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7k\2\2\u009b\u009c\7n\2\2\u009c\u009d\7k\2\2"+
		"\u009d\u009e\7d\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7{\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a6\5\17\b\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5#\22\2\u00aa"+
		"\u00ab\5\23\n\2\u00ab\f\3\2\2\2\u00ac\u00ae\5\17\b\2\u00ad\u00ac\3\2\2"+
		"\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7q\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2\2"+
		"\u00b8\u00b9\7c\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\5\17\b\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\5\33\16\2\u00c3\u00c4\7<\2\2\u00c4\u00c5\5\33\16\2\u00c5"+
		"\u00c6\7\"\2\2\u00c6\u00c7\5\33\16\2\u00c7\u00c8\7<\2\2\u00c8\u00c9\5"+
		"\33\16\2\u00c9\u00ca\5\23\n\2\u00ca\16\3\2\2\2\u00cb\u00cc\7\"\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\b\b\2\2\u00ce\20\3\2\2\2\u00cf\u00d1\7\17\2"+
		"\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5"+
		"\7\f\2\2\u00d3\u00d5\7\17\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d3\3\2\2\2"+
		"\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\b\t\2\2\u00d9\22\3\2\2\2\u00da\u00db\7=\2\2\u00db"+
		"\24\3\2\2\2\u00dc\u00dd\7}\2\2\u00dd\26\3\2\2\2\u00de\u00df\7\177\2\2"+
		"\u00df\30\3\2\2\2\u00e0\u00e1\7~\2\2\u00e1\32\3\2\2\2\u00e2\u00e4\t\2"+
		"\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\34\3\2\2\2\u00e7\u00e9\4C|\2\u00e8\u00e7\3\2\2\2"+
		"\u00e9\36\3\2\2\2\u00ea\u00ec\5\35\17\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee \3\2\2\2\u00ef"+
		"\u00f3\5\37\20\2\u00f0\u00f2\5\17\b\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\"\3\2\2\2\u00fa\u00fb\t\3\2\2\u00fb$\3"+
		"\2\2\2\30\2\62FUZaprz\u008c\u0094\u00a7\u00af\u00c0\u00d0\u00d4\u00d6"+
		"\u00e5\u00e8\u00ed\u00f3\u00f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}