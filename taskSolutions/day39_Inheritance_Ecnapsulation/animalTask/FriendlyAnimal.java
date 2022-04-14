package day39_Inheritance_Ecnapsulation.animalTask;

public class FriendlyAnimal extends Animal {

    public static boolean isWild = false,
                            isFriendly = true,
                            isPlayable = true;


    public FriendlyAnimal(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void pet(){
        System.out.println(getName()+" likes being petted");
    }

    public void playing(){
        System.out.println(getName()+" is playing");
    }

}

/*
Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */