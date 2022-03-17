//The method accepts a string and returns a string without the first character
//
//        Example:
//        ```
//        removeFirst("aaa")
//
//        returns "aa"
//
//        ```

import java.util.Scanner;

public class _6_036_Methods_MethodsWithStringRemoveFirstChar {
    public static String removeFirst(String target) {

        return target.substring(1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
    }
}
