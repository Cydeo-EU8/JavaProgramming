//In this assignment, you will write a program that will generate a shopping list. It's more advanced version of assignment Shopping list I.
//
//        Your program should ask use to enter items followed by its price. After adding item,  ask user if he wants to add one more item. If so, repeat previous steps again. If no, print shopping list report and total price as show in examples. Your program should accept up to 10 items.
//
//        Hint: use do while loop.
//
//
//
//        Example:
//
//
//        ```
//        output: Enter Item1 and its price:
//        input: Tomatoes
//        input: 5.5
//        output: Add one more item?
//        input: yes
//        output: Enter Item2 and its price:
//        input: Cheese
//        input: 3.5
//        output: Add one more item?
//        input: yes
//        output: Enter Item3 and its price:
//        input: Apples
//        input: 6.3
//        output: Add one more item?
//        input: no
//        output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
//        output: Total price: 15.3
//        ```
//
//        Example:
//
//
//        ```
//        output: Enter Item1 and its price:
//        input: Lemons
//        input: 2.3
//        output: Add one more item?
//        input: yes
//        output: Enter Item2 and its price:
//        input: Oranges
//        input: 6
//        output: Add one more item?
//        input: no
//        output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0
//        output: Total price: 8.3
//        ```

import java.util.Scanner;

public class _4_001_Loops_ShoppingList2 {
    public static class ShoppingItem
    {
        public String itemName;
        public double itemPrice;
        ShoppingItem(String itemName, double itemPrice)
        {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int itemCount = 1;
        int arrayCount = 0;
        String item;
        double price;
        String reply;

        double totalPrice = 0;
        ShoppingItem[] list;

        list = new ShoppingItem[50];


        do
        {
            System.out.println("Enter Item"+itemCount+" and its price:");
            item = scan.nextLine();
            price = scan.nextDouble();

            list[arrayCount] = new ShoppingItem(item,price);
            itemCount++;
            arrayCount++;
            System.out.println("Add one more item?");
            scan.nextLine();
            reply=scan.nextLine();
        }
        while(reply.equals("yes"));

        for(int i=1;i<=arrayCount;i++)
        {
            if(i!=arrayCount)
            {
                System.out.print("Item"+i+ ": "+ list[i-1].itemName + " Price: " + list[i-1].itemPrice + ", ");
            }
            else
            {
                System.out.println("Item"+i+ ": "+ list[i-1].itemName + " Price: " + list[i-1].itemPrice);
            }
            totalPrice +=(list[i-1].itemPrice);
        }

        System.out.println("Total price: " + totalPrice);

    }
}
