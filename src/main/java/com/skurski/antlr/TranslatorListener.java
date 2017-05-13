package com.skurski.antlr;

/***
 *
 * Go through the parse tree and translate Java syntax to C syntax.
 *
 ***/
import org.antlr.v4.runtime.TokenStream;

public class TranslatorListener extends JavaBaseListener {

    JavaParser parser;

    public TranslatorListener(JavaParser parser) {this.parser = parser;}

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        //System.out.println("interface I"+ctx.Identifier()+" {");
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        //System.out.println("}");
    }

    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        // need parser to get tokens
        TokenStream tokens = parser.getTokenStream();
        String type = "void";
        if (ctx.type()!=null) {
            type = tokens.getText(ctx.type());
        }
        if (type.equals("String")) {
            type = "char * ";
        }
        String args = tokens.getText(ctx.formalParameters());
        System.out.print(type+" "+ctx.Identifier()+args + " {");
    }

    @Override
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {

    }

    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
        System.out.println("\n\t" + ctx.getText());
    }

    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {

    }
}