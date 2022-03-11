package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        arr = addInteger(arr, 5); //{1,2,3,4,5}

        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addDouble(arr2, 5.5); // {1.5, 2.5, 3.5, 4.5, 5.5}

        System.out.println(Arrays.toString(arr2));

        System.out.println("--------------------------------------");

        String[] names = {"Tatiana", "Oleksandr", "Cassandra", "Ali"};  //"Neira"

         names = addString(names, "Neira");  //{"Tatiana", "Oleksandr", "Cassandra", "Ali", "Neira"}

        names = addString(names, "Igor");

        System.out.println(Arrays.toString(names));

        System.out.println("--------------------------------------");

        char[] chars = {'A', 'B', 'C', 'D'};
        chars = addChar(chars, 'E'); //{'A', 'B', 'C', 'D', 'E'}

        System.out.println(Arrays.toString(chars));


    }


    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addInteger(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
       // result[i] = element;
        
        return result;

    }


    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addString(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }
    
    
    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addChar(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }




}
/*
Task2:
		1. create a return method called addInteger that can add an Integer  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array

 */