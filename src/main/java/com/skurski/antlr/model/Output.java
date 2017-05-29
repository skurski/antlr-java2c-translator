package com.skurski.antlr.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Output object - C code.
 */
public class Output {

    private List<String> functions = new ArrayList<>();

    private List<String> globalVariables = new ArrayList<>();

    private Class input;

    public Output(Class input) {
        this.input = input;
    }

    public void print() {
        System.out.println(prepare());
    }

    public String prepare() {
        convert();

        StringBuilder sb = new StringBuilder();
        sb.append("#include <stdio.h>");
        sb.append("\n\n");

        for (String row : globalVariables) {
            sb.append(row);
            sb.append("\n");
        }

        for (String row : functions) {
            sb.append(row);
            sb.append("\n");
        }

        return sb.toString();
    }

    private void convert() {
        convertFieldsToGlobalVariables();
        convertMethodsToFunctions();
    }

    private void convertFieldsToGlobalVariables() {
        for (Field field : input.getFields()) {
            StringBuilder sb = new StringBuilder();
            sb.append(field.getReturnType() + " ");
            sb.append(field.getName() + "(");
            if (field.getValue() != null) {
                sb.append(" = ");
                sb.append(field.getValue());
            }
            sb.append(";\n");

            globalVariables.add(sb.toString());
        }
    }

    private void convertMethodsToFunctions() {
        for (Method method : input.getMethods()) {
            StringBuilder sb = new StringBuilder();
            sb.append(method.getReturnType() + " ");
            sb.append(method.getName() + "(");

            if (!method.getArguments().isEmpty()) {
                String comma = "";
                for (Variable param : method.getArguments()) {
                    sb.append(comma);
                    sb.append(param.getType() + " ");
                    sb.append(param.getName());
                    comma = ", ";
                }
                sb.append(") ");
                sb.append("{\n");
            }

            if (!method.getInstructions().isEmpty()) {
                for (Instruction instruction : method.getInstructions()) {
                    sb.append("\t");

                    if (!instruction.getVariables().isEmpty()) {
                        for (Variable var : instruction.getVariables()) {
                            sb.append(var.getType() + " ");
                            sb.append(var.getName() + " = ");
                            sb.append(var.getValue() + ";");
                            sb.append("\n");
                        }
                    }

                    if (!instruction.getStatements().isEmpty()) {
                        for (Statement stat : instruction.getStatements()) {
                            sb.append(stat.getValue());
                            sb.append("\n");
                        }
                    }
                }
            }

            sb.append("}");
            sb.append("\n");

            functions.add(sb.toString());
        }
    }
}
