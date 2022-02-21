package day17_While_DoWhileLoops;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        int a = 50;
        int b = 9;

        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);


    }

}
/*
	1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

 */