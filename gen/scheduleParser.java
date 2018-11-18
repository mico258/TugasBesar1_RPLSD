// Generated from D:/informatika/semester7/rplsd/TugasBesar1_RPLSD\schedule.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scheduleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, CONFIGURATION=5, REQUIREMENT=6, AVAILIBILITY=7, 
		WHITESPACE=8, NUMBER=9, CHAR=10, WORD=11, SENTENCE=12, BOOLEAN=13, NEWLINE=14;
	public static final int
		RULE_schedule = 0, RULE_kelas = 1, RULE_matkul = 2, RULE_fitur = 3, RULE_configuration = 4, 
		RULE_requirement = 5, RULE_availibility = 6;
	public static final String[] ruleNames = {
		"schedule", "kelas", "matkul", "fitur", "configuration", "requirement", 
		"availibility"
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

	@Override
	public String getGrammarFileName() { return "schedule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public scheduleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScheduleContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(scheduleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(scheduleParser.NEWLINE, i);
		}
		public List<KelasContext> kelas() {
			return getRuleContexts(KelasContext.class);
		}
		public KelasContext kelas(int i) {
			return getRuleContext(KelasContext.class,i);
		}
		public ScheduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schedule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).enterSchedule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).exitSchedule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scheduleVisitor ) return ((scheduleVisitor<? extends T>)visitor).visitSchedule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScheduleContext schedule() throws RecognitionException {
		ScheduleContext _localctx = new ScheduleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_schedule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(15);
				match(NEWLINE);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				kelas();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(26);
				match(NEWLINE);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(T__1);
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

	public static class KelasContext extends ParserRuleContext {
		public MatkulContext matkul() {
			return getRuleContext(MatkulContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(scheduleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(scheduleParser.NEWLINE, i);
		}
		public List<FiturContext> fitur() {
			return getRuleContexts(FiturContext.class);
		}
		public FiturContext fitur(int i) {
			return getRuleContext(FiturContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(scheduleParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(scheduleParser.WHITESPACE, i);
		}
		public KelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).enterKelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).exitKelas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scheduleVisitor ) return ((scheduleVisitor<? extends T>)visitor).visitKelas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KelasContext kelas() throws RecognitionException {
		KelasContext _localctx = new KelasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_kelas);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			matkul();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(35);
				match(NEWLINE);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				fitur();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONFIGURATION) | (1L << REQUIREMENT) | (1L << AVAILIBILITY))) != 0) );
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(46);
				match(WHITESPACE);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(52);
			match(T__2);
			}
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					match(NEWLINE);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class MatkulContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(scheduleParser.WORD, 0); }
		public MatkulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matkul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).enterMatkul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).exitMatkul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scheduleVisitor ) return ((scheduleVisitor<? extends T>)visitor).visitMatkul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatkulContext matkul() throws RecognitionException {
		MatkulContext _localctx = new MatkulContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_matkul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(WORD);
			setState(60);
			match(T__3);
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

	public static class FiturContext extends ParserRuleContext {
		public ConfigurationContext configuration() {
			return getRuleContext(ConfigurationContext.class,0);
		}
		public RequirementContext requirement() {
			return getRuleContext(RequirementContext.class,0);
		}
		public AvailibilityContext availibility() {
			return getRuleContext(AvailibilityContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(scheduleParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(scheduleParser.WHITESPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(scheduleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(scheduleParser.NEWLINE, i);
		}
		public FiturContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fitur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).enterFitur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).exitFitur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scheduleVisitor ) return ((scheduleVisitor<? extends T>)visitor).visitFitur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiturContext fitur() throws RecognitionException {
		FiturContext _localctx = new FiturContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fitur);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONFIGURATION:
				{
				setState(62);
				configuration();
				}
				break;
			case REQUIREMENT:
				{
				setState(63);
				requirement();
				}
				break;
			case AVAILIBILITY:
				{
				setState(64);
				availibility();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(WHITESPACE);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(73);
				match(NEWLINE);
				}
				}
				setState(78);
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

	public static class ConfigurationContext extends ParserRuleContext {
		public TerminalNode CONFIGURATION() { return getToken(scheduleParser.CONFIGURATION, 0); }
		public ConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).enterConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).exitConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scheduleVisitor ) return ((scheduleVisitor<? extends T>)visitor).visitConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigurationContext configuration() throws RecognitionException {
		ConfigurationContext _localctx = new ConfigurationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_configuration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(CONFIGURATION);
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

	public static class RequirementContext extends ParserRuleContext {
		public TerminalNode REQUIREMENT() { return getToken(scheduleParser.REQUIREMENT, 0); }
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scheduleVisitor ) return ((scheduleVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(REQUIREMENT);
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

	public static class AvailibilityContext extends ParserRuleContext {
		public TerminalNode AVAILIBILITY() { return getToken(scheduleParser.AVAILIBILITY, 0); }
		public AvailibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).enterAvailibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scheduleListener ) ((scheduleListener)listener).exitAvailibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scheduleVisitor ) return ((scheduleVisitor<? extends T>)visitor).visitAvailibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvailibilityContext availibility() throws RecognitionException {
		AvailibilityContext _localctx = new AvailibilityContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_availibility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(AVAILIBILITY);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\23\n\2\f\2\16\2"+
		"\26\13\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2"+
		"\3\2\3\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\6\3-\n\3\r\3\16\3.\3\3\7\3\62"+
		"\n\3\f\3\16\3\65\13\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\5\5D\n\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\7\5M\n\5\f\5\16\5P\13"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2[\2\20\3\2\2"+
		"\2\4$\3\2\2\2\6=\3\2\2\2\bC\3\2\2\2\nQ\3\2\2\2\fS\3\2\2\2\16U\3\2\2\2"+
		"\20\24\7\3\2\2\21\23\7\20\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2"+
		"\2\24\25\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\27\31\5\4\3\2\30\27\3\2\2"+
		"\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\37\3\2\2\2\34\36\7\20"+
		"\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37"+
		"\3\2\2\2\"#\7\4\2\2#\3\3\2\2\2$(\5\6\4\2%\'\7\20\2\2&%\3\2\2\2\'*\3\2"+
		"\2\2(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2\2\2+-\5\b\5\2,+\3\2\2\2-.\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\63\3\2\2\2\60\62\7\n\2\2\61\60\3\2\2\2\62\65"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66:\7"+
		"\5\2\2\679\7\20\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5\3\2\2"+
		"\2<:\3\2\2\2=>\7\r\2\2>?\7\6\2\2?\7\3\2\2\2@D\5\n\6\2AD\5\f\7\2BD\5\16"+
		"\b\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DH\3\2\2\2EG\7\n\2\2FE\3\2\2\2GJ\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2IN\3\2\2\2JH\3\2\2\2KM\7\20\2\2LK\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PN\3\2\2\2QR\7\7\2\2R\13\3\2\2\2"+
		"ST\7\b\2\2T\r\3\2\2\2UV\7\t\2\2V\17\3\2\2\2\f\24\32\37(.\63:CHN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}