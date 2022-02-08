package day14_String;

import java.util.Scanner;

public class EndsWithLY {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        String lastTwoChars = word.substring( word.length()-2 );

        if(lastTwoChars.equals("ly")){
            System.out.println("really???");
        }else{
            System.out.println("Never mind");
        }

        scan.close();

    }

}
/*
 2. ask the user to enter a word. if the word ends with "ly", print "really???" ,
 otherwise, print "never mind"

 */