package day14_String;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = scan.next();

        System.out.println("Enter your second word:");
        String secondWord = scan.next();

        scan.close();

        String result = firstWord.substring(1)+secondWord.substring(1);

        System.out.println(result);



    }


}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */