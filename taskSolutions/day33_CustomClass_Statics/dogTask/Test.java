package day33_CustomClass_Statics.dogTask;

public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog("Lucy", "Husky", "Small", 'F',4, "White" );

        System.out.println(dog);
        dog.eat();
        dog.play();
        dog.sleep();


    }

}
