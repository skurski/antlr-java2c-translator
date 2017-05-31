package com.skurski.antlr.visitor;

import com.skurski.antlr.JavaBaseVisitor;
import com.skurski.antlr.JavaParser;
import com.skurski.antlr.model.Variable;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by psk on 25.05.17.
 */
public class VariableVisitor extends JavaBaseVisitor<Variable> {

    @Override
    public Variable visitVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx) {
        Variable variable = new Variable();
        variable.setType(ctx.type().getText());
        variable.setName(ctx.variableName().getText());
        variable.setValue(ctx.variableInitializer().expression().getText());
        return variable;
    }

}
