//Complete the method **isPalindrome()** that will check if number is a palindrome. Print your result as a boolean (true or false).
//        > Challenge: Do not convert int into a string!
//
//        Examples:
//
//        ```
//        input: 1001
//
//        output: true
//        ```
//
//        ```
//        input: 1234
//
//        output: false
//        ```

import java.util.Scanner;

public class _6_009_Methods_PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int originalNum, reversedNum, remainder;

        originalNum=num;
        reversedNum=0;

        while (num != 0)
        {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
