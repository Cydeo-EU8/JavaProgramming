package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringPractice01 {
    /**
     * 1.
     * Ask for a String input from user
     * Create a method that will return
     *  a string made of its first two chars in uppercase
     * so the String "Hello" yields “HE".
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(firstTwoChars(str));

        firstTwoChars2(str);

        System.out.println(firstTwoChars3(str));

        System.out.println(firstTwoChars4(str));
    }

    /*
    difference between void and String
     */

    public static String firstTwoChars(String str) {
//        str = str.toUpperCase();
//        str = str.substring(0,2);

 //       str= str.toUpperCase().substring(0,2); // you can chain your string methods

        return str.toUpperCase().substring(0,2);
    }

    public static void firstTwoChars2(String str){
        System.out.println(str.toUpperCase().substring(0,2));
    }

    public static String firstTwoChars3(String str){
        str = str.toUpperCase();
        String s = ""+str.charAt(0)+str.charAt(1);
        return  s;
    }

    public static String firstTwoChars4(String str){ // (hello) -> [ h , e , l , l , o]
        char[] cahrArr= str.toCharArray();
        return (""+cahrArr[0]+cahrArr[1]).toUpperCase();
    }

    public static String firstTwoChars5(String str){
        char[] cahrArr= str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(Character each: cahrArr){
            list.add(each);
        }
        String s = ""+list.get(0)+list.get(1);
        return s.toUpperCase();
    }

}
