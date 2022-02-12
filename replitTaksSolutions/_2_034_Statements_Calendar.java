//Write a program that will print out month names by receiving a number. Use Switch Statement. If an invalid month number is entered print "Invalid month number"
//
//        Example:
//
//        ```
//        Display message: "Enter month number:"
//
//        input: 5
//
//        Display message: "May"
//        ```

import java.util.Scanner;

public class _2_034_Statements_Calendar {
    public static void main(String[] args) {
        // DO NOT CHANGE
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();

        //WRITE YOUR CODE HERE:
        switch(monthNum)
        {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid month number");
                break;
        }
    }
}
