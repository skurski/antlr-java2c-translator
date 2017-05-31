package com.skurski.antlr.model;

import java.util.Collection;
import java.util.List;

/**
 * Created by psk on 22.05.17.
 */
public class Method implements Printer {
    private String modifier;
    private String returnType;
    private String name;
    private List<Parameter> arguments;
    private Collection<Instruction> instructions;

    public Method(String name) {
        this.name = name;
    }

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

    public Collection<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(Collection<Instruction> instructions) {
        this.instructions = instructions;
    }

    public List<Parameter> getArguments() {
        return arguments;
    }

    public void setArguments(List<Parameter> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(returnType + " ");
        sb.append(name + "(");

        if (!arguments.isEmpty()) {
            String comma = "";
            for (Parameter param : arguments) {
                sb.append(comma);
                sb.append(param.print());
                comma = ", ";
            }
        }
        sb.append(") {\n");

        if (!instructions.isEmpty()) {
            for (Instruction instruction : instructions) {
                sb.append(instruction.print());
            }
        }

        sb.append("}\n");

        return sb.toString();
    }

    @Override
    public String toString () {
        return "Method{" +
                "modifier='" + modifier + '\'' +
                ", returnType='" + returnType + '\'' +
                ", name='" + name + '\'' +
                ", arguments=" + arguments +
                ", instructions=" + instructions +
                '}';
    }
}