//Write a program that will reverse a string. Your program should reverse a string _only 5 characters long_.
//        If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.
//
//        Example:
//
//        ```
//        input: cat
//
//        output: Too short!
//        ```
//
//        ```
//        input: singularity
//
//        output: Too long!
//        ```
//        ```
//        input: apple
//
//        output: elppa
//        ```


import java.util.Scanner;

public class _3_010_String_ReverseIt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String tmp="";

        int stringLength=word.length();
        if(stringLength<5)
        {
            System.out.println("Too short!");
        }
        else if(stringLength>5)
        {
            System.out.println("Too long!");
        }
        else
        {
            for(int i=4;i>=0;i--)
            {
                //tmp+=Character.toString(input.charAt(i));
                tmp+=word.valueOf(word.charAt(i));
            }
            System.out.println(tmp);
        }
    }
}
