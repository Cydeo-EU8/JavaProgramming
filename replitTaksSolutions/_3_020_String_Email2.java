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

import java.util.Scanner;

public class _3_020_String_Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int indexOf_ = email.indexOf("_");
        int indexOfAtSign = email.indexOf("@");
        int indexOfDomain = email.indexOf(".");

        String firstName = email.substring(0,1).toUpperCase() + email.substring(1, indexOf_);

        String lastName = email.substring(indexOf_ + 1, indexOf_ + 2).toUpperCase() + email.substring(indexOf_ + 2, indexOfAtSign);

        String domain = email.substring(indexOfAtSign+1, indexOfDomain);

        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);

    }
}
