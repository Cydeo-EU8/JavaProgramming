//This method gets a string and an int, it returns a string.
//
//        The method will limit the given String by a certain amount of characters(given int)
//
//        Examples:
//
//        ```
//        limit("abcd",2)
//
//        returns "ab"
//        ```
//        ```
//
//        limit("bla bla",3)
//
//        returns "bla"
//        ```
//


import java.util.Scanner;

public class _6_033_Methods_MethodsWithStringLimitString {
    public static String limit(String text, int maxLength){
        // your code
        return text.substring(0,maxLength);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(limit(in.nextLine(), in.nextInt()));
    }
}
