package com.skurski.antlr.model;

/**
 * Created by psk on 25.05.17.
 */
public class Variable implements Printer {

    private String type;

    private String name;

    private String value;

    public Variable() {}

    public Variable(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String print() {
        return type + " " + name + " " + (value != null ? "= " + value : "") + ";";
    }

    @Override
    public String toString() {
        return "Variable{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
