package day37_Inheritance.animalTask;

public class Parrot extends Animal {

   // public String parrotWingColor;

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
       // this.parrotWingColor = parrotWingColor;
    }

    public void sing(){
        System.out.println(name+" is singing");
    }


}