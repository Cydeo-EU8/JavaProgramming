//Given the array **words** find and print the word with the largest length.
// Assume that there are no 2 words with longest length
//
//        Example:
//        ```
//        words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//
//        Outputs: jaaaaavvaaaaaaaaaa
//        ```

import java.util.Scanner;

public class _5_013_Arrays_FindingMaxLengthInStringArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        int maxIndex=0;

        //write your code below
        for(int i = 0; i < 5;  i++)
        {
            if (words[i].length() > words[maxIndex].length())
            {
                maxIndex=i;
            }
        }

        System.out.println(words[maxIndex]);

    }
}
