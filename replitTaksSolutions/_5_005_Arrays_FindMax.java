//Given an array **num**, get the max number in the array and print it out to the console.
//
//        ```
//        nums → [2, 4, 2, 3, -2]) → 4
//        nums → [2, 2, 5, 3, 0 ]) → 5
//        nums → [1, 33, 5, 7, 9]) → 33
//        ```
//
//        hint:
//
//        _create a variable called max and before you start searching assume the first item value is the max._
//
//        _loop through each and every item and check for whether the value max is less than the item value._
//
//        _if so assign the value to the max to overwrite existing max._
//
//        _you will get the max value when you are done with the loop_

import java.util.Scanner;

public class _5_005_Arrays_FindMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.

        int max = Integer.MIN_VALUE;

        for(int num: nums)
        {
            if (num > max)
            {
                max=num;
            }
        }

        System.out.println(max);

    }
}
