/**
  * Java. Homework 7
  *
  * @author Makeev Sergey
  * @version 26.11.2021
  */

  class HomeWorkSeven {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 4);
        cat[1] = new Cat("Murzik", 5);
        cat[2] = new Cat("Pushok", 3);
        Plate plate = new Plate(10);
        System.out.println(plate);

        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i]);
            cat[i].eat(plate);
            System.out.println(plate);
            System.out.println(cat[i].name + " fullness is: " + cat[i].fullness);
            System.out.println();
        }
        System.out.println("Добавим немного еды");
        plate.addInPlate(20);
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i]);
            cat[i].eat(plate);
            System.out.println(plate);
            System.out.println(cat[i].name + " fullness is: " + cat[i].fullness);
            System.out.println();
        }
    }
}

class Cat {
    protected String name;
    protected int appetite;
    protected boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    @Override
    public String toString() {
        return "Cat: " + name + " eats " + appetite + " pieces";
    }

    void eat(Plate plate) {
        if (fullness == false) {
            fullness = plate.decreaseFood(appetite);
        }
    }
}

class Plate {
    protected int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int amount) {
        if (food >= amount) {
            this.food = food - amount;
            return true;
        } else {
            return false;
        }
    }

    void addInPlate (int addFood) {
        this.food += addFood;
    }

    @Override
    public String toString() {
        return "Food in plate: " + food + " pieces";
    }
}
