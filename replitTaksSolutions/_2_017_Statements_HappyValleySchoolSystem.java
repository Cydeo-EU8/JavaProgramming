//In the Happy Valley School System, children are classified by age as follows:
//
//        Assume only positive numbers are given
//
//        less than 2, ineligible
//        2, toddler
//        3-5, early childhood
//        6-7, young reader
//        8-10, elementary
//        11 and 12, middle
//        13, impossible
//        14-16, high school
//        17-18, scholar
//        greater than 18, ineligible
//
//        Given **age** print out the category the student would fall under
//
//        Example:
//
//        ```
//        Enter age:
//        8
//
//        elementary
//        ```

import java.util.Scanner;

public class _2_017_Statements_HappyValleySchoolSystem {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();

        //WRITE YOUR CODE HERE
        switch(age)
        {
            case 1:
                System.out.println("ineligible");
                break;

            case 2:
                System.out.println("toddler");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("early childhood");
                break;

            case 6:
            case 7:
                System.out.println("young reader");
                break;

            case 8:
            case 9:
            case 10:
                System.out.println("elementary");
                break;

            case 11:
            case 12:
                System.out.println("middle");
                break;

            case 13:
                System.out.println("impossible");
                break;

            case 14:
            case 15:
            case 16:
                System.out.println("high school");
                break;

            case 17:
            case 18:
                System.out.println("scholar");
                break;

            default:
                System.out.println("ineligible");
                break;
        }
    }
}
