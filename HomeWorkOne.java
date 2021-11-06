/**
  * Java. Homework 1
  *
  * @author Makeev Sergey
  * @version 04.11.2021
  */

public class HomeWorkOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //--------Exercise one--------

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //--------Exercise two--------

    static void checkSumSign() {
        int a = 7;
        int b = 21;

        // Make an indent from previous exercise
        System.out.println(" ");

        if ((a+b)>=0) {
            System.out.println("Sum is positive");
        }
        else {
            System.out.println("Sum is negative");
        }
    }

    //--------Exercise three--------

    static void printColor() {
        int value = 5;

        //  Make an indent from previous exercise
        System.out.println(" ");

        if (value<=0) {
            System.out.println ("Red");
        } else if (value<=100) {
            System.out.println ("Yellow");
        } else {
            System.out.println ("Green");
        }
    }

    //--------Exercise four--------

    static void compareNumbers() {
        int a = 10;
        int b = 4;

        // Make an indent from previous exercise
        System.out.println(" ");

        System.out.print(a>=b? "a>=b" : "a<b");

    }
}