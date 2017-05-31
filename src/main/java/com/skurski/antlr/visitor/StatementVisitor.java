package com.skurski.antlr.visitor;

import com.skurski.antlr.JavaBaseVisitor;
import com.skurski.antlr.JavaParser;
import com.skurski.antlr.model.Statement;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by psk on 25.05.17.
 */
public class StatementVisitor extends JavaBaseVisitor<Statement> {

    @Override
    public Statement visitStatement(@NotNull JavaParser.StatementContext ctx) {
        if (ctx.ifStatement() != null) {
//            System.out.println(ctx.ifStatement().parExpression().getText());
//            System.out.println(ctx.ifStatement().statement().getText());
        }
        return new Statement(ctx.getText());
    }

}
