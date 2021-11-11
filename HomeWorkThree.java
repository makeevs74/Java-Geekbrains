import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
  * Java. Homework 3
  *
  * @author Makeev Sergey
  * @version 10.11.2021
  */
  class HomeWorkThree {
    public static void main(String[] args) {
        replaceZeroAndOne();
        massive100();
        changeLessSix();

        squareMassive(8);
        squareMassive(4);

        System.out.println(Arrays.toString(fillMassive(10, 5)));
        System.out.println(Arrays.toString(fillMassive(7, 1)));

        findMinMax();

        compareLeftRight();

        moveMassive(2);
        moveMassive(-2);
    }

    static void replaceZeroAndOne() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Exercise One \n"
        + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            //С тернарным я не смог, постоянно ругался на знак "?"
            //arr[i] == 0 ? arr[i] = 1 : arr[i] = 0;
            //System.out.print(arr[i]);
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;  
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }

    static void massive100() {

        int[] arr100 = new int[100];
        System.out.println("Exrecise two \n"
        + Arrays.toString(arr100));
        for (int i = 0; i < arr100.length; i++) {
            arr100[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr100));
    }

    static void changeLessSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Exercise Three \n"
        + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void squareMassive(int x) {
        int[][] arr = new int[x][x];
        System.out.println("Exercise Four");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) || (arr.length - 1 - i == j)) {
                    arr[i][j] = 1;
                }
                System.out.print(+ arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] fillMassive(int len, int initialValue) {
        int[] arr = new int [len];
        System.out.println("Exercise Five");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    static void findMinMax() {
        int[] arr = {10, 3, 0, 1, 2, 3};
        int min = arr[1];
        int max = arr[2];
        System.out.println("Exercise six");
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }

    static void compareLeftRight() {
        int[] arr = {1, 2, 3};
        int sumLeft = 0;
        System.out.println("Exercise seven");
        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            int sumRight = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sumRight += arr[j];
            }
            if (sumLeft == sumRight) {
                System.out.println("true");
            }
        }
    }
// Не уверен что именно это в 8 задаче надо было решить, 
// на лучшее решение времени не хватило)))
    static void moveMassive(int n) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Exercise eight");
        System.out.println(Arrays.toString(arr));
        if (n > 0) {
            for (int i = arr.length - n; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
            for (int i = 0; i < arr.length - n; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        } else {
            for (int i = arr.length + n - 1; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < arr.length + n - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        }
    }
}