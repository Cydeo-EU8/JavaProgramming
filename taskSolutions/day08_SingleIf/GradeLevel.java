package day08_SingleIf;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradeLevel = 3;

        boolean elementary = gradeLevel>= 1 && gradeLevel <= 5;
        boolean middle = gradeLevel>= 6 && gradeLevel <= 8;
        boolean high = gradeLevel>= 9 && gradeLevel <= 12;
        boolean college = gradeLevel>= 13 && gradeLevel <= 16;
        boolean grad = gradeLevel>= 17 && gradeLevel <= 18;

        if (elementary){
            System.out.println("Elementary school");
        }

        if (middle){
            System.out.println("Middle school");
        }

        if (high){
            System.out.println("High school");
        }

        if (college){
            System.out.println("College school");
        }

        if (grad){
            System.out.println("Grad school");
        }


    }

}

/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
        grade level and types are:

                1-5: Elementary school
                6-8: Middle school
                9-12: High school
                13-16: College
                17-18: Grad School

        Assume that the given number is 1 ~ 18
 */