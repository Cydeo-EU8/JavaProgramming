package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A02_DistinctNumbers {
    // it will get input from user, and only will store distinct numbers to our arraylist

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  // empty arraylist for our input (integer objects)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (input ends with 0) : ");

        int value;

        do{                                     // line 19-24 reads the values of user with a loop
            value =input.nextInt();
            if(!list.contains(value) && value !=0){ // if arraylist does NOT contain and not equal to zero
                list.add(value);
            }
     }while (value != 0);

        for (Integer numbers : list) {
            System.out.print(numbers+" ");
        }
        System.out.println();

        // get the size of our array
     System.out.println("the size of our array "+list.size());

        // I want to sort my Arraylist

        // Collections Utility Class comes with many useful methods

        Collections.sort(list);

        System.out.println(list);

    }
}
