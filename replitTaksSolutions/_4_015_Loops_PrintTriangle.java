//Write a program that will create a triangle of asterisks based on size **n**.
//
//        Example:
//
//        ```
//        input: 5
//
//        output:
//        *
//        **
//        ***
//        ****
//        *****
//        ```
//
//        Example:
//
//        ```
//        input: 3
//
//        output:
//        *
//        **
//        ***
//        ```

import java.util.Scanner;

public class _4_015_Loops_PrintTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=1;i<=n;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
