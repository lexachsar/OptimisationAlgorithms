package com.lexach.OptimisationMethods.task7_1;

public class Main {
    public static void main(String[] args) {
        Function f = new Function(-3, 4);

        double x = BitwiseSearchMethod.bitwiseSearchMethod(f);
        System.out.println("Bitwise Search Method has returned:");
        System.out.println("x* = " + x + "\nf* = " + f.getFunction(x));

        x = DichotomyMethod.dichotomyMethod(f);
        System.out.println("Dichotomy Method has returned:");
        System.out.println("x* = " + x + "\nf* = " + f.getFunction(x));

        x = GoldenSectionSearch.goldenSectionSearch(f);
        System.out.println("Golden Section Search has returned:");
        System.out.println("x* = " + x + "\nf* = " + f.getFunction(x));
    }
}
