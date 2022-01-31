package day08_SingleIf;

public class MaxNumber {

    public static void main(String[] args) {

        int n1 = 100,
            n2 = 200;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean equal =  n1 == n2;

        if(n1IsMax){
            System.out.println(n1+" is maximum");
        }

        if(n2IsMax){
            System.out.println(n1+" is maximum");
        }

        if(equal){
            System.out.println("Equal");
        }


    }

}

/*
3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal
        Ex:
            n1= 100, n2 = 200;

        output:
            200 is maximum number
 */