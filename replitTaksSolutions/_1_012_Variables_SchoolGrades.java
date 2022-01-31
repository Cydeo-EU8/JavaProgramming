//Write the program that will calculate the average grade. Use 5 String variables and 6 double variables to hold the subject and the grade value. Build a summary with all the information by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.
//
//        Execution flow with example:
//
//        ```
//        Welcome to the Grader!
//        Please enter subject name number 1 and score for this subject
//        Math
//        5.0
//        Please enter subject name number 2 and score for this subject
//        Biology
//        4.2
//        Please enter subject name number 3 and score for this subject
//        English
//        4.4
//        Please enter subject name number 4 and score for this subject
//        Chemistry
//        4.8
//        Please enter subject name number 5 and score for this subject
//        Music
//        3.4
//
//        Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
//        Your average score is: 4.36
//        Thank you for using Grader!
//        Goodbye!
//        ```

import java.util.Locale;
import java.util.Scanner;

public class _1_012_Variables_SchoolGrades {
    public static void main(String[] args) {
        // Enter your code here
        String subject1, subject2, subject3, subject4, subject5;
        double grade1, grade2, grade3, grade4, grade5;

        Scanner scan=new Scanner(System.in).useLocale(Locale.US);

        //WRITE YOUT CODE HERE:
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        subject1=scan.next();
        grade1=scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        subject2=scan.next();
        grade2=scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        subject3=scan.next();
        grade3=scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        subject4=scan.next();
        grade4=scan.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        subject5=scan.next();
        grade5=scan.nextDouble();

        System.out.println("Summary: " + subject1 + " - " + grade1 + ", " +
                subject2 + " - " + grade2 + ", " +
                subject3 + " - " + grade3 + ", " +
                subject4 + " - " + grade4 + ", " +
                subject5 + " - " + grade5);
        System.out.println("Your average score is: "+ (grade1 + grade2 + grade3 + grade4 + grade5)/5);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");
    }
}
