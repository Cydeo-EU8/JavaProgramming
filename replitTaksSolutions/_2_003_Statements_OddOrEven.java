//Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:
//
//        ```
//        Enter a number:
//        10
//
//        10 is even
//        ```
//
//        ```
//        Enter a number:
//        33
//
//        33 is odd
//        ```
//
//        ```
//        Enter a number:
//        0
//
//        0 is even
//        ```
//

import java.util.Scanner;

public class _2_003_Statements_OddOrEven {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //CODE HERE
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
