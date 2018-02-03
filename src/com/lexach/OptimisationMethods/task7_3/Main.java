package com.lexach.OptimisationMethods.task7_3;

class Main {
    public static void main(String args[]){
        double epsilon = 0.001;
        Function myFunc = new Function(-2.5, 1.0);

        double xOpt = MidpointMethod.midpointMethod(epsilon, myFunc);
        System.out.println("Midpoint method has returned:\nx* = " + xOpt + "\nf(x*) = " + myFunc.function(xOpt));

        xOpt = MethodOfChords.methodOfChords(epsilon, myFunc);
        System.out.println("Method of chords has returned:\nx* = " + xOpt + "\nf(x*) = " + myFunc.function(xOpt));

        xOpt = NewtonsMethod.newtonsMethod(epsilon, myFunc);
        System.out.println("Newton's method has returned:\nx* = " + xOpt + "\nf(x*) = " + myFunc.function(xOpt));
    }
}