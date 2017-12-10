package com.lexach.OptimisationMethods.task7_4;

class MethodOfBrokenLines {
    private static double methodForLSearch(double a, double b, double epsilon, Function myFunc) {
        double max = myFunc.getDerivative(a);

        for (double i = a; i < b; i += 0.01) {
            double thisMax = myFunc.getDerivative(i);
            if (max < thisMax)
                max = thisMax;

        }

        return max;
    }

    public static double methodOfBrokenLines(double a, double b, double epsilon, Function myFunc) {
        double L = methodForLSearch(a, b, 1, myFunc);

        double xOpt = 1 / (2 * L) * (myFunc.getFunction(a) - myFunc.getFunction(b) + L * (a + b));
        double yOpt = 1 / 2 * (myFunc.getFunction(a) + myFunc.getFunction(b) + L * (a - b));
        double p = yOpt;

        double DELTA = 1 / (2 * L) * (myFunc.getFunction(xOpt) - p);
        while ((2 * L * DELTA) > epsilon) {
            double x1 = xOpt - DELTA;
            double x2 = xOpt + DELTA;


            p = 1 / 2 * (myFunc.getFunction(xOpt) + p);

            if (myFunc.getFunction(x1) < myFunc.getFunction(x2))
                xOpt = x1;
            else
                xOpt = x2;

            DELTA = 1 / (2 * L) * (myFunc.getFunction(xOpt) - p);
        }

        return xOpt;
    }

    public static void main(String args[]) {
        double a = -3, b = 4;
        Function myFunc = new Function();

        double x = methodOfBrokenLines(a, b, 0.01, myFunc);
        double f = myFunc.getFunction(x);

        System.out.println("x* = " + x + " f(x*)= " + f);
    }
}
