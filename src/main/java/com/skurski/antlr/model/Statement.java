package com.skurski.antlr.model;


import java.util.*;

public class Statement implements Printer {

    private String type;

    private Expression expression;

    private List<Statement> statements = Collections.emptyList();

    public Statement(Expression expression) {
        this.expression = expression;
    }

    public Statement(String type, Expression expression) {
        this.type = type;
        this.expression = expression;
    }

    public Statement(String type, Expression expression, List<Statement> statements) {
        this.type = type;
        this.expression = expression;
        this.statements = statements;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();

        if (type.equals("return")) {
            sb.append("return " + expression.print() + ";");
        }

        if (type.equals("if")) {
            sb.append("if (" + expression.print() + ")");
        }

        if (type.equals("while")) {
            sb.append("while (" + expression.print() + ")");
        }

        if (type.equals("assign")) {
            sb.append(expression.print() + ";");
        }

        for (int i=0; i<statements.size(); i++) {
            if (i == 0) {
                sb.append(" {\n\t\t" + statements.get(0).print() + "\n\t}");
            }
            if (i == 1) {
                sb.append(" else {\n\t\t" + statements.get(1).print() + "\n\t}");
            }
        }

        return sb.toString();
    }
}
