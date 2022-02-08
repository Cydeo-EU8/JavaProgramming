package day14_String;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        if(word.charAt(0) == 'x'){
          //  word = word.replaceFirst("x", "");, or:
            word = word.substring(1);
        }

        System.out.println(word);



        scan.close();

    }

}
/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */