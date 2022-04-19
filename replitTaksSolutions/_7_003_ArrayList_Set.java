//The ``.set()`` ArrayList method will set the value of a particular index to the given value.
//
//        Given the following ArrayList...
//
//        ```
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(4);
//        nums.add(2);
//        nums.add(8);
//        nums.add(1);
//        nums.add(-1);
//        ```
//
//        (the values of this arraylist are 4,2,8,1,-1)
//
//        The following code will set the element at the 2nd index to be 99 and the element
//        at the 0th index to be 100.
//
//        ```
//        nums.set(2,99);
//        nums.set(0,100);
//        ```
//
//        Notice how it works:
//
//        ```
//        arraylistvariable.set(index to set, new value);
//        ```
//
//        Finish the code so the ArrayList will have `200 in index 1` and `50 in index 3`

import java.util.ArrayList;

public class _7_003_ArrayList_Set {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(8);
        nums.add(1);
        nums.add(-1);
        nums.set(2,99);
        nums.set(0,100);

        nums.set(1,200);
        nums.set(3,50);


        //System.out.println(nums.toString());
        System.out.println(nums);

    }
}
