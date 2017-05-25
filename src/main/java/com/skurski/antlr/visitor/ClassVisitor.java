package com.skurski.antlr.visitor;

import com.skurski.antlr.JavaBaseVisitor;
import com.skurski.antlr.JavaParser;
import com.skurski.antlr.model.Class;
import com.skurski.antlr.model.Method;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Translate Java class to C file.
 */
public class ClassVisitor extends JavaBaseVisitor<Class> {

    private Class returnClass = null;

    @Override
    public Class visitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx) {
        String className = ctx.className().getText();
        MethodVisitor methodVisitor = new MethodVisitor();
        List<Method> methods = ctx.classBody().methodDeclaration()
                .stream()
                .map(method -> method.accept(methodVisitor))
                .collect(Collectors.toList());

        returnClass = new Class(className, methods);
        return returnClass;
    }

    public Class getReturnClass() {
        return returnClass;
    }
}
