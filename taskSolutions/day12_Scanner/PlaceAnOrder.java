package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the product name");
        String productName = scan.nextLine();

        System.out.println("Enter the price");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        System.out.println("Enter your first name");
        String firstName = scan.next();

        scan.close(); // we no longer need scanner after this line

        double total = price * quantity;

        System.out.println(firstName+", your order for "+quantity+" "+productName+" has been placed. Your total is $"+total );

    }

}
/*
6. PlaceAnOrder task:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been placed. Your total is 7.5.
 */