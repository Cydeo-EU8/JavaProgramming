//Write a program that will print out the first character of the word.
//
//        Ex:
//
//        ```
//        Input: jump
//        ```
//        ```
//        Output: j
//        ```


import java.util.Scanner;

public class _3_004_String_PrintFirstCharacter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:

        System.out.println(word.charAt(0));
    }
}
