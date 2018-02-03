package com.lexach.OptimisationMethods.task7_3;

public class MethodOfChords {
    public static double methodOfChords(double epsilon, Function myFunc) {
        double a = myFunc.getA();
        double b = myFunc.getB();

        double x = a - myFunc.derivative(a) / (myFunc.derivative(a) - myFunc.derivative(b)) * (a - b);

        while (Math.abs(myFunc.derivative(x)) > epsilon) {
            if (myFunc.derivative(x) > 0)
                b = x;
            else
                a = x;

            x = a - myFunc.derivative(a) / (myFunc.derivative(a) - myFunc.derivative(b)) * (a - b);
        }

        return x;
    }
}
