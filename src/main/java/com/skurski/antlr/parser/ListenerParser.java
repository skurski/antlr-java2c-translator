package com.skurski.antlr.parser;

import com.skurski.antlr.JavaLexer;
import com.skurski.antlr.JavaParser;
import com.skurski.antlr.listener.TranslatorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;


public class ListenerParser implements Parser {

    @Override
    public void parse(InputStream input) throws IOException {
        ANTLRInputStream alntlrInput = new ANTLRInputStream(input);

        JavaLexer lexer = new JavaLexer(alntlrInput);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit(); // parse

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        TranslatorListener translator = new TranslatorListener(parser);
        walker.walk(translator, tree); // initiate walk of tree with listener
    }
}


