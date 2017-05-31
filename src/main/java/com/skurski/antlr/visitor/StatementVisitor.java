package com.skurski.antlr.visitor;

import com.skurski.antlr.JavaBaseVisitor;
import com.skurski.antlr.JavaParser;
import com.skurski.antlr.model.Expression;
import com.skurski.antlr.model.Statement;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by psk on 25.05.17.
 */
public class StatementVisitor extends JavaBaseVisitor<Statement> {

    @Override
    public Statement visitReturnStatement(@NotNull JavaParser.ReturnStatementContext ctx) {
        Expression expression = ctx.expression().accept(new ExpressionVisitor());
        return new Statement("return", expression);
    }

}
