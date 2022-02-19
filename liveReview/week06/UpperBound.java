package week06;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        /**
         *
         * Question-8:

         Write a program to calculate the sum of the numbers from 1 till upper bound.
         If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
         If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
         If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

         Spicy Level of this question is 8 out of 10
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid upper bound :");
        int upperBound = scan.nextInt();

        int sum = 0;
        boolean check = true;  // initialization

        for(  ; check   ;  ) {
            if (upperBound >= 1) {
                for (int i = 1; i <= upperBound; i++) {
                    sum += i;
                }
                check = false;  // iteration

            } else {
                System.out.println("Please Enter a Valid Number Again : ");
                upperBound = scan.nextInt();
               //  check = true;  // iteration

            }
        }
        System.out.println("sum = " + sum);



    }
}
