//**threeLocks** accepts 3 booleans and returns a boolean.
//
//        It returns true only if both **_a and b are true_** or **_c is true_**.
//
//        Hint: See truth table

import java.util.Scanner;

public class _6_024_Methods_MethodsWithReturn3Locks {
    public static boolean threeLocks(boolean a, boolean b, boolean c)
    {
        boolean result=(a && b) || c;
        return result;

    }//end threeLocks

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
    }
}
