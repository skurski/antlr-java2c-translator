package com.skurski.antlr.visitor;

import com.skurski.antlr.JavaBaseVisitor;
import com.skurski.antlr.JavaParser;
import com.skurski.antlr.model.Parameter;
import com.skurski.antlr.model.Instruction;
import com.skurski.antlr.model.Method;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by psk on 23.05.17.
 */
public class MethodVisitor extends JavaBaseVisitor<Method> {

    @Override
    public Method visitMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx) {
        Method method = new Method(ctx.methodName().getText());
        if (ctx.modifier() != null ) {
            method.setModifier(ctx.modifier().getText());
        }
        method.setReturnType(ctx.type().getText());

        List<Parameter> arguments = new ArrayList<>();
        JavaParser.MethodParametersDeclarationContext paramContext = ctx.methodParameters().methodParametersDeclaration();
        while (paramContext != null) {
            arguments.add(new Parameter(
                    paramContext.type().getText(), paramContext.variableName().getText()
            ));
            paramContext = paramContext.methodParametersDeclaration();
        }
        method.setArguments(arguments);

        InstructionVisitor instructionVisitor = new InstructionVisitor();
        List<Instruction> instructions = ctx.methodBody().instruction()
                .stream()
                .map(instruction -> instruction.accept(instructionVisitor))
                .collect(Collectors.toList());

        method.setInstructions(instructions);
        return method;
    }
}
