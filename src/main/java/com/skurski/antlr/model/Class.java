package com.skurski.antlr.model;

import java.util.Collection;

/**
 * Created by psk on 22.05.17.
 */
public class Class {

    private String name;

    private Collection<Method> methods;

    // todo: add fields
//    private Collection<Field> fields;

    public Class(String name, Collection<Method> methods) {
        this.name = name;
        this.methods = methods;
    }

    public Collection<Method> getMethods() {
        return methods;
    }

    public void setMethods(Collection<Method> methods) {
        this.methods = methods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", methods=" + methods +
                '}';
    }
}
