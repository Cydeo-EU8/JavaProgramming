package day43_Abstraction.car;

public final class Honda extends Car  {

    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }


    public void start(){
        System.out.println("Twist the key to ignition");
    }



}
