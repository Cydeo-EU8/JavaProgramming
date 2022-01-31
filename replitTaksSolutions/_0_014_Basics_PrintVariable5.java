//Given two variables first and second with values, write a statement that will print the values in a single line.
//
//        Ex:
//
//        Input: 55 123
//
//        Output: first is 55 and second is 123
//
//        Input: -124 -500
//
//        Output: first is -124 and second is -500

import java.util.Scanner;

public class _0_014_Basics_PrintVariable5 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt(); // do not change
        int second = scan.nextInt(); // do not change
        //write your code here :

        System.out.println("first is " + first + " " + "and second is " + second);

    }
}
