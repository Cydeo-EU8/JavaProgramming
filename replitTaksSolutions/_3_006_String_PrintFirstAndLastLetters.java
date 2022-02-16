//Write a program that will print out first and last letters together.
//
//        ```
//        Input: adobe
//        ```
//
//        ```
//        Output: ae
//        ```

import java.util.Scanner;

public class _3_006_String_PrintFirstAndLastLetters {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE


        System.out.println(Character.toString(word.charAt(0))+Character.toString(word.charAt(word.length()-1)));
    }
}
