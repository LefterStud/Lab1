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

    private static void task67(){
        int time;
        int NumAnim=1;
        for(time=3; time<=24; time+=3){
            NumAnim*=2;
            System.out.println("Через "+time+" часов будет "+NumAnim+" клеток.");
        }
    }

    private static void task92(){
        int[] Mark=new int[19];
        double x;
        float average;
        float sum = 0;
        for (int i=0; i<=19; i++){
            x=(int) (Math.random()*12)+1;
            sum+=x;
            System.out.println(x);
        }
        average = sum/ Mark.length;
        System.out.println("Sum is "+sum);
        System.out.println("Average of Marks is " + average);
    }



    public static void main(String[] args) {
    //  task42();
    //  task67();
        task92();
    }
}
