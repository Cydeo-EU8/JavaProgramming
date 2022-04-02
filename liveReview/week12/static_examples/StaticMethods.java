package week12.static_examples;

public class StaticMethods {

    public int num = 10;

    public static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);
     //   System.out.println(num); //instance can not be called from static method, this num has many copies which one am I gonna print out
        System.out.println("count = " + count);
    }

    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("count = " + count); // I can call static field from instance method
        System.out.println("num = " + num);
        displayMessage("hello from instance method");
    }

}
