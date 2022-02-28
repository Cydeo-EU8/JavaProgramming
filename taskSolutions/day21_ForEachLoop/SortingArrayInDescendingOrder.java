package day21_ForEachLoop;

import java.util.Arrays;

public class SortingArrayInDescendingOrder {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] result = new int[arr.length];

        for (int i = arr.length-1, j =0; i >=0 ; i--) {
               result[j] = arr[i];
        }

        System.out.println(Arrays.toString(result));

    }


}
/*
1. Write a program that sort the array of integer in descending order
 */