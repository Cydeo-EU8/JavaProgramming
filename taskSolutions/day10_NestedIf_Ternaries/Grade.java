package day10_NestedIf_Ternaries;

public class Grade {

    public static void main(String[] args) {

        char grade = 'A';

        boolean validGrade = (grade >= 'A' && grade <= 'D') || grade == 'F';

        String result = "";

        if(validGrade){

            if(grade == 'A'){
                result = "Excellent";
            } else if (grade == 'B') {
                result = "Great Job";
            }else if (grade == 'C') {
                result = "Good";
            }else if (grade == 'D') {
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{
            result = "Invalid Grade";
        }

        System.out.println(grade);


    }

}

/*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */