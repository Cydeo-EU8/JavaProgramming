package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);//  "-".charAt(0) , "+"

        if(  !(operator == '+' || operator == '-') ){ // if the operator is not valid
            System.err.println("Invalid Math Operator: "+operator);
            System.exit(0); // terminates the whole program
        }

        System.out.println("Enter a number:");
        int num2 = scan.nextInt();


        if (operator == '-'){
            System.out.println(num1 - num2);
        }else{
            System.out.println(num1 + num2);
        }




    }

}
