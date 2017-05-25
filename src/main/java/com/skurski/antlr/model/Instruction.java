package com.skurski.antlr.model;

/**
 * Created by psk on 22.05.17.
 */
public class Instruction {

    private String block;

    public Instruction(String name) {
        this.block = name;
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "block='" + block + '\'' +
                '}';
    }
}
