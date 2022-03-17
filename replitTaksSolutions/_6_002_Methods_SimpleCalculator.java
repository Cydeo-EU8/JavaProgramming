//Implement the **plus** method. The return is void and has no arguments.
//
//        The method should ask the user to input two numbers, then it will add them and print the result.
//
//        Hint: Create a scanner within plus method.
//
//        Example:
//
//        ```
//        enter first number:
//        1
//        enter second number:
//        2
//        result: 3
//        ```


import java.util.Scanner;

public class _6_002_Methods_SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }

    // Do not touch above

    public static void plus(){

        //your code here
        Scanner inp = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = inp.nextInt();
        System.out.println("enter second number:");
        int num2 = inp.nextInt();
        System.out.println("result: "+ (num1+num2));
    }
}
