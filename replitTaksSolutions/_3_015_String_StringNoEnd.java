//Given a String **txt** print the value without the last letter
//
//        Ex:
//
//        ```
//        Input:
//        foo
//        ```
//        ```
//        Output:
//        fo
//        ```
//
//        ```
//        Input:
//        run
//        ```
//        ```
//        Output:
//        ru
//        ```
//
//        Hint: Use substring() and length()

import java.util.Scanner;

public class _3_015_String_StringNoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        System.out.println(txt.substring(0,txt.length()-1));

    }
}
