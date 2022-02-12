package week05;

import java.util.Scanner;

public class EmailExampleFromReplit {
//Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
//
//        Example:
//
//        ```
//        Input: craig_federighi@apple.com
//
//```
//        ```
//        Output:
//        First name: Craig
//        Last name: Federighi
//        Domain: apple
//        ```
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a valid email: craig_federighi@apple.com ");
    String email = input.next(); // mike_smith@gmail.com

    int indexof_ = email.indexOf("_");
    int indexofAtSign= email.indexOf("@");
    int indexOfDot = email.indexOf(".");

    String firstName = email.substring(0,indexof_);
    firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
    System.out.println("firstName = " + firstName); // Mike

    String lastName = email.substring(indexof_+1,indexofAtSign);
   // lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

    // If you want to use charAT method BE CAREFUL : you get "char" NOT STRING
  //  lastName = (""+lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();
    lastName = lastName.toUpperCase().charAt(0)+lastName.substring(1).toLowerCase();
    // lastName.substring(0,1) : it is my first character at the lastname word
    System.out.println("lastName = " + lastName);

    String domainName = email.substring(indexofAtSign+1,indexOfDot);
    System.out.println("domainName = " + domainName);
}
}
