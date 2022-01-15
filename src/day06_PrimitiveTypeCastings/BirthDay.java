package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {
        String name = "Aaron";
        int birthDay = 25;
        String month = "April";
        int birthYear = 1995;

        //John was born on month/day/year.
        System.out.println(name + " was born on " + month + "/" +birthDay +"/"+birthYear );

        System.out.println("-----------------------------------------------");

        // My favorite book is "bookName"
        String bookName = "The Rich Dad and The Poor Dad";

        System.out.println("My favorite book is " +  "\"" +bookName + "\"");
        /*
        \n
        \t
        \"
        \\

         */

        /*
        System.out.println(x);
        int x =200;

         */


    }

}

/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */