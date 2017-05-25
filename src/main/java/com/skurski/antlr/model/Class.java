package com.skurski.antlr.model;

import java.util.Collection;

/**
 * Created by psk on 22.05.17.
 */
public class Class {

    private String name;
    private Collection<Method> methods;

    public Class(String name, Collection<Method> methods) {
        this.name = name;
        this.methods = methods;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", methods=" + methods +
                '}';
    }
}
