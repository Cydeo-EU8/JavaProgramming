package day13_String;

import java.util.Scanner;

public class Initial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        scan.close();

        char f = firstName.toUpperCase().charAt(0);
        char l = lastName.toUpperCase().charAt(0);

        String result = f+"."+l;

        System.out.println(result);

    }

}
/*
4. write a program that can return the initials of the user

            ex:
                cydeo
                school

            output:
                C.S

        Note: Pay attention to the example output
 */
