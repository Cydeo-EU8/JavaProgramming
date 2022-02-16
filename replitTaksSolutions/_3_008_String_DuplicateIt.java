//You have 2 words
//
//        Print the first word, second word, second word, first word
//
//        ```
//        Input:
//
//        one
//
//        two
//        ```
//
//        ```
//        Output:
//
//        onetwotwoone
//        ```

import java.util.Scanner;

public class _3_008_String_DuplicateIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        System.out.println(word1.concat(word2).concat(word2).concat(word1));

    }
}
