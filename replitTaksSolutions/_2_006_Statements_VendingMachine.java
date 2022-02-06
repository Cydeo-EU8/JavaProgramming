//Write a program that will determine the change given from the vending machine. The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.
//
//        1. The given cents value should be more than 0 and less than 100. If the given cents is not in the range print "Invalid cents amount" and there should be no other output after
//
//        In valid cases print the change in this format:
//        Your change is x quarters, x dimes, x nickels, and x pennies
//
//        ```
//        Enter cents:
//        95
//        Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
//
//        ```

import java.util.Scanner;

public class _2_006_Statements_VendingMachine {
    public static void main(String[] args) {
        //ENTER CODE HERE


        int cents;
        int quarters; //25 cents
        int dimes; //10 cents
        int nickles; //5 cents
        int pennies; //1 cent

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cents:");
        cents=scan.nextInt();

        if(cents<0 || cents>100)
        {
            System.out.println("Invalid cents amount");
        }
        else
        {
            quarters= cents / 25;
            dimes= (cents % 25) / 10;
            nickles= ((cents % 25) % 10) / 5;
            pennies= ((cents % 25) % 10) % 5;


            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickels, and " + pennies + " pennies");
        }
    }
}
