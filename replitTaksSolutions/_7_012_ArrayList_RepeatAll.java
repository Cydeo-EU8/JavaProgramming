//Create a static method that:
//
//        - is called `repeatAll`
//        - returns `ArrayList of Booleans`
//        - takes in a single parameter - an `ArrayList of Booleans`
//
//        This method should modify its ArrayList parameter by repeating its ArrayList values.
//
//        For example, if the parameter is
//
//        ```
//        (true, false, false)
//        ```
//
//        The modified ArrayList should be
//
//        ```
//        (true, false, false, true, false, false)
//        ```

import java.util.ArrayList;
import java.util.Scanner;

public class _7_012_ArrayList_RepeatAll{

    //create your method below
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> booleanList)
    {
        ArrayList<Boolean> newArrayList = new ArrayList<Boolean>(booleanList);

        for(boolean value: booleanList)
        {
            newArrayList.add(value);
        }

        return newArrayList;

    }






    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }

}
