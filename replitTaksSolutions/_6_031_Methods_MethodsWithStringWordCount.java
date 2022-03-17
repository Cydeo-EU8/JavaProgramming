//**wordCount** accepts String and returns how many words are in the given String
//
//        Example:
//
//        ```
//        wordCount("foo bar")
//
//        returns 2
//        ```
//
//        ```
//        wordCount("one two three")
//
//        returns 3
//        ```
//
//        ```
//        wordCount("bla")
//
//        returns 1
//        ```
//
//        Hint: look at spaces


import java.util.Scanner;

public class _6_031_Methods_MethodsWithStringWordCount {
    public static int wordCount(String words) {
        // your code

        words=words.trim();
        int stringLength=words.length();
        int blankCount=0;

        //remove multiple blanks
        for(int i=0;i<stringLength;i++)
        {
            if(Character.compare(words.charAt(i),' ')==0 && Character.compare(words.charAt(i+1),' ')==0)
            {
                //filling more than one space
                words=words.substring(0,i) + "$" + words.substring(i+1);
            }
        }

        stringLength=words.length();

        for(int i=0;i<stringLength;i++)
        {
            if(Character.compare(words.charAt(i),' ')==0)
            {
                blankCount++;
            }
        }

        return blankCount+1;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
