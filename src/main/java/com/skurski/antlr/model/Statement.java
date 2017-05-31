package com.skurski.antlr.model;


public class Statement implements Printer {

    private String prefix;

    private Expression expression;

    public Statement(Expression expression) {
        this.expression = expression;
    }

    public Statement(String prefix, Expression expression) {
        this.prefix = prefix;
        this.expression = expression;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String print() {
        return prefix + " " + expression.print();
    }

    @Override
    public String toString() {
        return "Statement{" +
                "prefix='" + prefix + '\'' +
                ", expression=" + expression +
                '}';
    }
}
