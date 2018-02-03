package com.lexach.OptimisationMethods.task7_2;

public class Main {
    public static void main(String[] args) {
        Function f = new Function(-1, 2);

        double x = ParabolicMethod.parabolicMethod(f, 0.001);

        System.out.println("Parabolic Method has returned:");
        System.out.println("x* = " + x + "\nf* = " + f.getFunction(x));
    }
}