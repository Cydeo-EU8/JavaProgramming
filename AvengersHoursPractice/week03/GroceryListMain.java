package week03;

import java.util.Scanner;

public class GroceryListMain {
    public static void main(String[] args) {

        GroceryList shoppingList = new GroceryList();

        printInstructions();

        boolean Continue = true;

        Scanner input = new Scanner(System.in);

        while (Continue){

            System.out.println("Enter your NEXT choice: ");
            int choice = input.nextInt();
            input.nextLine();

                switch (choice){
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        System.out.println(shoppingList);
                        break;
                    case 2:
                        System.out.println("Enter your grocery item: ");
                        shoppingList.addGroceryList(input.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter item number: ");
                        int itemNo = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter a replacement item : ");
                        String newItem = input.nextLine();
                        shoppingList.modifyGroceryItem(itemNo,newItem);
                        break;
                    case 4:
                        System.out.println("Enter item number that will be removed :");
                        int itemNoRemove = input.nextInt();
                        input.nextLine();
                        shoppingList.removeGroceryItem(itemNoRemove);
                        break;
                    case 5:
                        System.out.println("Put the item name that you are looking for : ");
                        String searchItem = input.nextLine();
                        System.out.println(shoppingList.findItem(searchItem));
                        break;
                    case 6:
                        Continue = false;
                        break;
                }
        }
    }

    public static void printInstructions() {

        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search an item from the list.");
        System.out.println("\t 6 - To quit the application.");

    }
}
