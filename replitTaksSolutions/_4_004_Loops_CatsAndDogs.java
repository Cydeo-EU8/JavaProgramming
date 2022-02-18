//Print true if the string _"cat"_ and _"dog"_ appear the same number of times
// in the given string _word_.
//
//
//        Example:
//
//        ```
//        input: catdog
//        output: true
//        ```
//
//        Example:
//
//        ```
//        input: catcat
//        output: false
//        ```
//
//        Example:
//
//        ```
//        input: cat-cheetah-dog-cat
//        output: false
//        ```

import java.util.Scanner;

public class _4_004_Loops_CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        int lastIndex;

        String word = scan.next();

        //for cats
        lastIndex=0;
        while(lastIndex != -1)
        {
            lastIndex = word.indexOf("cat",lastIndex);

            if(lastIndex != -1)
            {
                countOfCats ++;
                lastIndex += "cat".length();
            }
        }

        //for dogs
        lastIndex=0;
        while(lastIndex != -1)
        {
            lastIndex = word.indexOf("dog",lastIndex);

            if(lastIndex != -1)
            {
                countOfDogs ++;
                lastIndex += "dog".length();
            }
        }

        if(countOfCats==countOfDogs)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
