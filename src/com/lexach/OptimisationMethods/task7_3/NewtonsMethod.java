package com.lexach.OptimisationMethods.task7_3;

public class NewtonsMethod {
    public static double newtonsMethod(double epsilon, Function myFunc){
        double a = myFunc.getA();
        double b = myFunc.getB();

        double x = (a + b) / 2;

        while(Math.abs( myFunc.derivative(x) ) > epsilon ){
            x = x - ( myFunc.derivative(x) / myFunc.doubleDerivative(x) );
        }

        return x;

    }
}
