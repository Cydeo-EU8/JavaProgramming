package week09;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(add(5.2,20.5));
        double sum = add(4,5); // integer, and compiler did not complain
/*
Datatype parameter promotion
byte -> short -> int -> long -> double
 */
        System.out.println(sum);

        int sum2 =(int) add(4,5); // add method returns double, so you need to cast it to int--explicit casting

        System.out.println("100 * 200 : "+multiply(100,200));

    }

    public static double add(double num1, double num2){  // num1 and num2 are called pass by variables
        double result = num1+num2;
        return result;
    }

    public static double subtract(double num1, double num2){
        return num1-num2;
    }

    public static double multiply(double num1, double num2){
        return num1*num2;
    }

    public static double divide(double num1, double num2){
        return num1/num2;
    }

}
