//The method accepts two strings and return the longest one
//
//        Example":
//        ```
//        bigger("apple","orange") ==> "orange"
//        ```

import java.util.Scanner;

public class _6_035_Methods_MethodsWithStringBiggerString {
    public static String bigger(String a ,String b){
        if(a.length()>b.length())
        {
            return a;
        }
        else
        {
            return b;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(bigger(in.next(), in.next()));
    }
}
