//**at3** accepts two strings and returns a string.
//
//        The first string is the one that will be manipulated. At the 3rd char position of target you will insert the word argument.
//
//        Example:
//
//        ```
//        at3("longword","foo")
//
//        return: "lonfoogword"
//        ```
//        ```
//        at3("blabla","a")
//
//        return: "blaabla"
//        ```

import java.util.Scanner;

public class _6_034_Methods_MethodsWithStringAt3rdChar {
    public static String at3(String target,String word){
        target=target.substring(0,3) + word + target.substring(3);
        return target;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }
}
