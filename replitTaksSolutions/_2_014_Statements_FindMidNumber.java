//Write a program that will return mid number out of three numbers.  No need to do any calculations.
//
//
//        1. Create an object of Scanner class.
//
//        2. Declare int 3 variables: num1, num2, num3.
//
//        Example:
//
//        ```
//        Enter first number:
//        14
//        Enter second number:
//        52
//        Enter third number:
//        25
//
//        Medium value is: 25
//        ```
//        ```
//
//        Enter first number:
//        140
//        Enter second number:
//        34
//        Enter third number:
//        1
//
//        Medium value is: 34
//        ```

import java.util.Scanner;

public class _2_014_Statements_FindMidNumber {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan=new Scanner(System.in);
        int first, second, third, medium=0;

        System.out.println("Enter first number:");
        first=scan.nextInt();

        System.out.println("Enter second number:");
        second=scan.nextInt();

        System.out.println("Enter third number:");
        third=scan.nextInt();

        if(first>second && first>third)
        {
            if(second>third)
            {
                medium=second;
            }
            else
            {
                medium=third;
            }
        }
        else if(second>first && second>third)
        {
            if(first>third)
            {
                medium=first;
            }
            else
            {
                medium=third;
            }
        }
        else if(third>first && third>second)
        {
            if(first>second)
            {
                medium=first;
            }
            else
            {
                medium=second;
            }
        }

        System.out.println("Medium value is: "+medium);

    }
}
