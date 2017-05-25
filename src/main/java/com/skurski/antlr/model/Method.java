package com.skurski.antlr.model;

import java.util.Collection;
import java.util.List;

/**
 * Created by psk on 22.05.17.
 */
public class Method {
    private String modifier;
    private String returnType;
    private String name;
    private List<String> arguments;
    private Collection<Instruction> instructions;

    public Method(String name, Collection<Instruction> instructions) {
        this.name = name;
        this.instructions = instructions;
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

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    public Collection<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(Collection<Instruction> instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Method{" +
                "modifier='" + modifier + '\'' +
                ", returnType='" + returnType + '\'' +
                ", name='" + name + '\'' +
                ", arguments=" + arguments +
                ", instructions=" + instructions +
                '}';
    }
}
