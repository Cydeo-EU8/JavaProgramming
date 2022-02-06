//Write program for Leasing office.
//
//        numberOfBedrooms variable already declared and assigned value using Scanner:
//
//        startingPrice is set to 0.
//
//        > **prices**
//        > 1 bedroom - 1100
//        > 2 bedroom - 1850
//        > 3 bedroom - 2550
//
//
//        Example Flow:
//        ```
//        Welcome to Cybertek Apartments!
//        Number of bedrooms you are interested:
//        1
//        One Bedroom Selected
//        Starting Price: 1100
//        ```
//
//        ```
//        Welcome to Cybertek Apartments!
//        Number of bedrooms you are interested:
//        3
//        Three Bedroom Selected
//        Starting Price: 2550
//        ```
//
//        ```
//        Welcome to Cybertek Apartments!
//        Number of bedrooms you are interested:
//        5
//        No such Bedrooms available
//
//        ```
//        Note: If an invalid bedroom number is given no price is displayed

import java.util.Scanner;

public class _2_011_Statements_ApartmentLeasing1 {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        //WRITE YOUR CODE HERE:
        switch (numberOfBedrooms) {
            case 1:
                startingPrice = 1100;
                System.out.println("One Bedroom Selected");
                System.out.println("Starting Price: " + startingPrice);
                break;
            case 2:
                startingPrice = 1850;
                System.out.println("Two Bedroom Selected");
                System.out.println("Starting Price: " + startingPrice);
                break;
            case 3:
                startingPrice = 2550;
                System.out.println("Three Bedroom Selected");
                System.out.println("Starting Price: " + startingPrice);
                break;
            default:
                System.out.println("No such Bedrooms available");
                break;
        }
    }
}

