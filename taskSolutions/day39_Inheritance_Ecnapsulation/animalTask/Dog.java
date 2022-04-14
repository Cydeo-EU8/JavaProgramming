package day39_Inheritance_Ecnapsulation.animalTask;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

}
