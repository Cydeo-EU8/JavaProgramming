//Given an array **nums**, count and print the number of even numbers in the array
//
//        Examples:
//
//        ```
//        nums → [2, 1, 2, 3, 4]) → 3
//
//        nums → [2, 2, 0, 3, 5]) → 3
//
//        nums → [1, 3, 5, 7, 9]) → 0
//        ```

import java.util.Scanner;

public class _5_004_Arrays_CountEvens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below

        int counter=0;
        for(int num : nums)
        {
            if(num%2==0)
            {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
