package com.lexach.OptimisationMethods.task7_3;

public class MidpointMethod {
    public static double midpointMethod(double epsilon, Function myFunc){
        double a = myFunc.getA();
        double b = myFunc.getB();

        double x = (a + b) / 2.0;

        while(Math.abs( myFunc.derivative(x) ) > epsilon){
            if(myFunc.derivative(x) > 0)
                b = x;
            else
                a = x;
            x = (a + b) / 2.0;
        }

        return x;
    }
}
