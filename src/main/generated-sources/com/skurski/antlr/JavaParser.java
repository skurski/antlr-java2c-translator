// Generated from com/skurski/antlr/Java.g4 by ANTLR 4.3
package com.skurski.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__38=1, T__37=2, T__36=3, T__35=4, T__34=5, T__33=6, T__32=7, T__31=8, 
		T__30=9, T__29=10, T__28=11, T__27=12, T__26=13, T__25=14, T__24=15, T__23=16, 
		T__22=17, T__21=18, T__20=19, T__19=20, T__18=21, T__17=22, T__16=23, 
		T__15=24, T__14=25, T__13=26, T__12=27, T__11=28, T__10=29, T__9=30, T__8=31, 
		T__7=32, T__6=33, T__5=34, T__4=35, T__3=36, T__2=37, T__1=38, T__0=39, 
		INT=40, ID=41, WS=42;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'else {'", "'private'", "'char'", "'return'", "'!='", 
		"'float'", "'class'", "'void'", "'{'", "';'", "'='", "'}'", "'if'", "'short'", 
		"'final static'", "'double'", "'int'", "'null'", "'''", "'('", "'package'", 
		"'*'", "','", "''", "'.'", "'abstract'", "'long'", "'static final'", "'['", 
		"'=='", "']'", "'public'", "'static'", "'protected'", "')'", "'+'", "'-'", 
		"'import'", "INT", "ID", "WS"
	};
	public static final int
		RULE_compilation = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classModifier = 4, RULE_classDeclaration = 5, 
		RULE_classBodyDeclaration = 6, RULE_member = 7, RULE_methodDeclaration = 8, 
		RULE_fieldDeclaration = 9, RULE_modifier = 10, RULE_constant = 11, RULE_methodParameters = 12, 
		RULE_methodParametersDeclaration = 13, RULE_methodBody = 14, RULE_variableDeclarator = 15, 
		RULE_instruction = 16, RULE_variableInitializer = 17, RULE_type = 18, 
		RULE_statement = 19, RULE_expression = 20, RULE_parExpression = 21, RULE_literal = 22, 
		RULE_primitiveType = 23, RULE_className = 24, RULE_methodName = 25, RULE_qualifiedName = 26, 
		RULE_variableName = 27;
	public static final String[] ruleNames = {
		"compilation", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"classModifier", "classDeclaration", "classBodyDeclaration", "member", 
		"methodDeclaration", "fieldDeclaration", "modifier", "constant", "methodParameters", 
		"methodParametersDeclaration", "methodBody", "variableDeclarator", "instruction", 
		"variableInitializer", "type", "statement", "expression", "parExpression", 
		"literal", "primitiveType", "className", "methodName", "qualifiedName", 
		"variableName"
	};

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public CompilationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCompilation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationContext compilation() throws RecognitionException {
		CompilationContext _localctx = new CompilationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(56); packageDeclaration();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(59); importDeclaration();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__28) | (1L << T__12) | (1L << T__6) | (1L << T__4))) != 0)) {
				{
				{
				setState(65); typeDeclaration();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(T__17);
			setState(74); qualifiedName();
			setState(75); match(T__28);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(T__0);
			setState(79);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(78); match(T__5);
				}
			}

			setState(81); qualifiedName();
			setState(84);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(82); match(T__13);
				setState(83); match(T__16);
				}
			}

			setState(86); match(T__28);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			setState(96);
			switch (_input.LA(1)) {
			case T__31:
			case T__12:
			case T__6:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__6) | (1L << T__4))) != 0)) {
					{
					{
					setState(88); classModifier();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(94); classDeclaration();
				}
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(T__28);
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

	public static class ClassModifierContext extends ParserRuleContext {
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__6) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration() {
			return getRuleContext(ClassBodyDeclarationContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(T__31);
			setState(101); className();
			setState(102); match(T__29);
			setState(103); classBodyDeclaration();
			setState(104); match(T__26);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBodyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__32) | (1L << T__30) | (1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__11) | (1L << T__10) | (1L << T__6) | (1L << T__4))) != 0)) {
				{
				{
				setState(106); member();
				}
				}
				setState(111);
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

	public static class MemberContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_member);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); methodDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); fieldDeclaration();
				}
				break;
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodParametersContext methodParameters() {
			return getRuleContext(MethodParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__6) | (1L << T__4))) != 0)) {
				{
				setState(116); modifier();
				}
			}

			setState(119); type();
			setState(120); methodName();
			setState(121); methodParameters();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(122); match(T__9);
				setState(123); match(T__7);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129); methodBody();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__6) | (1L << T__4))) != 0)) {
				{
				setState(131); modifier();
				}
			}

			setState(135);
			_la = _input.LA(1);
			if (_la==T__23 || _la==T__10) {
				{
				setState(134); constant();
				}
			}

			setState(137); variableDeclarator();
			setState(138); match(T__28);
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

	public static class ModifierContext extends ParserRuleContext {
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__6) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MethodParametersContext extends ParserRuleContext {
		public MethodParametersDeclarationContext methodParametersDeclaration() {
			return getRuleContext(MethodParametersDeclarationContext.class,0);
		}
		public MethodParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParametersContext methodParameters() throws RecognitionException {
		MethodParametersContext _localctx = new MethodParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(T__18);
			setState(146);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__32) | (1L << T__30) | (1L << T__24) | (1L << T__22) | (1L << T__21) | (1L << T__14) | (1L << T__11))) != 0)) {
				{
				setState(145); methodParametersDeclaration();
				}
			}

			setState(148); match(T__3);
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

	public static class MethodParametersDeclarationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public MethodParametersDeclarationContext methodParametersDeclaration() {
			return getRuleContext(MethodParametersDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodParametersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParametersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodParametersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodParametersDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodParametersDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParametersDeclarationContext methodParametersDeclaration() throws RecognitionException {
		MethodParametersDeclarationContext _localctx = new MethodParametersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodParametersDeclaration);
		int _la;
		try {
			setState(157);
			switch (_input.LA(1)) {
			case T__35:
			case T__32:
			case T__30:
			case T__24:
			case T__22:
			case T__21:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); type();
				setState(151); variableName();
				setState(154);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(152); match(T__15);
					setState(153); methodParametersDeclaration();
					}
				}

				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); match(T__14);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(T__29);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160); instruction();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__30) | (1L << T__25) | (1L << T__24) | (1L << T__22) | (1L << T__21) | (1L << T__11))) != 0) );
			setState(165); match(T__26);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); type();
			setState(168); variableName();
			setState(171);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(169); match(T__27);
				setState(170); variableInitializer();
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

	public static class InstructionContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instruction);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case T__35:
			case T__32:
			case T__30:
			case T__24:
			case T__22:
			case T__21:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); variableDeclarator();
				setState(174); match(T__28);
				}
				break;
			case T__34:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); statement();
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableInitializer);
		try {
			setState(184);
			switch (_input.LA(1)) {
			case T__20:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); expression(0);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); match(T__19);
				setState(181); expression(0);
				setState(182); match(T__19);
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			setState(195);
			switch (_input.LA(1)) {
			case T__35:
			case T__32:
			case T__24:
			case T__22:
			case T__21:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); primitiveType();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(187); match(T__9);
					setState(188); match(T__7);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(194); match(T__30);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondStatementContext extends StatementContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public CondStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCondStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCondStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCondStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		int _la;
		try {
			setState(213);
			switch (_input.LA(1)) {
			case T__34:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197); match(T__34);
				setState(199);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(198); expression(0);
					}
				}

				setState(201); match(T__28);
				}
				break;
			case T__25:
				_localctx = new CondStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202); match(T__25);
				setState(203); parExpression();
				setState(204); match(T__29);
				setState(205); statement();
				setState(206); match(T__26);
				setState(211);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(207); match(T__37);
					setState(208); statement();
					setState(209); match(T__26);
					}
				}

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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalcExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CalcExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCalcExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCalcExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCalcExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLiteralExpression(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LiteralExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(216); literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new CalcExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(219);
						((CalcExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__16) | (1L << T__2) | (1L << T__1))) != 0)) ) {
							((CalcExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(220); expression(3);
						}
						break;

					case 2:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(222);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__8) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(223); expression(2);
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(T__18);
			setState(230); expression(0);
			setState(231); match(T__3);
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

	public static class LiteralContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); variableName();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(235); match(T__20);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__32) | (1L << T__24) | (1L << T__22) | (1L << T__21) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(ID);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); match(ID);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_qualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(ID);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(ID);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247); match(T__9);
					setState(248); match(T__7);
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);

		case 1: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\5\2<\n\2\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\5\4R\n\4\3\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\5\7\5\\\n\5\f\5\16\5_\13\5"+
		"\3\5\3\5\5\5c\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\bn\n\b\f\b\16"+
		"\bq\13\b\3\t\3\t\5\tu\n\t\3\n\5\nx\n\n\3\n\3\n\3\n\3\n\3\n\7\n\177\n\n"+
		"\f\n\16\n\u0082\13\n\3\n\3\n\3\13\5\13\u0087\n\13\3\13\5\13\u008a\n\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u0095\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\5\17\u009d\n\17\3\17\5\17\u00a0\n\17\3\20\3\20\6\20"+
		"\u00a4\n\20\r\20\16\20\u00a5\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00ae"+
		"\n\21\3\22\3\22\3\22\3\22\5\22\u00b4\n\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00bb\n\23\3\24\3\24\3\24\7\24\u00c0\n\24\f\24\16\24\u00c3\13\24\3\24"+
		"\5\24\u00c6\n\24\3\25\3\25\5\25\u00ca\n\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u00d6\n\25\5\25\u00d8\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00e3\n\26\f\26\16\26\u00e6\13\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u00ef\n\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35\u00fc\n\35\f\35\16\35\u00ff\13"+
		"\35\3\35\2\3*\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\b\5\2\35\35##%%\5\2\5\5##%%\4\2\22\22\37\37\5\2\3\3\31\31\'"+
		"(\4\2\b\b!!\7\2\6\6\t\t\21\21\23\24\36\36\u0102\2;\3\2\2\2\4K\3\2\2\2"+
		"\6O\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\ff\3\2\2\2\16o\3\2\2\2\20t\3\2\2\2\22"+
		"w\3\2\2\2\24\u0086\3\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u0092"+
		"\3\2\2\2\34\u009f\3\2\2\2\36\u00a1\3\2\2\2 \u00a9\3\2\2\2\"\u00b3\3\2"+
		"\2\2$\u00ba\3\2\2\2&\u00c5\3\2\2\2(\u00d7\3\2\2\2*\u00d9\3\2\2\2,\u00e7"+
		"\3\2\2\2.\u00ee\3\2\2\2\60\u00f0\3\2\2\2\62\u00f2\3\2\2\2\64\u00f4\3\2"+
		"\2\2\66\u00f6\3\2\2\28\u00f8\3\2\2\2:<\5\4\3\2;:\3\2\2\2;<\3\2\2\2<@\3"+
		"\2\2\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AF\3\2\2\2B@\3"+
		"\2\2\2CE\5\b\5\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3"+
		"\2\2\2IJ\7\2\2\3J\3\3\2\2\2KL\7\30\2\2LM\5\66\34\2MN\7\r\2\2N\5\3\2\2"+
		"\2OQ\7)\2\2PR\7$\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2SV\5\66\34\2TU\7\34"+
		"\2\2UW\7\31\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\r\2\2Y\7\3\2\2\2Z\\"+
		"\5\n\6\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2"+
		"`c\5\f\7\2ac\7\r\2\2b]\3\2\2\2ba\3\2\2\2c\t\3\2\2\2de\t\2\2\2e\13\3\2"+
		"\2\2fg\7\n\2\2gh\5\62\32\2hi\7\f\2\2ij\5\16\b\2jk\7\17\2\2k\r\3\2\2\2"+
		"ln\5\20\t\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\17\3\2\2\2qo\3\2"+
		"\2\2ru\5\22\n\2su\5\24\13\2tr\3\2\2\2ts\3\2\2\2u\21\3\2\2\2vx\5\26\f\2"+
		"wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\5&\24\2z{\5\64\33\2{\u0080\5\32\16\2"+
		"|}\7 \2\2}\177\7\"\2\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\5\36"+
		"\20\2\u0084\23\3\2\2\2\u0085\u0087\5\26\f\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\5\30\r\2\u0089\u0088\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\5 \21\2\u008c"+
		"\u008d\7\r\2\2\u008d\25\3\2\2\2\u008e\u008f\t\3\2\2\u008f\27\3\2\2\2\u0090"+
		"\u0091\t\4\2\2\u0091\31\3\2\2\2\u0092\u0094\7\27\2\2\u0093\u0095\5\34"+
		"\17\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\7&\2\2\u0097\33\3\2\2\2\u0098\u0099\5&\24\2\u0099\u009c\58\35\2"+
		"\u009a\u009b\7\32\2\2\u009b\u009d\5\34\17\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u00a0\7\33\2\2\u009f\u0098\3"+
		"\2\2\2\u009f\u009e\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u00a3\7\f\2\2\u00a2"+
		"\u00a4\5\"\22\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\17\2\2\u00a8"+
		"\37\3\2\2\2\u00a9\u00aa\5&\24\2\u00aa\u00ad\58\35\2\u00ab\u00ac\7\16\2"+
		"\2\u00ac\u00ae\5$\23\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae!"+
		"\3\2\2\2\u00af\u00b0\5 \21\2\u00b0\u00b1\7\r\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b4\5(\25\2\u00b3\u00af\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4#\3\2\2\2"+
		"\u00b5\u00bb\5*\26\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8\5*\26\2\u00b8\u00b9"+
		"\7\26\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2"+
		"\u00bb%\3\2\2\2\u00bc\u00c1\5\60\31\2\u00bd\u00be\7 \2\2\u00be\u00c0\7"+
		"\"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\13"+
		"\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\'\3\2\2\2\u00c7\u00c9"+
		"\7\7\2\2\u00c8\u00ca\5*\26\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00d8\7\r\2\2\u00cc\u00cd\7\20\2\2\u00cd\u00ce\5"+
		",\27\2\u00ce\u00cf\7\f\2\2\u00cf\u00d0\5(\25\2\u00d0\u00d5\7\17\2\2\u00d1"+
		"\u00d2\7\4\2\2\u00d2\u00d3\5(\25\2\u00d3\u00d4\7\17\2\2\u00d4\u00d6\3"+
		"\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00c7\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d8)\3\2\2\2\u00d9\u00da\b\26\1\2"+
		"\u00da\u00db\5.\30\2\u00db\u00e4\3\2\2\2\u00dc\u00dd\f\4\2\2\u00dd\u00de"+
		"\t\5\2\2\u00de\u00e3\5*\26\5\u00df\u00e0\f\3\2\2\u00e0\u00e1\t\6\2\2\u00e1"+
		"\u00e3\5*\26\4\u00e2\u00dc\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5+\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e7\u00e8\7\27\2\2\u00e8\u00e9\5*\26\2\u00e9\u00ea\7&\2\2\u00ea"+
		"-\3\2\2\2\u00eb\u00ef\7*\2\2\u00ec\u00ef\58\35\2\u00ed\u00ef\7\25\2\2"+
		"\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef/\3"+
		"\2\2\2\u00f0\u00f1\t\7\2\2\u00f1\61\3\2\2\2\u00f2\u00f3\7+\2\2\u00f3\63"+
		"\3\2\2\2\u00f4\u00f5\7+\2\2\u00f5\65\3\2\2\2\u00f6\u00f7\7+\2\2\u00f7"+
		"\67\3\2\2\2\u00f8\u00fd\7+\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fc\7\"\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe9\3\2\2\2\u00ff\u00fd\3\2\2\2\37;@FQV]botw\u0080\u0086\u0089"+
		"\u0094\u009c\u009f\u00a5\u00ad\u00b3\u00ba\u00c1\u00c5\u00c9\u00d5\u00d7"+
		"\u00e2\u00e4\u00ee\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}