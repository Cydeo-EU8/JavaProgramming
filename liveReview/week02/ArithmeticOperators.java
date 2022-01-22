package week02;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*
        Division
        * in math 10/3 = 3.33333
        * in Java 10/3 = 3 reason int/int = int ;
        * 10/3.0 int / double = double
        * 10.0/3 double/int = double
         */

        System.out.println("10 / 3 : "+ 10/3);
        System.out.println("10 / 3.0 : "+ 10/3.0); // 3.0 = double data type
        System.out.println("10 + 3 : " + 10 + 3); // 10 + 3 : 103  concatination: String + int = String  "10 + 3 : "+10 = "10 + 3 : 10" ---- String + int = String
        // which operations come first in JAVA
        // paranthesis comes first, division, multiplication is before concatination

    // INPORTANT : JAVA Runs from top to bottom and left to right

        int num1 = 10;
        double num2 = 3.0;

        int result = (int) (num1/num2); // expilicit casting

        System.out.println("result = " + result);
    }
}
