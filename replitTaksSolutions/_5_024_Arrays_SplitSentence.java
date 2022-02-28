//Given a String variable **sentence,** write code to type each word in separate lines.
//
//        Example:
//
//        ```
//        sentence -> "Java is fun"
//
//        Print
//
//        Java
//        is
//        fun
//        ```

import java.util.Scanner;

public class _5_024_Arrays_SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String[] tmp = sentence.split(" ");

        for(String word: tmp)
        {
            System.out.println(word);
        }

    }
}
