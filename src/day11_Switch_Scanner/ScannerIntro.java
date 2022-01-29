package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");

        int num1 = input.nextInt();

        System.out.println("Enter a decimal:");

        double num2 = input.nextDouble();


        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+ (num1*num2));

        input.close(); // closes the scanner, after this scanner can not be used anymore

/*
        System.out.println("Enter an integer:");
        int num3 = input.nextInt();
        System.out.println(num3);

 */

    }


}
