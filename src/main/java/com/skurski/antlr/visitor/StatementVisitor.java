package com.skurski.antlr.visitor;

import com.skurski.antlr.JavaBaseVisitor;
import com.skurski.antlr.JavaParser;
import com.skurski.antlr.model.Statement;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by psk on 25.05.17.
 */
public class StatementVisitor extends JavaBaseVisitor<Statement> {

    @Override
    public Statement visitStatement(@NotNull JavaParser.StatementContext ctx) {
        // todo: read and convert statement
        return new Statement(ctx.getText());
    }

}
