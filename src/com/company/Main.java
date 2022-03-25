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

    /**
     * Одноклеточное животное амёба каждые 3 часа делится на 2 клетки. Определить,
     * сколько клеток будет через 3, 6, 9,..., 24 часа, если первоначально была одна амёба.
     * */
    private static void task67(){
        int time;
        int NumAnim=1;
        for(time=3; time<=24; time+=3){
            NumAnim*=2;
            System.out.println("Через "+time+" часов будет "+NumAnim+" клеток.");
        }
    }

    /**
     *Известны оценки по физике каждого из 20 учеников класса.
     * Определить среднюю оценку по классу.
     * */
    private static void task92(){
        double x;
        float average;
        float sum = 0;
        for (int i=0; i<=19; i++){
            x=(int) (Math.random()*12)+1;
            sum+=x;
        }
        average = sum/20;
        System.out.println("Sum is "+sum);
        System.out.println("Average of Marks is " + average);
    }

    /**
     *Составить программу, которая печатает таблицу умножения
     * и сложения натуральных чисел в шестнадцатеричной системе счисления.
     * */
    private static void task117(){
        int col;
        int row;
        int RowCol = 17;



















    }

    /**
     *Выведите на экран все четырёхразрядные числа, в записи которых нет одинаковых цифр.
     * */
    private static void task142(){
        int u;
        int d;
        int h;
        int t;
        for(int i=999; i<=9999; i++){
            u=i%10;
            d=(i%100)/10;
            h=(i%1000)/100;
            t=(i%10000)/1000;
            if((u!=d)&&(u!=h)&&(u!=t)&&(d!=h)&&(d!=t)&&(h!=t)){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
    //  task42();
    //  task67();
    //  task92();
      task117();
    //  task142();
    }
}
