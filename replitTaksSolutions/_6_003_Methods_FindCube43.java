//Create a method called **cube**. It is a void method with no arguments. Write all required code inside this method in order to read a number from the console and then prints the cubed value of that number:
//
//        Example:
//
//        ```
//        input: 5
//
//        output: 125
//        ```
//
//        > hint: cube of a number n = n^3 ->
//        ```
//        n * n * n
//        ```

import java.util.Scanner;

public class _6_003_Methods_FindCube43 {
    //your code here
    //end cube

    public static void main(String[] args) {

        cube();

    }

    public static void cube()
    {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println(a*a*a);
    }
}
