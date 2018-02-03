package com.lexach.OptimisationMethods.task7_1;

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
        return 4 * x * x - 6 * x - 3;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
