package week17;

public class TestEdible {
    public static void main(String[] args) {

    }
}

interface Edible{
    // Describes how to eat
    public abstract String howToEat(); // public abstract is redundant
}

abstract class Animal{
    // return animal sound
    public abstract String sound();
}

class Chicken extends Animal implements Edible{

    @Override
    public String howToEat() {
        return "Chicken : Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal{

    @Override
    public String sound() {
        return null;
    }
}

abstract class Fruit implements Edible{ // abstract class implements interface

}

class Apple extends Fruit{

    @Override
    public String howToEat() {
        return "Apple: make apple cider";
    }
}

class Orange extends Fruit{

    @Override
    public String howToEat() {
        return "Orange: make orange juice";
    }
}