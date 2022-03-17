//Method **addElements** accepts 2 int arrays and adds each element value of two arrays and
// returns a new array.
//        You can assume that each array has 5 elements
//
//        ```
//        addElements([10, 40, 50, 3, 1], [11, 0, 500, 44, 1101]);
//
//        return array after adding values in the arrays:
//        [21, 40, 550, 47, 1102]
//        ```


import java.util.Arrays;
import java.util.Scanner;

public class _6_051_Methods_MethodsWithArraysAddElements {
    public static int[] addElements(int[] ints1, int[] ints2)
    {

        for(int i=0; i < 5; i++)
        {
            ints1[i] += ints2[i];
        }

        return ints1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[5];
        int [] nums2 = new int[5];

        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }


        for(int i=0; i < nums.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(addElements(nums, nums2)));
    }
}
