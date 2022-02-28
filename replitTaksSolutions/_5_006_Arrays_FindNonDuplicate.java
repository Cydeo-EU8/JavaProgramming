//Given an array **nums** with 7 integers every element is repeated twice - _except one_.
// Find that element and print it to console.
//
//        Example:
//
//        ```
//        nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
//
//        ```

import java.util.Scanner;

public class _5_006_Arrays_FindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        int counter=0;

        for(int i=0;i<nums.length;i++)
        {
            counter=0;

            for(int j=0;j<nums.length;j++)
            {
                if(i!=j && nums[i]==nums[j])
                {
                    counter++;
                }
            }

            if(counter==0)
            {
                System.out.println(nums[i]);
                break;
            }

        }
    }
}
