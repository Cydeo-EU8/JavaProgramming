//Write a program that will print out first half of the word twice.
//
//
//        Example:
//
//        ```
//        input: java
//
//        output: jaja
//        ```
//        ```
//        input: unity
//
//        output: unun
//        ```

import java.util.Scanner;

public class _3_012_String_PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int stringLength=word.length();
        String tmp="";

        for(int i=0; i<stringLength/2;i++)
        {
            //tmp+=Character.toString(input.charAt(i));
            tmp+=word.valueOf(word.charAt(i));
        }

        for(int i=0; i<stringLength/2;i++)
        {
            //tmp+=Character.toString(input.charAt(i));
            tmp+=word.valueOf(word.charAt(i));
        }

        System.out.println(tmp);
    }
}
