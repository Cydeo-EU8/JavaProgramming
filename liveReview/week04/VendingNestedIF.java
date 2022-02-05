package week04;

public class VendingNestedIF {
    public static void main(String[] args) {

        String selection = "drink";
        String drinkItem = "coffee";
        String snackItem = "chips";

    // Notes on String equality: we will not use "==" sign for String equality, we will use equals() method


        if (selection == "drink"){
            System.out.println("drink option is selected");
            if(drinkItem == "tea"){
                System.out.println("Tea item selected");
            }else if(drinkItem == "coffee"){
                System.out.println("Coffee item selected");
            }

        }else if (selection == "snack"){
            System.out.println("Snack option is selected");
            if(snackItem == "chips"){
                System.out.println("Chips is selected");
            }else if(snackItem == "candy"){
                System.out.println("Candy is selected");
            }
        }else{
            System.err.println("INVALID ENTRY");
        }


        if(false)
        System.out.println("Hello");
        System.out.println("Running");
    }
}
