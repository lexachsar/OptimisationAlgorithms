package com.lexach.OptimisationMethods.task7_1;

public class BitwiseSearchMethod {
    /**
     * Метод поразрядного поиска
     *
     * @param f function with its bounds (a and b in this case)
     * @return The value of the minimum argument of the function "f".
     */
    public static double bitwiseSearchMethod(Function f) {
        double a = f.getA();
        double b = f.getB();
        double d = (b - a) / 4;
        double epsilon = 0.0001;
        double x_1 = a;
        double x_2;

        while (Math.abs(d) > epsilon) {
            x_2 = x_1 + d;
            if (f.getFunction(x_1) < f.getFunction(x_2)) {
                d = -(d / 4);
                x_1 = x_2;
            } else {
                x_1 = x_2;
            }
        }

        return x_1;
    }


}
