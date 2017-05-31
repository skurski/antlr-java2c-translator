package com.skurski.antlr.model;

import java.util.List;

/**
 * Created by psk on 22.05.17.
 */
public class Instruction implements Printer {

    private List<Variable> variables;

    private List<Statement> statements;

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t");

        for (Variable var : variables) {
            sb.append(var.print());
            sb.append("\n");
        }

        for (Statement stat : statements) {
            sb.append(stat.print());
            sb.append("\n");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "variables=" + variables +
                ", statements=" + statements +
                '}';
    }
}
