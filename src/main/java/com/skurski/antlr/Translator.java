package com.skurski.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.InputStream;

public class Translator {

    public static void main(String [] args) throws Exception {

        InputStream in = Translator.class.getResourceAsStream("/input/Demo.java");
        ANTLRInputStream input = new ANTLRInputStream(in);

        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit(); // parse

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        TranslatorListener translator = new TranslatorListener(parser);
        walker.walk(translator, tree); // initiate walk of tree with listener
    }
}