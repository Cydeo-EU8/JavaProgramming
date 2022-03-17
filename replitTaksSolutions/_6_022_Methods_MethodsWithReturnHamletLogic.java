//The famous quote is "_**to be or not to be**_" is a classic example of boolean logic.
//
//        the **hamletQuote** method only returns `true` if one or both of the boolean parameters is `true`.
//
//        Examples:
//
//        ```
//        hamletQuote(true, false)
//
//        returns true
//        ```
//
//        ```
//        hamletQuote(false,true)
//
//        returns true
//        ```
//
//        ```
//        hamletQuote(true,true)
//
//        returns true
//        ```
//
//        ```
//        hamletQuote(false,false)
//
//        returns false
//        ```
//
//        hint: use the truth table for this one, this can be done with one if and a logical operator.


import java.util.Scanner;

public class _6_022_Methods_MethodsWithReturnHamletLogic {
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // your code here
        boolean result=(toBe || notToBe);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
}
