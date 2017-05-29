package com.skurski.antlr.model;

/**
 * Created by psk on 25.05.17.
 */
public class Statement {

    private String record;

    public Statement(String record) {
        this.record = record;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getValue() {
        return "return " + record + ";";
    }

    @Override
    public String toString() {
        return "Statement{" +
                "record='" + record + '\'' +
                '}';
    }
}
