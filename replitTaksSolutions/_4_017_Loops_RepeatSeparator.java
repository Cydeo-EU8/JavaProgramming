//Given two strings, **word** and a separator **sep**, return a big string made of **count** occurrences of the word, separated by the separator string.
//
//
//        Example:
//
//
//        ```
//        input:
//        Word
//        X
//        3
//
//        output: WordXWordXWord
//        ```
//
//        Example:
//
//
//        ```
//        input:
//        This
//        And
//        2
//
//        output: ThisAndThis
//        ```
//
//
//        Example:
//
//
//        ```
//        input:
//        This
//        And
//        1
//
//        output: This
//        ```


import java.util.Scanner;

public class _4_017_Loops_RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        for(int i=0;i<count;i++)
        {
            if(i!=count-1)
            {
                System.out.print(word.concat(separator));
            }
            else
            {
                System.out.print(word);
            }
        }
    }
}
