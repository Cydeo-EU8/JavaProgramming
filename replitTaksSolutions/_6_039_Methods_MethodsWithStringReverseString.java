//The **reverse** method will reverse the given String
//
//        Example:
//
//        ```
//        reverse("foo") ==> "oof"
//        ```
//
//        ```
//        reverse("student") ==> "tneduts"
//        ```


import java.util.Scanner;

public class _6_039_Methods_MethodsWithStringReverseString {
    public static String reverse(String input){

        int stringLength=input.length();
        String tmp="";
        for(int i=stringLength-1;i>=0;i--)
        {
            //tmp+=Character.toString(input.charAt(i));
            tmp+=input.valueOf(input.charAt(i));
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
