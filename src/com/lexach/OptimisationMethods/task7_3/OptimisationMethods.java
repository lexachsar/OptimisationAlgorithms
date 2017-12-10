package com.lexach.OptimisationMethods.task7_3;

import java.lang.Math;

class OptimisationMethods{
    private static double midpointMethod(double a, double b, double epsilon, Func myFunc){
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

    private static double methodOfChords(double a, double b, double epsilon, Func myFunc){
        double x = a - myFunc.derivative(a) / ( myFunc.derivative(a) - myFunc.derivative(b) ) * (a - b);

        while(Math.abs( myFunc.derivative(x) ) > epsilon){
            if( myFunc.derivative(x) > 0 )
                b = x;
            else
                a = x;

            x = a - myFunc.derivative(a) / ( myFunc.derivative(a) - myFunc.derivative(b) ) * (a - b);
        }

        return x;
    }

    private static double newtonsMethod(double a, double b, double epsilon, Func myFunc){
        double x = (a + b) / 2;

        while(Math.abs( myFunc.derivative(x) ) > epsilon ){
            x = x - ( myFunc.derivative(x) / myFunc.doubleDerivative(x) );
        }

        return x;

    }

    public static void main(String args[]){
        double a = -2.5;
        double b = -1.0;
        double epsilon = 0.001;


        Func myFunc = new Func();
        double xOpt = midpointMethod(a, b, epsilon, myFunc);
        System.out.println("Midpoint method has returned:\nx* = " + xOpt + "\nf(x*) = " + myFunc.function(xOpt));

        xOpt = methodOfChords(a, b, epsilon, myFunc);
        System.out.println("Method of chords has returned:\nx* = " + xOpt + "\nf(x*) = " + myFunc.function(xOpt));

        xOpt = newtonsMethod(a, b, epsilon, myFunc);
        System.out.println("Newton's method has returned:\nx* = " + xOpt + "\nf(x*) = " + myFunc.function(xOpt));
    }
}