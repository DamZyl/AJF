import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JfkGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Odd_Numer_Okt=1, Odd_Number_Dec=2, Odd_Numer_Hex=3, LP=4, RP=5, POW=6, 
		MUL=7, DIV=8, MOD=9, ADD=10, SUB=11, WhiteSpace=12, NewLine=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", "Odd_Numer_Okt", 
		"Odd_Number_Dec", "Odd_Numer_Hex", "LP", "RP", "POW", "MUL", "DIV", "MOD", 
		"ADD", "SUB", "WhiteSpace", "NewLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'('", "')'", "'^'", "'*'", "'/'", "'%'", "'+'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Odd_Numer_Okt", "Odd_Number_Dec", "Odd_Numer_Hex", "LP", "RP", 
		"POW", "MUL", "DIV", "MOD", "ADD", "SUB", "WhiteSpace", "NewLine"
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


	public JfkGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AjfGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6\3"+
		"\6\3\6\3\7\3\7\6\79\n\7\r\7\16\7:\3\7\7\7>\n\7\f\7\16\7A\13\7\3\7\5\7"+
		"D\n\7\3\b\3\b\3\b\7\bI\n\b\f\b\16\bL\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\6\21b\n"+
		"\21\r\21\16\21c\3\21\3\21\3\22\3\22\6\22j\n\22\r\22\16\22k\3\22\3\22\2"+
		"\2\23\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35"+
		"\f\37\r!\16#\17\3\2\13\3\2\62\62\3\2\639\6\2\63\63\65\65\67\6799\7\2\63"+
		"\63\65\65\67\6799;;\3\2\63;\3\2\62;\3\2zz\5\2\62;CHch\r\2\63\63\65\65"+
		"\67\6799;;DDFFHHddffhh\2s\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2"+
		"\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21O\3\2"+
		"\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35[\3"+
		"\2\2\2\37]\3\2\2\2!a\3\2\2\2#i\3\2\2\2%&\7\"\2\2&\4\3\2\2\2\'(\7\13\2"+
		"\2(\6\3\2\2\2)*\7\f\2\2*\b\3\2\2\2+,\7\17\2\2,\n\3\2\2\2-\61\t\2\2\2."+
		"\60\t\3\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3"+
		"\2\2\2\63\61\3\2\2\2\64\65\t\4\2\2\65\f\3\2\2\2\66D\t\5\2\2\679\t\6\2"+
		"\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;?\3\2\2\2<>\t\7\2\2=<\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BD\t\5\2\2C\66\3"+
		"\2\2\2C8\3\2\2\2D\16\3\2\2\2EF\t\2\2\2FJ\t\b\2\2GI\t\t\2\2HG\3\2\2\2I"+
		"L\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\t\n\2\2N\20\3\2\2"+
		"\2OP\7*\2\2P\22\3\2\2\2QR\7+\2\2R\24\3\2\2\2ST\7`\2\2T\26\3\2\2\2UV\7"+
		",\2\2V\30\3\2\2\2WX\7\61\2\2X\32\3\2\2\2YZ\7\'\2\2Z\34\3\2\2\2[\\\7-\2"+
		"\2\\\36\3\2\2\2]^\7/\2\2^ \3\2\2\2_b\5\3\2\2`b\5\5\3\2a_\3\2\2\2a`\3\2"+
		"\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\b\21\2\2f\"\3\2\2\2gj\5"+
		"\t\5\2hj\5\7\4\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3"+
		"\2\2\2mn\b\22\2\2n$\3\2\2\2\f\2\61:?CJacik\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}