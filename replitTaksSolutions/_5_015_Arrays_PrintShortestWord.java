//Write a program that will print the shortest word in the given array str.
//
//        ```
//        input: java, cable, red, vivid, remedy, grace
//
//        output: red
//        ```

import java.util.Scanner;

public class _5_015_Arrays_PrintShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        // Do not touch above

        int minIndex=0;

        //write your code below
        for(int i = 0; i < 6;  i++)
        {

            if (str[i].length() < str[minIndex].length())
            {
                minIndex=i;
            }
        }

        System.out.println(str[minIndex]);

    }
}
