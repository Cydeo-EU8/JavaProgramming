package week08;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {

        String searchResult = "1-16 of 829 results for ipad";

        // in my test cases I want to verify that my search result comes over 500

       // split method turns your string into array

       String[] each = searchResult.split(" ");

        System.out.println(Arrays.toString(each));

        String searchAmount = each[2];

        System.out.println("searchAmount = " + searchAmount);
        
      // Break time task : capture the amount 790 with split method
        String confirmation = "Id: 2239677\n" +
                "Amount: 790 USD\n"+
                "Card Number: 8548595959595\n"+
                "Name: oscar\n"+
                "Date: 11/10/2021";

        System.out.println("confirmation = " + confirmation);
        // chain your codes together
        String amount = confirmation.split("\n")[1].split(" ")[1];
        System.out.println("amount = " + amount);

        //  confirmation.split("\n") -> array
        // confirmation.split("\n")[1] -> the second element in the array, so it is string, so I can split again, and provide index of second element I get amount

    }
}
