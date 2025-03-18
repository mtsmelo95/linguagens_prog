// Generated from /Users/matheusmelo/repository/linguagens_prog/.antlr/XMLLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class XMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN=7, XMLDeclOpen=8, 
		TEXT=9, CLOSE=10, SPECIAL_CLOSE=11, SLASH_CLOSE=12, SLASH=13, EQUALS=14, 
		STRING=15, Name=16, S=17, PI=18;
	public static final int
		INSIDE=1, PROC_INSTR=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE", "PROC_INSTR"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "SPECIAL_OPEN", "TEXT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", 
			"SLASH", "EQUALS", "STRING", "Name", "S", "HEXDIGIT", "DIGIT", "NameChar", 
			"NameStartChar", "PI", "IGNORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'<'", null, null, "'>'", null, 
			"'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "TEXT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", 
			"EQUALS", "STRING", "Name", "S", "PI"
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


	public XMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XMLLexer.g4"; }

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
		"\u0004\u0000\u0012\u00e7\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff"+
		"\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007"+
		"\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007"+
		"\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b"+
		"\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002"+
		"\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002"+
		"\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002"+
		"\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000:\b\u0000\n\u0000"+
		"\f\u0000=\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001N\b"+
		"\u0001\n\u0001\f\u0001Q\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002[\b"+
		"\u0002\n\u0002\f\u0002^\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004l\b\u0004\u000b\u0004\f\u0004"+
		"m\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004w\b\u0004\u000b\u0004\f\u0004x\u0001\u0004\u0001"+
		"\u0004\u0003\u0004}\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u0081"+
		"\b\u0005\u0001\u0005\u0004\u0005\u0084\b\u0005\u000b\u0005\f\u0005\u0085"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0004\t\u009f\b\t\u000b\t\f\t\u00a0\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00b7\b\u000f\n"+
		"\u000f\f\u000f\u00ba\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00bf\b\u000f\n\u000f\f\u000f\u00c2\t\u000f\u0001\u000f\u0003\u000f"+
		"\u00c5\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u00c9\b\u0010\n\u0010"+
		"\f\u0010\u00cc\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00da\b\u0014\u0001\u0015\u0003\u0015"+
		"\u00dd\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003;O\\\u0000\u0018"+
		"\u0003\u0001\u0005\u0002\u0007\u0003\t\u0004\u000b\u0005\r\u0006\u000f"+
		"\u0007\u0011\b\u0013\u0000\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r"+
		"\u001f\u000e!\u000f#\u0010%\u0011\'\u0000)\u0000+\u0000-\u0000/\u0012"+
		"1\u0000\u0003\u0000\u0001\u0002\t\u0002\u0000\t\t  \u0002\u0000&&<<\u0002"+
		"\u0000\"\"<<\u0002\u0000\'\'<<\u0003\u0000\t\n\r\r  \u0003\u000009AFa"+
		"f\u0001\u000009\u0003\u0000\u00b7\u00b7\u0300\u036f\u203f\u2040\t\u0000"+
		"::AZ__az\u2070\u218f\u2c00\u2fef\u3001\u8000\ud7ff\u8000\uf900\u8000\ufdcf"+
		"\u8000\ufdf0\u8000\ufffd\u00f1\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0001\u0019"+
		"\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0001\u001d"+
		"\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0001!\u0001"+
		"\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0002/\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0003"+
		"3\u0001\u0000\u0000\u0000\u0005B\u0001\u0000\u0000\u0000\u0007V\u0001"+
		"\u0000\u0000\u0000\tc\u0001\u0000\u0000\u0000\u000b|\u0001\u0000\u0000"+
		"\u0000\r\u0083\u0001\u0000\u0000\u0000\u000f\u0087\u0001\u0000\u0000\u0000"+
		"\u0011\u008b\u0001\u0000\u0000\u0000\u0013\u0095\u0001\u0000\u0000\u0000"+
		"\u0015\u009e\u0001\u0000\u0000\u0000\u0017\u00a2\u0001\u0000\u0000\u0000"+
		"\u0019\u00a6\u0001\u0000\u0000\u0000\u001b\u00ab\u0001\u0000\u0000\u0000"+
		"\u001d\u00b0\u0001\u0000\u0000\u0000\u001f\u00b2\u0001\u0000\u0000\u0000"+
		"!\u00c4\u0001\u0000\u0000\u0000#\u00c6\u0001\u0000\u0000\u0000%\u00cd"+
		"\u0001\u0000\u0000\u0000\'\u00d1\u0001\u0000\u0000\u0000)\u00d3\u0001"+
		"\u0000\u0000\u0000+\u00d9\u0001\u0000\u0000\u0000-\u00dc\u0001\u0000\u0000"+
		"\u0000/\u00de\u0001\u0000\u0000\u00001\u00e3\u0001\u0000\u0000\u00003"+
		"4\u0005<\u0000\u000045\u0005!\u0000\u000056\u0005-\u0000\u000067\u0005"+
		"-\u0000\u00007;\u0001\u0000\u0000\u00008:\t\u0000\u0000\u000098\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>?\u0005-\u0000\u0000?@\u0005-\u0000\u0000@A\u0005>\u0000\u0000"+
		"A\u0004\u0001\u0000\u0000\u0000BC\u0005<\u0000\u0000CD\u0005!\u0000\u0000"+
		"DE\u0005[\u0000\u0000EF\u0005C\u0000\u0000FG\u0005D\u0000\u0000GH\u0005"+
		"A\u0000\u0000HI\u0005T\u0000\u0000IJ\u0005A\u0000\u0000JK\u0005[\u0000"+
		"\u0000KO\u0001\u0000\u0000\u0000LN\t\u0000\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000NQ\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005"+
		"]\u0000\u0000ST\u0005]\u0000\u0000TU\u0005>\u0000\u0000U\u0006\u0001\u0000"+
		"\u0000\u0000VW\u0005<\u0000\u0000WX\u0005!\u0000\u0000X\\\u0001\u0000"+
		"\u0000\u0000Y[\t\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005>\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0006\u0002\u0000\u0000b\b\u0001\u0000\u0000\u0000"+
		"cd\u0005&\u0000\u0000de\u0003#\u0010\u0000ef\u0005;\u0000\u0000f\n\u0001"+
		"\u0000\u0000\u0000gh\u0005&\u0000\u0000hi\u0005#\u0000\u0000ik\u0001\u0000"+
		"\u0000\u0000jl\u0003)\u0013\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000op\u0005;\u0000\u0000p}\u0001\u0000\u0000\u0000qr\u0005"+
		"&\u0000\u0000rs\u0005#\u0000\u0000st\u0005x\u0000\u0000tv\u0001\u0000"+
		"\u0000\u0000uw\u0003\'\u0012\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0005;\u0000\u0000{}\u0001\u0000\u0000\u0000|g\u0001"+
		"\u0000\u0000\u0000|q\u0001\u0000\u0000\u0000}\f\u0001\u0000\u0000\u0000"+
		"~\u0084\u0007\u0000\u0000\u0000\u007f\u0081\u0005\r\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0005\n\u0000\u0000\u0083~"+
		"\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u000e\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005<\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0006"+
		"\u0006\u0001\u0000\u008a\u0010\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"<\u0000\u0000\u008c\u008d\u0005?\u0000\u0000\u008d\u008e\u0005x\u0000"+
		"\u0000\u008e\u008f\u0005m\u0000\u0000\u008f\u0090\u0005l\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0003%\u0011\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0006\u0007\u0001\u0000\u0094\u0012"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005<\u0000\u0000\u0096\u0097\u0005"+
		"?\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0003#\u0010"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0006\b\u0002\u0000"+
		"\u009b\u009c\u0006\b\u0003\u0000\u009c\u0014\u0001\u0000\u0000\u0000\u009d"+
		"\u009f\b\u0001\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u0016\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005>\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0006"+
		"\n\u0004\u0000\u00a5\u0018\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005?"+
		"\u0000\u0000\u00a7\u00a8\u0005>\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0006\u000b\u0004\u0000\u00aa\u001a\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005/\u0000\u0000\u00ac\u00ad\u0005>\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0006\f\u0004\u0000\u00af\u001c"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005/\u0000\u0000\u00b1\u001e\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005=\u0000\u0000\u00b3 \u0001\u0000\u0000"+
		"\u0000\u00b4\u00b8\u0005\"\u0000\u0000\u00b5\u00b7\b\u0002\u0000\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u00c5\u0005\"\u0000\u0000\u00bc\u00c0\u0005\'\u0000\u0000\u00bd"+
		"\u00bf\b\u0003\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005\'\u0000\u0000\u00c4\u00b4\u0001"+
		"\u0000\u0000\u0000\u00c4\u00bc\u0001\u0000\u0000\u0000\u00c5\"\u0001\u0000"+
		"\u0000\u0000\u00c6\u00ca\u0003-\u0015\u0000\u00c7\u00c9\u0003+\u0014\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb$\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0007\u0004\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0006\u0011\u0000\u0000\u00d0&\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0007\u0005\u0000\u0000\u00d2(\u0001\u0000\u0000\u0000\u00d3\u00d4\u0007"+
		"\u0006\u0000\u0000\u00d4*\u0001\u0000\u0000\u0000\u00d5\u00da\u0003-\u0015"+
		"\u0000\u00d6\u00da\u0002-.\u0000\u00d7\u00da\u0003)\u0013\u0000\u00d8"+
		"\u00da\u0007\u0007\u0000\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da,\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0007\b\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd.\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0005?\u0000\u0000\u00df\u00e0\u0005>\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0006\u0016\u0004"+
		"\u0000\u00e20\u0001\u0000\u0000\u0000\u00e3\u00e4\t\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0006\u0017\u0002\u0000"+
		"\u00e62\u0001\u0000\u0000\u0000\u0013\u0000\u0001\u0002;O\\mx|\u0080\u0083"+
		"\u0085\u00a0\u00b8\u00c0\u00c4\u00ca\u00d9\u00dc\u0005\u0006\u0000\u0000"+
		"\u0005\u0001\u0000\u0003\u0000\u0000\u0005\u0002\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}