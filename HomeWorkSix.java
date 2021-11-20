/**
  * Java. Homework 6
  *
  * @author Makeev Sergey
  * @version 20.11.2021
  */
class HomeWorkSix {
    public static void main(String[] args) {

        Dog dog = new Dog("Sharik", 500, 10);
        Cat cat = new Cat("Murzik", 200, 0);
        int countAnimals = 0;
        int countDogs = 0;
        int countCats = 0;

        IAnimal[] animals = {dog, cat};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(600));
            System.out.println(animal.swim(10));
            countAnimals += 1;
            if (animal == dog) {
                countDogs += 1;
            } else if (animal == cat) {
                countCats += 1;
            }
        }
        System.out.println("Число собак: " + countDogs + 
        "\nЧисло кошек: " + countCats + 
        "\nЧисло животных: " + countAnimals);
    }
}

interface IAnimal {
    String run(int runDistance);
    String swim(int swimDistance);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int runDistanceLimit;
    protected int swimDistanceLimit;
    protected int runDistance;
    protected int swimDistance;

    Animal(String name, int runDistanceLimit, int swimDistanceLimit) {
        this.name = name;
        this.runDistanceLimit = runDistanceLimit;
        this.swimDistanceLimit = swimDistanceLimit;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

    public String run(int runDistance) {
        if (runDistance <= runDistanceLimit) {
            return name + " run " + runDistance + " meters";
        } else {
            return "Runnung " + runDistance + " meters is too far for " + name;
        }
    }

    public String swim(int swimDistance){
        if (swimDistance <= swimDistanceLimit) {
            return name + " swim " + swimDistance + " meters";
        } else {
            return "Swimming " + swimDistance + " meters is too far for " + name;
        }
    }
}

class Dog extends Animal {
    Dog(String name, int runDistanceLimit, int swimDistanceLimit) {
        super(name, runDistanceLimit, swimDistanceLimit);
    }
}

class Cat extends Animal {
    Cat(String name, int runDistanceLimit, int swimDistanceLimit) {
        super(name, runDistanceLimit, swimDistanceLimit);
    }

    @Override
    public String swim(int swimDistance){
        return name + " can't swim";
    }
}