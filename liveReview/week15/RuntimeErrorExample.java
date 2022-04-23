package week15;

import java.util.Scanner;

public class RuntimeErrorExample {
    public static void main(String[] args) {

        System.out.println("Hello");
        int x = 5;
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
// if there is a line of code that I might get exception expectation
     try {
         System.out.println( x / y );  // when user puts zero this line will be skipped
     }catch(Exception e){

     }
        System.out.println("How are you today ? ");
        System.out.println("Some more lines of code");
        System.out.println("we swallowed the exception object");


    }
}
