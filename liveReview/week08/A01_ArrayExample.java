package week08;

import java.util.Arrays;

public class A01_ArrayExample {

    public static void main(String[] args) {
        // declare and initialize an Array

        int code = 200;

        int[] codes = new int[8]; // my codes array holds 8 elements, they are all int type
        System.out.println(Arrays.toString(codes)); // how we print an array

        codes[0]=200; // first element
        codes[1]=201; // second element
        System.out.println(Arrays.toString(codes));

        int[] statusCodes = {200,201,204,400,401,403,404,500}; // another way of declaring and initializing

        System.out.println("-----------size of an array---------");

        // String str = "Java" ;  str.length()----> size of the string

        // for arrays, lentgh gets no parameter and returs an integer
        System.out.println("the size of our array: "+statusCodes.length);

        int sizeOfArrays = statusCodes.length; // 8, use it for creating loops

        String[] responseTypes = new String[]{"OK","Created","No Content","Bad Request","Unauthorized","Forbidden","Not Found","Internal Server Error"};

        for (int i = 0; i < sizeOfArrays ; i++) {
            String text = statusCodes[i]+" : "+responseTypes[i];
            System.out.println("Each Status Code means = " + text);

        }


    }
}
