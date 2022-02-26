package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdbe";
        String str2 = "dbcaz";

        // write a program that can check if str1 & str2 are build out same characters

        char[] ch1= str1.toCharArray();
        char[] ch2 = str2.toCharArray();

      //  System.out.println(Arrays.toString(ch1));
     //   System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

      //  System.out.println();

       // System.out.println(Arrays.toString(ch1));
      //  System.out.println(Arrays.toString(ch2));

        boolean anagram =  Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);


    }

}
