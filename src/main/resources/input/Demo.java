package com.skurski.antlr.testing;

public class Demo {

    private float number = 44.66;

    private long bigNumber = 5432535932452;

    public final static int MAX = 999;

    public final static char FLAG = 'A';

    public double squareValue(double value) {
        return value * value;
    }

    public int addTo(int value) {
        int add = 1000;
        return value + add;
    }

    private int multiply(int x, int y) {
        int temp = x;
        int z = 1000;

        if (x == y) {
            return z;
        }

        return temp;
    }

    void doNothing() {
        float sign = 45.99;
    }

    float calculate(int value) {
        if (value != 100) {
            return 50.55;
        } else {
            return 0.0;
        }
    }

    private double increment() {
        double x = 10;
        while (value == 10) {
            if (x > 10) {
                x--;
            } else {
                x++;
            }
        }
        return x;
    }
}