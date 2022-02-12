//Write a program that checks for the biggest of 3 numbers.
//        you get 3 int variables: n1 , n2 and n3
//
//        - if n1 is biggest output: "n1 is bigger"
//        - if n2 is biggest output: "n2 is bigger"
//        - if n3 is biggest output: "n3 is bigger"
//
//        Example:
//        ```
//        1
//        2
//        1
//
//        n2 is bigger
//        ```
//
//        ```
//        3
//        2
//        1
//
//        n1 is bigger
//        ```
//        ```
//        3
//        2
//        30
//
//        n3 is bigger
//        ```


import java.util.Scanner;

public class _2_023_Statements_ThreeNumsBigger {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        //your code here
        if ((n1 > n2) && (n1>n3))
        {
            System.out.println("n1 is bigger");
        }
        else if (n2>n3)
        {
            System.out.println("n2 is bigger");
        }
        else
        {
            System.out.println("n3 is bigger");
        }

    }
}
