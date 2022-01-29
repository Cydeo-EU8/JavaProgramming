package week03;

public class DifferenceBetweenAndOrBitwiseOperators {

    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 10;

        System.out.println(true | false); // true , checks both sides
        System.out.println(true || false); // true again, but does not check the second part of the statement if the first part is already true

        System.out.println(i2>i1 | i1>i2); // true

        System.out.println(i2>i1 || ++i1>i2);
        System.out.println("i1 = " + i1);  // we will get 5


        boolean a = i2<i1 && ++i1<i2;  // false && true Bitwise and operator: if the first statement is false, DOES NOT check the second statement
        System.out.println("a = " + a);
        System.out.println("i1 = " + i1); // 5

        
    }
}
