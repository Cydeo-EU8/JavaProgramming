package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

    //unchecked exception:

        int a = 10;
        int b = 0;

         // System.out.println(  a / b  );
        //System.out.println("Wooden Spoon");

        char[] characters = {'A', 'B', 'C'};
        //                    0,   1,   2

      //  System.out.println( characters[99] );

        Student student = null;

        // System.out.println( student.getName() );
        //student.study();

       final String str = "Wooden Spoon";

       // str = null;

     //   System.out.println( str.toUpperCase() );

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty());



    // checked Exception:

        System.out.println("Hello");

     //   Thread.sleep(3000); // checked

        System.out.println("Cydeo");


       // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); // unchecked









    }

}
