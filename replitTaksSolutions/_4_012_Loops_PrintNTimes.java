//Given an int variable **n** print out **n** asterisks. So if n=5, five asterisks will be printed.
//
//        Example:
//
//        ```
//        input: 1
//
//        output: *
//        ```
//
//        Example:
//
//        ```
//        input: 3
//
//        output: ***
//        ```

import java.util.Scanner;

public class _4_012_Loops_PrintNTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        for(int i=0;i<n;i++)
        {
            System.out.print("*");
        }
    }
}
