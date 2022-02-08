package day11_SwitchStatements;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "grande";
        double price = 0.0;
        int calories = 0;

        switch (size) {
            case "tall":
                price = 3.69;
                calories = 90;
                break;

            case "grande":
                price = 3.99;
                calories = 120;
                break;

            case "venti":
                price = 4.29;
                calories = 150;
                break;

            default:
                System.err.println("Invalid Size: " + size);
        }


        if (price != 0) {
            System.out.println("Price is: $" + price);
            System.out.println(calories + " calories");
        }


    }

}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"



 */