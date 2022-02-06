//### Similar to Vending Machine
//
//
//
//        Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.
//        - If item is not in the list, display message: _**"Invalid item!"**_.
//        - If price is more than 100$, display message: _**"Sorry, not enough funds on your gift card!".**_
//
//        > **_List of items_**
//        > Blanket - 60$
//        > Charger - 25$
//        > Hat - 25$
//        > Headphones - 30$
//        > Laptop - 200$
//        > Pants - 50$
//        > Pillow - 40$
//        > Smartphone - 1000$
//        > Socks - 5$
//        > USB cable - 10$
//
//        Hint: if/ else if / else or switch statement
//
//        Examples:
//
//        ```
//        input: Hat
//        output:
//        Thank you for your purchase!
//        Your current balance is: 75$
//        ```
//
//        ```
//        input: Pants
//        output:
//        Thank you for your purchase!
//        Your current balance is: 50$
//        ```
//
//
//        ```
//        input: Laptop
//        Output:
//        Sorry, not enough funds on your gift card!
//        ```
//
//        ```
//        input: Cupcake
//        output: Invalid item!
//        ```
//

import java.util.Scanner;

public class _2_007_Statements_GiftCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String item = input.nextLine();
        int giftcard=100;

        //WRITE YOUR CODE HERE
        switch(item)
        {
            case "Blanket":
                System.out.println("Thank you for your purchase! ");
                System.out.print("Your current balance is: " + (giftcard - 60) +"$");
                break;
            case "Charger":
                System.out.println("Thank you for your purchase! ");
                System.out.print("Your current balance is: " + (giftcard - 25) +"$");
                break;
            case "Hat":
                System.out.println("Thank you for your purchase! ");
                System.out.print("Your current balance is: " + (giftcard - 25) +"$");
                break;
            case "Headphones":
                System.out.println("Thank you for your purchase! ");
                System.out.print("Your current balance is: " + (giftcard - 30) +"$");
                break;
            case "Laptop":
                System.out.print("Sorry, not enough funds on your gift card!");
                break;
            case "Pants":
                System.out.println("Thank you for your purchase! ");
                System.out.print("Your current balance is: " + (giftcard - 50) +"$");
                break;
            case "Pillow":
                System.out.println("Thank you for your purchase! ");
                System.out.print("Your current balance is: " + (giftcard - 40) +"$");
                break;
            case "Smartphone":
                System.out.print("Sorry, not enough funds on your gift card!");
                break;
            case "Socks":
                System.out.println("Thank you for your purchase! ");
                System.out.print("Your current balance is: " + (giftcard - 5) +"$");
                break;
            case "USB cable":
                System.out.println("Thank you for your purchase! ");
                System.out.print("Your current balance is: " + (giftcard - 10) +"$");
                break;
            default:
                System.out.println("Invalid item!");
                // code block
        }
    }
}
