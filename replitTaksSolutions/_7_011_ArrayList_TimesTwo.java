//Create a method that:
//
//        - is called `timesTwo`
//        - returns an `ArrayList` of Integers
//        - takes in a single parameter - an `ArrayList` of `Integers` called `nums`
//
//        This method should take the ArrayList parameter and multiply every value by two.

import java.util.ArrayList;
import java.util.Scanner;

public class _7_011_ArrayList_TimesTwo {

    //create your method below
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums)
    {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        for(int value: nums)
        {
            newArrayList.add(value*2);
        }

        return newArrayList;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }

}
