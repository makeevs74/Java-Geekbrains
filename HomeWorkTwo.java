/**
  * Java. Homework 2
  *
  * @author Makeev Sergey
  * @version 07.11.2021
  */

class HomeWorkTwo {
    public static void main(String[] args) {
        checkSumOne(5, 7);
        checkPositiveOrNegative(-1);
        checkPositiveOrNegative(0);
        checkPositiveOrNegative(11);
        System.out.println(checkNegative(1));
        System.out.println(checkNegative(-5));
        System.out.println(checkNegative(0));
        printStringNTimes("Hello!", 5);
        printStringNTimes("Good Buy!", 4);
        System.out.println(isItLeapYear(2100));
        System.out.println(isItLeapYear(2200));
        System.out.println(isItLeapYear(2400));
        System.out.println(isItLeapYear(2020));
    }

    //--------Exercise One--------

    static boolean checkSumOne(int a, int b) {
        boolean c = (a + b >= 10) && (a + b <= 20);
        return c;
    }

    //--------Exercise Two--------

    static void checkPositiveOrNegative(int a) {

    //--Make an indent from previous excercise--
        System.out.println();

        System.out.println(a >= 0? "positive" : "negative");
    }

    //--------Exercise Three--------

    static boolean checkNegative(int a) {
    
    //--Make an indent from previous excercise--
        System.out.println();

        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //--------Exercise Four--------
    
    static void printStringNTimes(String s, int n) {

    //--Make an indent from previous excercise--
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    //--------Excercise Five--------

    static boolean isItLeapYear(int a) {

    //--Make an indent from previous excercise--
        System.out.println();

        if ((a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }        
}
