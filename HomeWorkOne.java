import javax.lang.model.util.ElementScanner6;

public class HomeWorkOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //--------Задание первое--------

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //--------Задание второе--------

    static void checkSumSign() {
        int a = 7;
        int b = 21;

        // Делаем отступ от первого задания
        System.out.println(" ");

        if ((a+b)>=0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    //--------Задание третье--------

    static void printColor() {
        int value = 5;

    // Делаем отступ от второго задания
        System.out.println(" ");

        if (value<=0) {
            System.out.println ("Красный");
        }
        if (value>0 && value<=100) {
            System.out.println ("Желтый");
        }
        if (value>100) {
            System.out.println ("Зеленый");
        }
    }

    //--------Задание четвертое--------

    static void compareNumbers() {
        int a = 10;
        int b = 4;

        // Делаем отступ от третьего задания
        System.out.println(" ");

        System.out.print(a>=b? "a>=b" : "a<b");

    }
}