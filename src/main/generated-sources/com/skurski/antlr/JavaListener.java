// Generated from com/skurski/antlr/Java.g4 by ANTLR 4.3
package com.skurski.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull JavaParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull JavaParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull JavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull JavaParser.MethodBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(@NotNull JavaParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(@NotNull JavaParser.ClassModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull JavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull JavaParser.ModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodParameters}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameters(@NotNull JavaParser.MethodParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodParameters}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameters(@NotNull JavaParser.MethodParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull JavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull JavaParser.TypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull JavaParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull JavaParser.ClassNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull JavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull JavaParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull JavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull JavaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull JavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull JavaParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull JavaParser.ClassBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code calcExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCalcExpression(@NotNull JavaParser.CalcExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCalcExpression(@NotNull JavaParser.CalcExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull JavaParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull JavaParser.MemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull JavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull JavaParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull JavaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull JavaParser.ParExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(@NotNull JavaParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(@NotNull JavaParser.VariableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull JavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull JavaParser.QualifiedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code statementExpression}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementExpression}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull JavaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull JavaParser.MethodNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code notEqualExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpression(@NotNull JavaParser.NotEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpression(@NotNull JavaParser.NotEqualExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull JavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull JavaParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodParametersDeclaration(@NotNull JavaParser.MethodParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodParametersDeclaration(@NotNull JavaParser.MethodParametersDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#compilation}.
	 * @param ctx the parse tree
	 */
	void enterCompilation(@NotNull JavaParser.CompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#compilation}.
	 * @param ctx the parse tree
	 */
	void exitCompilation(@NotNull JavaParser.CompilationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull JavaParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull JavaParser.InstructionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull JavaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull JavaParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull JavaParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull JavaParser.LiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCondStatement(@NotNull JavaParser.CondStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCondStatement(@NotNull JavaParser.CondStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code incDecExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncDecExpression(@NotNull JavaParser.IncDecExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incDecExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncDecExpression(@NotNull JavaParser.IncDecExpressionContext ctx);
}