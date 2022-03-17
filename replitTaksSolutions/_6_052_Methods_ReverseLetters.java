//Create a method **reverseNoSpec(String)** that will reverse a string without affecting special characters
//
//        Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
//        reverse the string in a way that special characters are not affected.
//
//
//
//        ```
//        Input:   str = "a,b$c"
//        Output:  str = "c,b$a"
//        Note that $ and , are not moved anywhere.
//        Only subsequence "abc" is reversed.
//        ```
//        ```
//        Input:   str = "Ab,c,de!$"
//        Output:  str = "ed,c,bA!$"
//        ```
//
//        ```
//        Input:   str = "----qwe--r--tyf...gd.---"
//
//        Output:  str = "----dgf--y--tre...wq.---"
//        ```

import java.util.Scanner;

public class _6_052_Methods_ReverseLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        // your code here
        String tmp1="";
        String tmp2="";

        for(int i=0, j=str.length()-1 ; i<j;)
        {
            if(Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(j)))
            {

                tmp1="" + str.charAt(i);
                tmp2="" + str.charAt(j);

                str= str.substring(0,i) + tmp2 + str.substring(i+1,j) + tmp1 + str.substring(j+1);

                i++;
                j--;
            }
            else
            {
                if(!(Character.isLetter(str.charAt(i))))
                {
                    i++;
                }
                if(!(Character.isLetter(str.charAt(j))))
                {
                    j--;
                }
            }
        }

        return str;

    }
}
