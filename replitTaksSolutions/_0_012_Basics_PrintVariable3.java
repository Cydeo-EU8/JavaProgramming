//Given two variables num and cost that have been declared and given values, write a statement to print the values.
//
//        Ex:
//
//        Input: 2 5
//
//        Output: num= 2 cost= 5.0

import java.util.Scanner;

public class _0_012_Basics_PrintVariable3 {
    public static void main(String[] args)
    {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // variables are already declared, all you have to do is to use the variables that are given
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double cost = in.nextDouble();

        //write your code here:

        System.out.println("num= " + num);
        System.out.println("cost= " + cost);
    }
}
