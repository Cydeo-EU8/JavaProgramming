package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();// -20     //valid age: 1~120

        while(  !(age >= 1 && age <= 120) ){ // while the age number is invalid
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Enter your age: ");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");
        String answer = scan.next().toLowerCase();

        while( !(answer.equals("yes") || answer.equals("no")) ){
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Are you a US citizen? yes/no");
            answer = scan.next().toLowerCase();
        }

        if(age >= 18 && answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }





    }

}
