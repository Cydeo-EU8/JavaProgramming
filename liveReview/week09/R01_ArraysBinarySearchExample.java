package week09;

import java.util.Arrays;

public class R01_ArraysBinarySearchExample {

    public static void main(String[] args) {

        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421}; //  25: 0, 1, 2    -(2+1), 700 : 0,1,2,3,4  -(4+1)=-5

        int indexOne = Arrays.binarySearch(nums, 23);  // this statement returns index of 23

        System.out.println("indexOne = " + indexOne);  // 1

        System.out.println(Arrays.binarySearch(nums, 2344 )); // 4

        System.out.println(Arrays.binarySearch(nums, 25)); // -3

        System.out.println(Arrays.binarySearch(nums, 700));

        if(Arrays.binarySearch(nums, 12346)>=0){
            System.out.println("12346 is present in array");
        }else {
            System.out.println("12346 is not in the list");
        }

        int[] numsTwo = {56, 3, -67, 100, 1000, 75};

        Arrays.sort(numsTwo); // in order to use binarySearch method, it needs to be sorted first

        System.out.println(Arrays.binarySearch(numsTwo, 100));

        System.out.println(Arrays.binarySearch(numsTwo, 60));


    }
}
