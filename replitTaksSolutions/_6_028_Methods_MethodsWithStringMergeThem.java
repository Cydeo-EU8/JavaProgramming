//Write a method **mergeStrings** that will return the strings merged, one letter at a time,
// starting with `one`.   Please note `one` and `two` can be of different lengths.
//
//        Examples:
//        ```
//        s1 ==> "12345"
//        s2 ==> "abcde"
//        mergeStrings(s1,s2) ==> "1a2b3c4d5e"
//        ```
//
//        ```
//        mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
//
//        mergeStrings("java", "selenium") ==> "jsaevlaenium"
//        ```

import java.util.Scanner;

public class _6_028_Methods_MethodsWithStringMergeThem {
    public static String mergeStrings(String one, String two)
    {
        int  shorterLength=0;
        String merge="";

        if(one.length()<two.length())
        {
            shorterLength=one.length();
        }
        else
        {
            shorterLength=two.length();
        }

        for(int i=0;i<shorterLength; i++)
        {
            merge+=one.substring(i,i+1)+two.substring(i,i+1);
        }

        if(one.length()<two.length())
        {
            merge = merge.concat(two.substring(shorterLength,two.length()));
        }
        else
        {
            merge = merge.concat(one.substring(shorterLength,one.length()));
        }


        return merge;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
}
