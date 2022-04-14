package day39_Inheritance_Ecnapsulation.animalTask;

public class Tiger extends WildAnimal{

    public Tiger(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void hunt() {
        System.out.println("Tiger "+getName()+" hunts deers");
    }


}
