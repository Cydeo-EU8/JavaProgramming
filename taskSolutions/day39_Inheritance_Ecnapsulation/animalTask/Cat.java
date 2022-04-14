package day39_Inheritance_Ecnapsulation.animalTask;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }


}
