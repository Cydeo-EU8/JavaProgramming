package day39_Inheritance_Ecnapsulation.animalTask;

public class Eagle extends WildAnimal{

    public Eagle(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void hunt() {
        System.out.println("Eagle "+getName()+" hunts snakes");
    }

}
