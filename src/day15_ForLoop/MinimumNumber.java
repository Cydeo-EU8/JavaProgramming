package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; //any number that user enter will be less than 2147483647
        // min = -10

        for(int i = 10; i < 15; i++ ){

            System.out.println("Enter a number:");
            int num = scan.nextInt(); //67, 23, 42, 5, -10

            if(num < min ){
                min = num;
            }

        }


        System.out.println("min = " + min);


    }

}

/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number

 */