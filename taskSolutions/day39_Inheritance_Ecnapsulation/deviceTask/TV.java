package day39_Inheritance_Ecnapsulation.deviceTask;

public class TV extends Device{

    public TV(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public void channelUp(){
        System.out.println("Channeling up "+getBrand()+" "+getModel());
    }

    public void channelDown(){
        System.out.println("Channeling down "+getBrand()+" "+getModel());
    }

}
