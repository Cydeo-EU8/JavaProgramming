import java.util.Scanner;

//You have two numbers already declared and assigned values.
//
//        Check if num1 and num2 are equal, or not. Please follow the below examples and print message accordingly:
//
//        ```
//        Enter 2 numbers:
//        10
//        10
//
//        10 and 10 are equal
//        ```
//
//        ```
//        Enter 2 numbers:
//        100
//        55
//
//        100 is greater than 55
//        ```
//
//        ```
//        Enter 2 numbers:
//        33
//        333
//
//        333 is greater than 33
//        ```
public class _2_002_Statements_NumsGreaterEqual {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //CODE HERE
        if(num1>num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num2>num1)
        {
            System.out.println(num2 + " is greater than " + num1);
        }
        else
        {
            System.out.println(num1 + " and " + num2 + " are equal");
        }
    }
}
