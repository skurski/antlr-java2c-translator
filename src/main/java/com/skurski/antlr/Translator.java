package com.skurski.antlr;

import com.skurski.antlr.model.Class;
import com.skurski.antlr.model.Output;
import com.skurski.antlr.visitor.ClassVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.InputStream;

public class Translator {

    public static void main(String [] args) throws Exception {

        InputStream in = Translator.class.getResourceAsStream("/input/Demo.java");
        ANTLRInputStream input = new ANTLRInputStream(in);

        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        ClassVisitor classVisitor = new ClassVisitor();
        classVisitor.visit(parser.compilation());
        Class traverseResult = classVisitor.getReturnClass();

        Output output = new Output(traverseResult);
        output.print();
    }
}