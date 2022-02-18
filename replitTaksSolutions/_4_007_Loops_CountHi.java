//Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.
//
//
//        Example:
//
//
//        ```
//        input: abc hi how hi
//
//        output: 2
//        ```
//
//
//        Example:
//
//
//        ```
//        input: hi code java please
//
//        output: 1
//        ```

import java.util.Scanner;

public class _4_007_Loops_CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int countOfHi = 0;
        int lastIndex=0;

        while(lastIndex != -1)
        {
            lastIndex = str.indexOf("hi",lastIndex);

            if(lastIndex != -1)
            {
                countOfHi++;
                lastIndex += "hi".length();
            }
        }

        System.out.println(countOfHi);
    }
}
