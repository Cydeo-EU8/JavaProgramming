//SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.
//
//        In this assignment you will write a program that will find vehicle for recall.
//
//        If the year is in the provided range print:
//        Your vehicle needs to be recalled!
//
//        If the year is fine print:
//        Your vehicle is fine, enjoy!
//
//
//        Example:
//        ```
//        Enter vehicle's year:
//        1996
//
//        Your vehicle needs to be recalled!
//        ```
//        ```
//        Enter vehicle's year:
//        2018
//
//        Your vehicle is fine, enjoy!
//        ```


import java.util.Scanner;

public class _2_018_Statements_VehicleRecall {
    public static void main(String[] args) {
        // DO NOT CHANGE:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE HERE:
        if ((vehicleYear>=1995 && vehicleYear<=1998) || (vehicleYear>=2001 && vehicleYear<=2002) || (vehicleYear>=2004 && vehicleYear<=2006) || (vehicleYear>=2015 && vehicleYear<=2017))
            System.out.println("Your vehicle needs to be recalled!");
        else
            System.out.println("Your vehicle is fine, enjoy!");
    }
}
