package day33_CustomClass_Statics.dogTask;

public class Dog {

    public String name, breed, size;
    public char gender;
    public int age;
    public String color;

    public static int numberOfLegs = 2, numberOfEyes = 2, numberOfWings = 0;
    public static boolean isFriendly = true;

    public Dog(String name, String breed, String size, char gender, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void play(){
        System.out.println(name+" is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }


}
/*
6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: name, breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */