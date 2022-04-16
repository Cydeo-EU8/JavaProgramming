package week14;

import java.util.ArrayList;

public class FinalKeyword {

    final int b;  // initialization is mandatory
    final static int c;
 //   final int d; compiler error
 //   d=10;

    public FinalKeyword(int b){
       this.b=b;
    }

    static {
      //   b= 10; Because static block cannot access to instance members
        c=5;
    }



    public static void main(String[] args) {

        // local variables:if we don’t use it, initialization is not mandatory.
        final int a;
        a=100;
        System.out.println(a);

        // Final Arrays

        final int[] nums = {1,2,3};
        System.out.println(nums[0]);
        nums[0]=5;
        System.out.println(nums[0]);

     //   nums = new int[]{5,6,7}; // We can not assign a new array object to our array reference variable ----> Error

        // Final ArrayList
        final ArrayList<String> colors = new ArrayList<>();

        colors.add("Orange");
        colors.add("red");

        colors.remove(0);

       // colors = new ArrayList<>(); ----> Error

        // What is becoming final :
       // final keyword is used for 'Variable'

    }
}
