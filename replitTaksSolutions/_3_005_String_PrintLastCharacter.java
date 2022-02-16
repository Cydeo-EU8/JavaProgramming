//Write a program that will print out last letter of the word (string).
//
//        Ex:
//        ```
//        Input: java
//        ```
//        ```
//        Output: a
//        ```

import java.util.Scanner;

public class _3_005_String_PrintLastCharacter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        System.out.println(word.charAt(word.length()-1));
    }
}
