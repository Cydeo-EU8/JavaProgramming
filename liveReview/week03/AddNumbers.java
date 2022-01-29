package week03;


import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        // Let's get the input from user, for this we need to create scanner object

         Scanner scan = new Scanner(System.in);// create scanner object

        // I want you to declare 5 variables as double data type num1,num2,num3,num4 and total


        double num1, num2, num3, num4, total; // declaring variables

        System.out.println("Enter 4 numbers");

        num1 = scan.nextDouble();  // initialize variable  with the user input
        System.out.println("num1 = " + num1);
        num2 = scan.nextDouble();
        System.out.println("num2 = " + num2);
        num3 = scan.nextDouble();
        System.out.println("num3 = " + num3);
        num4 = scan.nextDouble();
        System.out.println("num4 = " + num4);


        total = num1 + num2 + num3 + num4;


        System.out.println("total = " + total);



    }

}
