package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        /*
        System.out.println( true == !false ); // true
        System.out.println( !true != false ); // false
        System.out.println( !false == true); // true

        System.out.println(!!false); //false
        System.out.println(!!!true); // false

         */

        int score = 85; // 0 ~ 100

        boolean a = score >= 90 && score <= 100; //false
        boolean b = score >= 80 && score <= 89; //true
      //  boolean b = score >= 80 && !a; // if score is A, but score is greater than 80

        boolean c =  score >= 70 && score <= 79; //false
       // boolean c =!a && !b && score >= 70

        boolean d = score >= 60 && score <= 69; // false

        boolean f = score>=0 && score <= 59; // false
      //  boolean f = !a && !b && !c && !d;

        if(a) { //if the student made an A
            System.out.println("Excellent");
        }

        if(b) { // if the student made a B
            System.out.println("Great");
        }

        if(c) { // if the student made a C
            System.out.println("Good");
        }

        if(d) { // if the student made a D
            System.out.println("Passed");
        }

        if(f) { // if the student made F
            System.out.println("Failed");
        }


    }

}

/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed

 */
