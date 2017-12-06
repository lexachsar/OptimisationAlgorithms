package com.lexach;

import java.util.*;

class MethodOfBrokenLines{
    private static double methodForLSearch(double a, double b, double epsilon, Function myFunc){
        return 2132.12;
    }

    public static double methodOfBrokenLines(double a, double b, double delta, Function myFunc){
        double L = methodForLSearch(a, b, 1, myFunc);

        double xOpt = 1 / (2 * L) * ( myFunc.getFunction(a) - myFunc.getFunction(b) + L * (a + b) );
        double pOpt = 1 / 2 * ( myFunc.getFunction(a) + myFunc.getFunction(b) + L * (a - b) );

        Map<Double, Double> pairs = new HashMap();
        pairs.put(xOpt, pOpt);
        
        double deltaBig = 1 / (2 * L) ( myFunc.getFunction(xOpt) - pOpt );
        while ((2 * L * deltaBig) > delta){
            pairs.put(xOpt, pOpt);
        }
    }

    public static void main(String args[]){
        double a = -3, b = 4;
        Function myFunc = new Function();

        System.out.println( methodOfBrokenLines(a, b, myFunc) );
    }
}
