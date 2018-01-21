package com.lexach.OptimisationMethods.task7_4;

public class Function {
    public static double getFunction(double x) {
        return ((x + 2) * (x + 2) * (x - 1) * (x - 4) - 1);
    }

    public static double getDerivative(double x) {
        return (4 * x * x * x - 3 * x * x - 24 * x - 4);
    }

    /*
    public static double getFunction(double x) {
        return ((x + 3) * (x + 1) * (x - 2) * (x - 3) + 2);
    }

    public static double getDerivative(double x) {
        return (4 * x * x * x - 3 * x * x -22 * x + 9);
    }
    */

}
