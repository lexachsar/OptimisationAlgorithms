package com.lexach.OptimisationMethods.task7_2;

public class ParabolicMethod {
    public static double parabolicMethod(Function f, double epsilon) {
        double a = f.getA();
        double b = f.getB();
        double delta = 1;

        double x_1 = a;
        double x_2 = (b + a) / 2;
        double x_3 = b;

        double a_0 = f.getFunction(x_1);
        double a_1 = (f.getFunction(x_2) - f.getFunction(x_1)) / (x_2 - x_1);
        double a_2 = (1 / (x_3 - x_2)) * (((f.getFunction(x_3) - f.getFunction(x_1)) / (x_3 - x_1)) - ((f.getFunction(x_2) - f.getFunction(x_1) / (x_2 - x_1))));

        double x = 0.5 * (x_1 + x_2 - a_1 / a_2);
        double result = x;

        if ((f.getFunction(x) >= f.getFunction(x_2)) && (x > x_1)) {
            x_1 = x;
        }

        if ((f.getFunction(x_2) >= f.getFunction(x)) && (x < x_3)) {
            x_1 = x_2;
            x_2 = x;
        }

        while (delta > epsilon) {
            //a_0 = f.getFunction(x_1);
            a_1 = (f.getFunction(x_2) - f.getFunction(x_1)) / (x_2 - x_1);
            a_2 = (1 / (x_3 - x_2)) * (f.getFunction(x_3) - f.getFunction(x_1))
                    / (x_3 - x_1) - (f.getFunction(x_2) - f.getFunction(x_1)) / (x_2 - x_1);
            x = 0.5 * (x_1 + x_2 - a_1 / a_2);
            result = x;

            if ((f.getFunction(x) >= f.getFunction(x_2)) && (x > x_1)) {
                x_1 = x;
            }

            if ((f.getFunction(x_2) >= f.getFunction(x)) && (x < x_3)) {
                x_1 = x_2;
                x_2 = x;
            }

            delta = Math.abs(result - x);
            result = x;
        }

        return result;
    }
}