package com.skurski.antlr.visitor;

import com.skurski.antlr.JavaBaseVisitor;
import com.skurski.antlr.JavaParser;
import com.skurski.antlr.model.Instruction;
import com.skurski.antlr.model.Statement;
import com.skurski.antlr.model.Variable;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by psk on 23.05.17.
 */
public class InstructionVisitor extends JavaBaseVisitor<Instruction> {

    @Override
    public Instruction visitInstruction(@NotNull JavaParser.InstructionContext ctx) {
        Instruction instruction = new Instruction();

        JavaParser.VariableDeclaratorContext variableContext = ctx.variableDeclarator();
        JavaParser.StatementContext statementContext = ctx.statement();

        List<Variable> variables = new ArrayList<>();
        if (variableContext != null) {
            variables.add(variableContext.accept(new VariableVisitor()));
        }

        List<Statement> statements = new ArrayList<>();
        if (statementContext != null) {
            statements.add(statementContext.accept(new StatementVisitor()));
        }

        instruction.setVariables(variables);
        instruction.setStatements(statements);
        return instruction;
    }
}
