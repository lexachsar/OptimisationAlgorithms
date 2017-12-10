package com.lexach.OptimisationMethods.task7_3;

class Func{
    public static double function(double x){
        return((double)Math.exp(x) - (x * x * x) / 3.0 + 2.0 * x );
    }

    public static double derivative(double x){
        return(-x * x + (double)Math.exp(x) + 2.0);
    }

    public static double doubleDerivative(double x){
        return((double)Math.exp(x) - 2.0 * x);
    }
}