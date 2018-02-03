package com.lexach.OptimisationMethods.task7_2;

public class Function {
    private double a;
    private double b;

    Function(double a, double b) {
        if (a > b) {
            double buff = b;
            b = a;
            a = buff;
        }

        this.a = a;
        this.b = b;
    }

    public double getFunction(double x) {
        return x * x * x + 4 * x * x - 2 * x + 1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
