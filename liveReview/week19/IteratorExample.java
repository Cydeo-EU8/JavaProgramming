package week19;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        /*
1. We need to ***create iterator object to able to use*** it***.***
2. ***We move the pointer using next() method***
3. ***hasNext() method return true, if there is still next value***
4. *We can remove values using remove() method*
         */

        List<Integer> nums = new LinkedList<>();
        nums.addAll(Arrays.asList(34,67,33,12,11,65,100));
        Iterator<Integer> it = nums.iterator();

//        System.out.println("it.next() = " + it.next());
//        System.out.println("it.next() = " + it.next());
//        System.out.println("it.next() = " + it.next());
//        System.out.println("it.next() = " + it.next());
//        System.out.println("it.next() = " + it.next());
//        System.out.println("it.next() = " + it.next());
//        System.out.println("it.next() = " + it.next());  // CTRL+D: Windows

        // hasNext() method
        
        while (it.hasNext()){
            System.out.println("it.next() = " + it.next());
           it.remove(); // to remove each element

        }
        System.out.println("nums = " + nums.size());
        // Iterator is another way of looping inside your collection


        List<Integer> nums2 = new LinkedList<>();
        nums2.addAll(Arrays.asList(34,67,33,12,11,65,100));

        for (Integer integer : nums2) { // Exception in thread "main" java.util.ConcurrentModificationException
            nums2.remove(integer);
        }
    }
}
