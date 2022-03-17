//The **waterTax** method calculates a water bill. The method takes a double and returns a double.
//
//        The more water you use the more it will cost you
//
//        >Cost `under 50`:
//
//        ```
//        bill = units * 0.60;
//        ```
//
//        >Cost `above 50`:
//
//        ```
//        bill = units * 0.90;
//        ```
//
//        > Cost above 100 the calculation is same as `above 50` but an additional 50 fine
//
//        > Cost above 150 its the same as `above 50` but an additional 100 fine
//
//
//        Examples:
//
//        ```
//        waterTax(50)
//
//        returns 30
//        ```
//
//        ```
//        waterTax(55)
//
//        returns 49.5
//        ```
//
//        ```
//        waterTax(101)
//
//        returns 140.9
//        ```
//
//        ```
//        waterTax(151)
//
//        returns 235.9
//        ```

import java.util.Scanner;

public class _6_023_Methods_MethodsWithReturnWaterTax {
    public static double waterTax(double units){
        double bill = 0.0;

        //your code here
        if(units<=50)
        {
            bill = units * 0.60;
        }
        else if(units>50 && units<=100)
        {
            bill = units * 0.90;
        }
        else if(units>100 && units<=150)
        {
            bill = units * 0.90 + 50;
        }
        else if(units>150)
        {
            bill = units * 0.90 + 100;
        }


        //end your code here

        return bill;
    }//end waterTax

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }
}
