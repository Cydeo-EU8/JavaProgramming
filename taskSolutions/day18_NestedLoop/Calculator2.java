package day18_NestedLoop;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {


            System.out.println("Enter your first number");
            int num1 = scan.nextInt();
            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Enter your math operator");
            char ch = scan.next().charAt(0);

            while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
                System.err.println("Invalid Operator, please re-enter:");
                ch = scan.next().charAt(0);
            }

            double result = 0;

            if (ch == '-') {
                result = num1 - num2;
            } else if (ch == '+') {
                result = num1 + num2;
            } else if (ch == '*') {
                result = num1 * num2;
            } else {
                result = num1 / num2;
            }

            System.out.println(result);
            System.out.println("Would you like to select another room?");
            String a = scan.nextLine().toLowerCase();

            while( !( a.equals("yes") || a.equals("no") ) ){ // while the answer is not valid answer
                System.out.println("Invalid Entry, please re-enter");
                System.out.println("Would you like to select another room?");
                a = scan.nextLine().toLowerCase();
            } // it stops if the answer is either ye or no

            if(a.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }


        }

       scan.close();


    }

}
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */