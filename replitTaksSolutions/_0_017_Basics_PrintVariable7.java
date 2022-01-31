//2 String variables are already declared and assigned values.
//
//        They will hold different topics we will learn.
//
//        Using those variables print the message exactly like below.
//
//        Ex:
//
//        Assume topic1 = "Java" and topic2 = "SQL"
//
//        You need to print exactly:
//
//        I will learn "Java" and "SQL" at CybertekSchool.

import java.util.Scanner;

public class _0_017_Basics_PrintVariable7 {
    public static void main(String[] args)
    {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        String topic1 = scan.nextLine();
        String topic2 = scan.nextLine();

        //WRITE YOUR CODE BELOW THIS LINE:

        System.out.println("I will learn \"" + topic1 + "\" and \"" + topic2 + "\" at CybertekSchool.");




    }
}
