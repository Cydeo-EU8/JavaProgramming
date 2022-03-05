package week08;

import java.util.Arrays;

public class ArraysUtilityExamples {
    public static void main(String[] args) {

        int [] nums = {5 , 10 , 4, 1000, 35};

        // Arrays utility class created by Java developers and it has some useful methods that we can use

        Arrays.sort(nums);  // sorting your elements from smaller to larger

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        int [] numsTwo = {4, 5 , 10, 35, 1000};

        int [] numsThree = nums; // creating a new refernce for the same the object

        // Arrays.equals()  is used to check if two arrays' contents are equal
        System.out.println("Arrays.equals(nums,numsTwo) = " + Arrays.equals(nums, numsTwo));

        System.out.println(nums == numsTwo); // false checking if the object is equal

        System.out.println(nums == numsThree); // true
        System.out.println(Arrays.equals(nums,numsThree)); // true

        nums[0]=5000;
        System.out.println(Arrays.toString(numsThree));

        // copy of method

        int [] numsFour = Arrays.copyOf(nums,nums.length);
        nums[0] = 3000;

        System.out.println(Arrays.toString(numsFour));

    }
}
