package com.lexach;

public class Function {
        public static double getFunction(double x){
            return( (x + 2) * (x + 2) * (x - 1) * (x - 4) - 1 );
        }

        public static double getDerivative(double x){
            return( 4 * x * x * x - 3 * x * x - 24 * x - 4 );
        }
/*
        public static double getDoubleDerivative(double x) {

        }*/
}
