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
        return null;
    }

    @Override
    public String sound() {
        return null;
    }
}