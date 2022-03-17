//**_Palindrome_** is a word, phrase, or sequence that reads the same backward as forward.
//        >    Example: madam
//
//        So method **isPalindrome** checks the given String and returns true if `check` is palindrome and false if it is not.
//
//        - make your conditions case insensitive.  ex: _Civic_ and _civic_ are both palindromes
//        - make your conditions space insensitive.  _Race car is_ a palindrome even though there is space in between.
//
//        Examples:
//
//        ```
//        isPalindrome("Noon") ==> true
//        ```
//
//        ```
//        isPalindrome("I am not palindrome") ==> false
//        ```
//
//        ```
//        isPalindrome("wooden") ==> false
//        ```
//
//        ```
//        isPalindrome("Nurses Run") ==> true
//        ```


import java.util.Scanner;

public class _6_043_Methods_Palindrome {
    public static boolean isPalindrome(String check) {

        // your code here
        int stringLength;

        check=check.replace(" ","");
        check=check.toLowerCase();
        stringLength=check.length();

        for(int i=0, j=stringLength-1 ; i<stringLength/2 && j >= stringLength/2; i++, j--)
        {
            if(Character.compare(check.charAt(i), check.charAt(j))!=0)
            {
                return false;
            }
        }

        return true;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }
}
