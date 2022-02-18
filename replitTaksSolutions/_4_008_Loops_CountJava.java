//Print the number of times that the string "java" appears anywhere in the given string **word**
//
//        Example:
//
//        ```
//        input: javaxjava
//
//        output: 2
//        ```
//
//
//        Example:
//
//
//        ```
//        input: javaxjavaapplepearjavaegg
//
//        output: 3
//        ```

import java.util.Scanner;

public class _4_008_Loops_CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int countOfJava = 0;
        int lastIndex=0;

        while(lastIndex != -1)
        {
            lastIndex = word.indexOf("java",lastIndex);

            if(lastIndex != -1)
            {
                countOfJava++;
                lastIndex += "java".length();
            }
        }

        System.out.println(countOfJava);
    }
}
