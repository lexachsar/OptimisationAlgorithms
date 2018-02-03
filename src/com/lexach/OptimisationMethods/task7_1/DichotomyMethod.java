package com.lexach.OptimisationMethods.task7_1;

public class DichotomyMethod {
    /**
     * Метод дихотомии
     *
     * @param f function with its bounds (a and b in this case)
     * @return The value of the minimum argument of the function "f".
     */
    public static double dichotomyMethod(Function f) {
        double a = f.getA();
        double b = f.getB();

        double delta = 0.01;
        double epsilon = 0.01;
        double epsilonN = (b - a) / 2;

        while (epsilonN > epsilon) {
            double x_1 = (a + b - delta) / 2;
            double x_2 = (a + b + delta) / 2;

            if (f.getFunction(x_1) <= f.getFunction(x_2))
                b = x_2;
            else
                a = x_1;
            epsilonN = (b - a) / 2;
        }

        return ( (a + b) / 2 );
    }
}
