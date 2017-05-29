package com.skurski.antlr.model;


/**
 * Created by psk on 29.05.17.
 */
public class Field {
    private String modifier;
    private String returnType;
    private String name;
    private String value;

    private boolean isConstant;

    public Field() {}

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
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

    public boolean isConstant() {
        return isConstant;
    }

    public void setConstant(boolean constant) {
        isConstant = constant;
    }

    @Override
    public String toString() {
        return "Field{" +
                "modifier='" + modifier + '\'' +
                ", returnType='" + returnType + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", isConstant=" + isConstant +
                '}';
    }
}
