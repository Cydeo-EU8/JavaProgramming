//A fast food company has two main order types, burger meal and chicken meal.
//
//        Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.
//
//        - If the order is burger price is 10.0
//        - If the order is chicken price is 10.0
//        - If the order is soda price is 2.0
//        - If the order is fries price is 3.5
//
//        hint: or operator in java is  ||
//
//        Examples:
//
//        ```
//        burger
//
//        10.0
//        ```
//
//        ```
//        chicken
//
//        10.0
//        ```
//
//        ```
//        soda
//
//        2.0
//        ```


import java.util.Scanner;

public class _2_025_Statements_BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();

        //your code here
        double burger_chicken_price=10.0;
        double soda=2.0;
        double fries=3.5;

        switch(in)
        {
            case "burger":
            case "chicken":
                System.out.println(burger_chicken_price);
                break;

            case "soda":
                System.out.println(soda);
                break;

            case "fries":
                System.out.println(fries);
                break;
        }

    }
}
