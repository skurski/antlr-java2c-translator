package com.skurski.antlr;


import com.skurski.antlr.parser.ListenerParser;

public class Translator {

    public static void main(String [] args) throws Exception {
        new ListenerParser().parse(Translator.class.getResourceAsStream("/input/Demo.java"));
    }
}