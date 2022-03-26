package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeUsefulMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        System.out.println(list);
        // Explain why the following code displays [1, 3] rather than [2, 3].

        list.remove(Integer.valueOf(1));
        System.out.println(list);


        // Both of these methods you will need to use at the automation
        // array to array list
        String [] array = {"red","green","blue"};
       ArrayList<String> listTwo = new ArrayList<>(Arrays.asList(array));
        System.out.println(listTwo);

        // array list into an array

        String [] arrayTwo = new String [listTwo.size()]; // size is fixed to 3
        listTwo.toArray(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));

        // how to make an int array to an Integer ArrayList
        int [] arrayThree = {1,2,3,4};

        ArrayList<Integer> listThree = new ArrayList<>();

      //  listThree.addAll(Arrays.asList(arrayThree));
        /*
        java: incompatible types: cannot infer type arguments for java.util.ArrayList<>
    reason: inference variable E has incompatible bounds
      equality constraints: java.lang.Integer
      lower bounds: T,int[]
         */

        for(Integer each : arrayThree){ // autoboxing
            listThree.add(each);
        }
        System.out.println(listThree);

    }
}
