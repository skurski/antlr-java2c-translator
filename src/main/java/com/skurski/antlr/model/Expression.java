package com.skurski.antlr.model;

/**
 * Created by psk on 31.05.17.
 */
public class Expression implements Printer {

    private String operation;

    private Expression rightValue;

    private Expression leftValue;

    private String value;

    public Expression() {}

    public Expression(String value) {
        this.value = value;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Expression getRightValue() {
        return rightValue;
    }

    public void setRightValue(Expression rightValue) {
        this.rightValue = rightValue;
    }

    public Expression getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(Expression leftValue) {
        this.leftValue = leftValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String print() {
        if (leftValue != null && rightValue != null) {
            return leftValue.value + " " + operation + " " + rightValue.value;
        }

        if (leftValue != null && rightValue == null) {
            return leftValue.value + " " + operation;
        }

        return value;
    }

    @Override
    public String toString() {
        return "Expression{" +
                "operation='" + operation + '\'' +
                ", rightValue=" + rightValue +
                ", leftValue=" + leftValue +
                ", value='" + value + '\'' +
                '}';
    }
}
