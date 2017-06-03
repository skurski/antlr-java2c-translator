// Generated from com/skurski/antlr/Java.g4 by ANTLR 4.3
package com.skurski.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__44=1, T__43=2, T__42=3, T__41=4, T__40=5, T__39=6, T__38=7, T__37=8, 
		T__36=9, T__35=10, T__34=11, T__33=12, T__32=13, T__31=14, T__30=15, T__29=16, 
		T__28=17, T__27=18, T__26=19, T__25=20, T__24=21, T__23=22, T__22=23, 
		T__21=24, T__20=25, T__19=26, T__18=27, T__17=28, T__16=29, T__15=30, 
		T__14=31, T__13=32, T__12=33, T__11=34, T__10=35, T__9=36, T__8=37, T__7=38, 
		T__6=39, T__5=40, T__4=41, T__3=42, T__2=43, T__1=44, T__0=45, INT=46, 
		ID=47, WS=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'"
	};
	public static final String[] ruleNames = {
		"T__44", "T__43", "T__42", "T__41", "T__40", "T__39", "T__38", "T__37", 
		"T__36", "T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", 
		"T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", 
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "INT", "ID", "WS"
	};


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0142\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3/\6/\u0133\n/\r/\16/\u0134\3\60\6\60\u0138\n\60\r\60\16\60"+
		"\u0139\3\61\6\61\u013d\n\61\r\61\16\61\u013e\3\61\3\61\2\2\62\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\5\3\2\62;\7\2\60\60\62;C\\"+
		"^^c|\5\2\13\f\17\17\"\"\u0144\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7l\3\2\2\2\t"+
		"t\3\2\2\2\13y\3\2\2\2\r\u0080\3\2\2\2\17\u0083\3\2\2\2\21\u0089\3\2\2"+
		"\2\23\u008f\3\2\2\2\25\u0095\3\2\2\2\27\u009a\3\2\2\2\31\u009c\3\2\2\2"+
		"\33\u009e\3\2\2\2\35\u00a0\3\2\2\2\37\u00a2\3\2\2\2!\u00a5\3\2\2\2#\u00a8"+
		"\3\2\2\2%\u00ae\3\2\2\2\'\u00bb\3\2\2\2)\u00c2\3\2\2\2+\u00c6\3\2\2\2"+
		"-\u00cb\3\2\2\2/\u00cd\3\2\2\2\61\u00cf\3\2\2\2\63\u00d7\3\2\2\2\65\u00d9"+
		"\3\2\2\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00e6\3\2\2\2=\u00eb\3\2\2\2"+
		"?\u00f8\3\2\2\2A\u00fb\3\2\2\2C\u00fd\3\2\2\2E\u0100\3\2\2\2G\u0103\3"+
		"\2\2\2I\u0105\3\2\2\2K\u0108\3\2\2\2M\u010a\3\2\2\2O\u0111\3\2\2\2Q\u0113"+
		"\3\2\2\2S\u011a\3\2\2\2U\u0124\3\2\2\2W\u0126\3\2\2\2Y\u0128\3\2\2\2["+
		"\u012a\3\2\2\2]\u0132\3\2\2\2_\u0137\3\2\2\2a\u013c\3\2\2\2cd\7\61\2\2"+
		"d\4\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2ij\7\"\2\2jk\7}\2\2k\6"+
		"\3\2\2\2lm\7r\2\2mn\7t\2\2no\7k\2\2op\7x\2\2pq\7c\2\2qr\7v\2\2rs\7g\2"+
		"\2s\b\3\2\2\2tu\7e\2\2uv\7j\2\2vw\7c\2\2wx\7t\2\2x\n\3\2\2\2yz\7t\2\2"+
		"z{\7g\2\2{|\7v\2\2|}\7w\2\2}~\7t\2\2~\177\7p\2\2\177\f\3\2\2\2\u0080\u0081"+
		"\7#\2\2\u0081\u0082\7?\2\2\u0082\16\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085"+
		"\7n\2\2\u0085\u0086\7q\2\2\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088"+
		"\20\3\2\2\2\u0089\u008a\7e\2\2\u008a\u008b\7n\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7u\2\2\u008d\u008e\7u\2\2\u008e\22\3\2\2\2\u008f\u0090\7y\2\2\u0090"+
		"\u0091\7j\2\2\u0091\u0092\7k\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2"+
		"\u0094\24\3\2\2\2\u0095\u0096\7x\2\2\u0096\u0097\7q\2\2\u0097\u0098\7"+
		"k\2\2\u0098\u0099\7f\2\2\u0099\26\3\2\2\2\u009a\u009b\7}\2\2\u009b\30"+
		"\3\2\2\2\u009c\u009d\7=\2\2\u009d\32\3\2\2\2\u009e\u009f\7?\2\2\u009f"+
		"\34\3\2\2\2\u00a0\u00a1\7\177\2\2\u00a1\36\3\2\2\2\u00a2\u00a3\7k\2\2"+
		"\u00a3\u00a4\7h\2\2\u00a4 \3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7?\2"+
		"\2\u00a7\"\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7"+
		"q\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7v\2\2\u00ad$\3\2\2\2\u00ae\u00af"+
		"\7h\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7n\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7v\2"+
		"\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7e\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be"+
		"\7w\2\2\u00be\u00bf\7d\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"(\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"*\3\2\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7n\2\2\u00c9"+
		"\u00ca\7n\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc.\3\2\2\2\u00cd\u00ce"+
		"\7*\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2"+
		"\7e\2\2\u00d2\u00d3\7m\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7i\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8\64\3\2\2\2\u00d9"+
		"\u00da\7.\2\2\u00da\66\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc8\3\2\2\2\u00dd"+
		"\u00de\7c\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7v\2\2"+
		"\u00e1\u00e2\7t\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5"+
		"\7v\2\2\u00e5:\3\2\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9"+
		"\7p\2\2\u00e9\u00ea\7i\2\2\u00ea<\3\2\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed"+
		"\7v\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7k\2\2\u00f0"+
		"\u00f1\7e\2\2\u00f1\u00f2\7\"\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7k\2"+
		"\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7n\2\2\u00f7>\3\2"+
		"\2\2\u00f8\u00f9\7@\2\2\u00f9\u00fa\7?\2\2\u00fa@\3\2\2\2\u00fb\u00fc"+
		"\7]\2\2\u00fcB\3\2\2\2\u00fd\u00fe\7/\2\2\u00fe\u00ff\7/\2\2\u00ffD\3"+
		"\2\2\2\u0100\u0101\7-\2\2\u0101\u0102\7-\2\2\u0102F\3\2\2\2\u0103\u0104"+
		"\7>\2\2\u0104H\3\2\2\2\u0105\u0106\7?\2\2\u0106\u0107\7?\2\2\u0107J\3"+
		"\2\2\2\u0108\u0109\7_\2\2\u0109L\3\2\2\2\u010a\u010b\7r\2\2\u010b\u010c"+
		"\7w\2\2\u010c\u010d\7d\2\2\u010d\u010e\7n\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7e\2\2\u0110N\3\2\2\2\u0111\u0112\7@\2\2\u0112P\3\2\2\2\u0113\u0114"+
		"\7u\2\2\u0114\u0115\7v\2\2\u0115\u0116\7c\2\2\u0116\u0117\7v\2\2\u0117"+
		"\u0118\7k\2\2\u0118\u0119\7e\2\2\u0119R\3\2\2\2\u011a\u011b\7r\2\2\u011b"+
		"\u011c\7t\2\2\u011c\u011d\7q\2\2\u011d\u011e\7v\2\2\u011e\u011f\7g\2\2"+
		"\u011f\u0120\7e\2\2\u0120\u0121\7v\2\2\u0121\u0122\7g\2\2\u0122\u0123"+
		"\7f\2\2\u0123T\3\2\2\2\u0124\u0125\7+\2\2\u0125V\3\2\2\2\u0126\u0127\7"+
		"-\2\2\u0127X\3\2\2\2\u0128\u0129\7/\2\2\u0129Z\3\2\2\2\u012a\u012b\7k"+
		"\2\2\u012b\u012c\7o\2\2\u012c\u012d\7r\2\2\u012d\u012e\7q\2\2\u012e\u012f"+
		"\7t\2\2\u012f\u0130\7v\2\2\u0130\\\3\2\2\2\u0131\u0133\t\2\2\2\u0132\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"^\3\2\2\2\u0136\u0138\t\3\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2"+
		"\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a`\3\2\2\2\u013b\u013d\t"+
		"\4\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\61\2\2\u0141b\3\2\2\2"+
		"\6\2\u0134\u0139\u013e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}