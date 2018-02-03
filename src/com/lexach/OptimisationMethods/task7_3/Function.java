package com.lexach.OptimisationMethods.task7_3;

class Function {
    private double a;
    private double b;

    Function(double a, double b) {
        if(a > b) {
            double buff = b;
            b = a;
            a = buff;
        }

        this.a = a;
        this.b = b;
    }

    public double function(double x){
        return(Math.exp(x) - (x * x * x) / 3.0 + 2.0 * x );
    }

    public double derivative(double x){
        return(-x * x + Math.exp(x) + 2.0);
    }

    public double doubleDerivative(double x){
        return(Math.exp(x) - 2.0 * x);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}