/**
  * Java. Homework 7
  *
  * @author Makeev Sergey
  * @version 23.11.2021
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
    String name;
    int appetite;
    boolean fullness;
    boolean foodIsEnough;

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
            plate.decreaseFood(appetite);
            fullness = true;
        } else {
            fullness = false;
        }
    }
}

class Plate {
    int food;
    boolean foodIsEnough;

    Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            this.food = food - amount;
            foodIsEnough = true;
        } else {
            foodIsEnough = false;
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
