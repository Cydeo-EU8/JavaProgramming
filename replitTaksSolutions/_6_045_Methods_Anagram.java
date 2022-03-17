//**_Anagram_** is a word, phrase, or name formed by rearranging the letters of another, such as _cinema_, formed from _iceman_.
//
//
//
//        The **isAnagram** method checks if word1 and word2 are anagram to each other then return a boolean.
//
//        - each letter in `word1` should appear in `word2` exact number of times
//        - ignore empty spaces
//        - make your code case insensitive
//
//        Examples:
//
//        ```
//        isAnagram("listen", "Silent") ==> true
//        ```
//
//        ```
//        isAnagram("earth", "heart") ==> true
//        ```
//
//        ```
//        isAnagram("star", "rats") ==> true
//        ```
//
//        ```
//        isAnagram("hi", "bye") ==> false
//        ```
//
//        ```
//        isAnagram("java", "cava") ==> false
//        ```


import java.util.Scanner;

public class _6_045_Methods_Anagram {
    public static boolean isAnagram(String word1, String word2)
    {
        int stringLength;
        int counter=0;
        /*when counter reaches the string length, then there are equal number of same characters between these two strings*/

        word1=word1.toLowerCase();
        word2=word2.toLowerCase();

        stringLength=word1.length();

        if (word1.length()!=word2.length())
        {
            return false;
        }

        for(int i=0;i<stringLength;i++)
        {
            for(int j=0;j<stringLength;j++)
            {
                if(Character.compare(word1.charAt(i),word2.charAt(j))==0)
                {
                    counter++;
                }
            }
        }

        if(counter==word1.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
}
