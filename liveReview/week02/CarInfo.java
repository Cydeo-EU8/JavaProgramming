package week02;

public class CarInfo {
    public static void main(String[] args) {

        // I want you to give example of the car that you will buy after you find a well payed job
        int year = 2022;
        String make = "Audi";
        String model = "A6";
        // automatic = true; manual = false;
        boolean transmission = true;
        String color = "black";
        int milage = 0;
        int price = 75_000; // for Europe

        System.out.println(year+" "+make+" "+model+"\nAutomatic Transmission :"+transmission);
        System.out.println(color+"|"+milage+" kilometers|"+price+"Euros");

        // let's turn this value into TL 1 Euro = 15.5 Tl

        double priceInTL = price * 15.5;

        double taxRate = 1.80; // for this kind of cars

        double priceAfterTaxInTL = priceInTL+(priceInTL*taxRate);

        System.out.println("priceAfterTaxInTL = " + priceAfterTaxInTL);

        // Variables are used, because it makes our data reusable and maintainable
    }
}
