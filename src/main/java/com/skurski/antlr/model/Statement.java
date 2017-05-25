package com.skurski.antlr.model;

/**
 * Created by psk on 25.05.17.
 */
public class Statement {

    private String row;

    public Statement(String row) {
        this.row = row;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "row='" + row + '\'' +
                '}';
    }
}
