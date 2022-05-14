package week18.poly_demo;

public class SuperManTest {
    public static void main(String[] args) {
/*
NOTE: Reference type decides what can be accessible. Object type decides to use most specific one.
 */
        // polymorphism
        // Interface/Parent Class RN = ChildClass

        Parent superManOne = new Father();  // you can reach Parent Abstract Class Methodsi but CAN NOT reach Worker  Interface methods
        superManOne.feedKid();
        superManOne.playWithKid();
        superManOne.raiseKid();

       // superManOne.work("SDET");  // ERROR superManOne is type of Parent abstract class


        Worker superManTwo = new Father(); // you can reach Worker  Interface methods but CAN NOT reach Parent Abstract Class Methods
        superManTwo.getPaid();
        superManTwo.work("SDET");

        Father superManThree = new Father();
        superManThree.feedKid();
        superManThree.playWithKid();
        superManThree.raiseKid();
        superManThree.work("QA");
        superManThree.getPaid();

        boolean b1 = superManOne instanceof Father;
        boolean b2 = superManTwo instanceof Father;
        boolean b3 = superManThree instanceof Father;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        // Explicit-Casting Examples
        ((Worker)superManOne).work("Engineer");
        ((Worker)superManOne).getPaid();

        ((Parent)superManTwo).raiseKid();
        ((Parent)superManTwo).playWithKid();
        ((Parent)superManTwo).feedKid();


    }
}
