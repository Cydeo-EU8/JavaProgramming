package day43_Abstraction.car;

public final class Tesla extends Car {


    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void start() {
        System.out.println("Say \"start\"");
    }

    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has auto pilot feature");
    }




}
