//In this assignment you will write a program to create a shopping list and prices.
//
//        You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.
//
//        -Declare 4 String variables item1, item2, item3, report.
//
//        -Declare double variables price1, price2, price3, totalPrice
//
//        -Create a Scanner object named scan.
//
//        Example:
//
//        Enter Item1 and its price:
//        Tomatoes
//        5.5

import java.util.Scanner;

public class _1_003_Variables_ShoppingList1 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        String item1,item2,item3;
        double price1, price2, price3, totalPrice;

        System.out.println("Enter Item1 and its price:");
        Scanner scan=new Scanner(System.in);
        item1=scan.nextLine();
        price1=Double.parseDouble(scan.nextLine());

        System.out.println("Enter Item2 and its price:");
        item2=scan.nextLine();
        price2=Double.parseDouble(scan.nextLine());

        System.out.println("Enter Item3 and its price:");
        item3=scan.nextLine();
        price3=Double.parseDouble(scan.nextLine());

        totalPrice=price1+price2+price3;

        System.out.println("Item1: "+ item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: "+ price2 + ", Item3: " + item3 + " Price: " + price3);
        System.out.println("Total price: " + totalPrice);
    }
}
