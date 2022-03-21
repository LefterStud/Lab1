package com.company;

/**
 * Lefter Olexii, #18
 */
public class Main {
    /**
     * Вычислить у = cos x + cos x^2 + cos x^3 + ... + cos x^n.
     * */
    private static void task42(){
    int NumDegree;
    double y=0;
    double x=45;
    int n=6;

    for(NumDegree = 1; NumDegree <=n; NumDegree++){
        y += Math.pow(Math.cos(x),NumDegree);
    }
        System.out.println(y);
    }
    public static void main(String[] args) {
    task42();
    }
}
