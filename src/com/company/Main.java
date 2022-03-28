package com.company;

/**
 * Lefter Olexii, #18
 */
public class Main {
    /**
     * Вычислить у = cos x + cos x^2 + cos x^3 + ... + cos x^n.
     */
    private static void task42() {
        System.out.println("Task 42");
        int NumDegree;
        double y = 0;
        double x;
        int n = 6;
        x = Math.random() * 100;
        System.out.println("x=" + x);
        for (NumDegree = 1; NumDegree <= n; NumDegree++) {
            y += Math.pow(Math.cos(x), NumDegree);
        }
        System.out.println(y);
    }

    /**
     * Одноклеточное животное амёба каждые 3 часа делится на 2 клетки. Определить,
     * сколько клеток будет через 3, 6, 9,..., 24 часа, если первоначально была одна амёба.
     */
    private static void task67() {
        System.out.println("\n\nTask 67");
        int time;
        int NumAnim = 1;
        for (time = 3; time <= 24; time += 3) {
            NumAnim *= 2;
            System.out.println("Через " + time + " часов будет " + NumAnim + " клеток.");
        }
    }

    /**
     * Известны оценки по физике каждого из 20 учеников класса.
     * Определить среднюю оценку по классу.
     */
    private static void task92() {
        System.out.println("\n\nTask 92");
        double x;
        float average;
        float sum = 0;
        float sum1 = 0;
        for (int i = 0; i <= 19; i++) {
            x = (int) (Math.random() * 12) + 1;
            sum += x;
            sum1 += x/20;
        }
        average = sum / 20;
        System.out.println("Sum is " + sum);
        System.out.println("Average of Marks is " + average);
        System.out.println("Average of Marks is " + sum1);
    }

    /**
     * Составить программу, которая печатает таблицу умножения
     * и сложения натуральных чисел в шестнадцатеричной системе счисления.
     */
    private static void task117() {
        System.out.println("\n\nTask 117");
        int col;
        int row;
        int RowCol = 17;
        int tempSum;
        int tempProd;
        int indexS;
        int indexP;
        int rem;
        String[][] ProdTable = new String[18][18];
        String[][] SumTable = new String[18][18];

        /*Sum Table*/
        SumTable[0][0] = "+ ";
        for (col = 0; col < RowCol; col++) {/*Заполнение ряда слагаемых*/
            if (col < 10) {
                SumTable[0][col + 1] = col + " ";
            }
            switch (col) {
                case (10) -> SumTable[0][col + 1] = ("A ");
                case (11) -> SumTable[0][col + 1] = ("B ");
                case (12) -> SumTable[0][col + 1] = ("C ");
                case (13) -> SumTable[0][col + 1] = ("D ");
                case (14) -> SumTable[0][col + 1] = ("E ");
                case (15) -> SumTable[0][col + 1] = ("F ");
            }
        }
        for (row = 0; row < RowCol; row++) {/*Заполнение столбца слагаемых*/
            if (row < 10) {
                SumTable[row + 1][0] = row + " ";
            }
            switch (row) {
                case (10) -> SumTable[row + 1][0] = ("A ");
                case (11) -> SumTable[row + 1][0] = ("B ");
                case (12) -> SumTable[row + 1][0] = ("C ");
                case (13) -> SumTable[row + 1][0] = ("D ");
                case (14) -> SumTable[row + 1][0] = ("E ");
                case (15) -> SumTable[row + 1][0] = ("F ");
            }
        }
        for (row = 1; row < RowCol; row++) { /*Процесс сложения*/
            for (col = 1; col < RowCol; col++) {
                tempSum = col - 1 + row - 1;
                if (tempSum < 10) {
                    SumTable[col][row] = tempSum + " ";
                }
                switch (tempSum) {
                    case (10) -> SumTable[col][row] = ("A ");
                    case (11) -> SumTable[col][row] = ("B ");
                    case (12) -> SumTable[col][row] = ("C ");
                    case (13) -> SumTable[col][row] = ("D ");
                    case (14) -> SumTable[col][row] = ("E ");
                    case (15) -> SumTable[col][row] = ("F ");
                }
                if (tempSum > 15) {
                    indexS = tempSum - 16;
                    SumTable[col][row] = 10 + indexS + "";
                    switch (indexS) {
                        case (10) -> SumTable[col][row] = ("1A");
                        case (11) -> SumTable[col][row] = ("1B");
                        case (12) -> SumTable[col][row] = ("1C");
                        case (13) -> SumTable[col][row] = ("1D");
                        case (14) -> SumTable[col][row] = ("1E");
                    }
                }
            }
        }
        System.out.println("Таблица сложения шестнадцатиричных чисел:");
        for (row = 0; row < RowCol; row++) {
            for (col = 0; col < RowCol; col++) {
                System.out.print(" " + SumTable[col][row] + " ");
            }
            System.out.println();
        }

        /*Product Table*/
        ProdTable[0][0] = "× ";
        for (col = 0; col < RowCol; col++) {/*Заполнение столбца множителей*/
            if (col < 10) {
                ProdTable[0][col + 1] = col + " ";
            }
            switch (col) {
                case (10) -> ProdTable[0][col + 1] = ("A ");
                case (11) -> ProdTable[0][col + 1] = ("B ");
                case (12) -> ProdTable[0][col + 1] = ("C ");
                case (13) -> ProdTable[0][col + 1] = ("D ");
                case (14) -> ProdTable[0][col + 1] = ("E ");
                case (15) -> ProdTable[0][col + 1] = ("F ");
            }
        }
        for (row = 0; row < RowCol; row++) {/*Заполнение ряда множителей*/
            if (row < 10) {
                ProdTable[row + 1][0] = row + " ";
            }
            switch (row) {
                case (10) -> ProdTable[row + 1][0] = ("A ");
                case (11) -> ProdTable[row + 1][0] = ("B ");
                case (12) -> ProdTable[row + 1][0] = ("C ");
                case (13) -> ProdTable[row + 1][0] = ("D ");
                case (14) -> ProdTable[row + 1][0] = ("E ");
                case (15) -> ProdTable[row + 1][0] = ("F ");
            }
        }
        for (row = 1; row < RowCol; row++) { /*Процесс умножения*/
            for (col = 1; col < RowCol; col++) {
                tempProd = (col - 1) * (row - 1);
                if (tempProd < 10) {
                    ProdTable[col][row] = tempProd + " ";
                }
                switch (tempProd) {
                    case (10) -> ProdTable[col][row] = ("A ");
                    case (11) -> ProdTable[col][row] = ("B ");
                    case (12) -> ProdTable[col][row] = ("C ");
                    case (13) -> ProdTable[col][row] = ("D ");
                    case (14) -> ProdTable[col][row] = ("E ");
                    case (15) -> ProdTable[col][row] = ("F ");
                }
                if (tempProd > 15) {
                    rem = tempProd % 16;
                    indexP = (tempProd - rem) / 15;
                    ProdTable[col][row] = indexP + "" + rem;
                    switch (indexP) {
                        case (10) -> ProdTable[col][row] = ("A" + rem);
                        case (11) -> ProdTable[col][row] = ("B" + rem);
                        case (12) -> ProdTable[col][row] = ("C" + rem);
                        case (13) -> ProdTable[col][row] = ("D" + rem);
                        case (14) -> ProdTable[col][row] = ("E" + rem);
                        case (15) -> ProdTable[col][row] = ("F" + rem);
                    }
                    switch (rem) {
                        case (10) -> ProdTable[col][row] = (indexP + "A");
                        case (11) -> ProdTable[col][row] = (indexP + "B");
                        case (12) -> ProdTable[col][row] = (indexP + "C");
                        case (13) -> ProdTable[col][row] = (indexP + "D");
                        case (14) -> ProdTable[col][row] = (indexP + "E");
                        case (15) -> ProdTable[col][row] = (indexP + "F");
                    }
                }
            }
        }
        System.out.println("\n\nТаблица умножения шестнадцатиричных чисел:");
        for (row = 0; row < RowCol; row++) {
            for (col = 0; col < RowCol; col++) {

                System.out.print(" " + ProdTable[col][row] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Выведите на экран все четырёхразрядные числа, в записи которых нет одинаковых цифр.
     */
    private static void task142() {
        System.out.println("\n\nTask 142");
        int units;
        int dozens;
        int hundreds;
        int thousands;
        for (int i = 999; i <= 9999; i++) {
            units = i % 10;
            dozens = (i % 100) / 10;
            hundreds = (i % 1000) / 100;
            thousands = (i % 10000) / 1000;
            if ((units != dozens) && (units != hundreds) && (units != thousands) && (dozens != hundreds) && (dozens != thousands) && (hundreds != thousands)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        task42();
        task67();
        task92();
        task117();
        task142();
    }
}
