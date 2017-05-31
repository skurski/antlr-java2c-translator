package com.skurski.antlr.model;


/**
 * Created by psk on 29.05.17.
 */
public class Field implements Printer {
    private String modifier;
    private String returnType;
    private String name;
    private String value;

    private boolean constant = false;

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
        return constant;
    }

    public void setConstant(boolean constant) {
        this.constant = constant;
    }

    @Override
    public String print() {
        if (constant) {
            StringBuilder sb = new StringBuilder();
            sb.append("#define ");
            sb.append(name.toUpperCase());
            if (value.matches("-?\\d+(\\.\\d+)?")) {
                sb.append(" " + value);
            } else {
                sb.append(" \"" + value + "\"");
            }
            sb.append("\n");

            return sb.toString();
        }

        StringBuilder sb = new StringBuilder();
        sb.append(returnType + " ");
        sb.append(name);
        if (value != null) {
            sb.append(" = ");
            sb.append(value);
        }
        sb.append(";\n");

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Field{" +
                "modifier='" + modifier + '\'' +
                ", returnType='" + returnType + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", constant=" + constant +
                '}';
    }
}
