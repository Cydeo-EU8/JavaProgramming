//This method accept two strings (text and badWord) and returns a string.
//
//        The method will take out all the occurrences of badWord in the text.
//
//        Example:
//
//        ```
//        clean ("one two three","two")
//
//        returns "one three"
//        ```
//
//        ```
//        clean ("foo bar","foo")
//
//        returns "bar"
//        ```
//
//        ```
//        clean ("he said bla bla bla","bla")
//
//        returns "he said"
//        ```

import java.util.Scanner;

public class _6_032_Methods_MethodsWithStringCleanString {
    public static String clean(String text , String badWord)
    {
        int lastIndex=0;

        while(lastIndex != -1)
        {
            lastIndex = text.indexOf(badWord,lastIndex);

            if(lastIndex != -1)
            {
                text=text.substring(0,lastIndex) + text.substring(lastIndex+badWord.length());
                lastIndex += badWord.length();
            }
        }
        text=text.replace("  "," ");

        return text;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }
}
