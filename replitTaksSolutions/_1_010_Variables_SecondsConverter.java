//Write a program that outputs the number of hours, minutes, and seconds that
//        corresponds to input total `seconds`.
//
//        - Create a Scanner object
//        - Declare int variables `inputSeconds, hours, minutes, seconds`
//        - Ask user enter seconds by printing:
//
//        "Enter seconds:"
//
//        - Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in  `inputSeconds`.
//
//        - Assign values to the hours, minutes, seconds variables
//
//        - Display the result.
//
//        Example:
//        ```
//        Enter seconds:
//        3695
//        1 hours, 1 minutes, and 35 seconds
//        ```

import java.util.Scanner;

public class _1_010_Variables_SecondsConverter {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds=scan.nextInt();
        int hours, minutes, seconds;

        seconds=inputSeconds;

        hours = seconds / 3600;// -> hours // 60 * 60
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
