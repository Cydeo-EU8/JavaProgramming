package week11;

import java.util.Arrays;

public class A01_AddElementToArray {
    // create a method that adds new element to an Array
    // method will accept String Array, and String variable, and will return a new String array with the string variable added to the array

    public static void main(String[] args) {
        String [] browserTypes = {"Chrome","Firefox","Safari"};
        String newBrowserOne = "Edge";
        String newBrowserTwo = "Opera";

        browserTypes = addElement(browserTypes,newBrowserOne);
        System.out.println(Arrays.toString(browserTypes));
        // browserTypes : is reference variable to our Array Object, and can be reassigned
        browserTypes = addElement(browserTypes,newBrowserTwo);
        System.out.println(Arrays.toString(browserTypes));
    }

    public static String[] addElement (String[] arr,String element){
        String [] newArray = new String[arr.length+1]; // I am creating a totally a new array
        int i = 0;
        for( ; i< arr.length; i++){
            newArray[i]=arr[i];
        }
        newArray[i]=element;
        return newArray;
    }
}
