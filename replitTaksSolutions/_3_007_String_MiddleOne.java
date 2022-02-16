//You have a word, do the following:
//
//        1. When word has **odd number of characters and:**
//
//        - **3 or more characters, print middle letter**
//
//        ```
//        oak ==> a
//        ```
//
//        ```
//        javav ==> v
//        ```
//
//        - **Single character, print that character 3 times**
//
//        ```
//        # ==> ###
//        ```
//
//        ```
//        q ==> qqq
//        ```
//
//        2. When word has **even number of characters and**:
//
//        - **4 or more characters**, print the middle 2 characters
//
//        ```
//        java ==> av
//        ```
//
//        ```
//        apples ==> pl
//        ```
//
//        ```
//        #$%^&* ==> %^
//        ```
//
//        - **2 characters,** print those 2 characters twice
//
//        ```
//@@ ==>@@@@
//```
//
//        ```
//        $$ ==>$$$$
//        ```
//
//        ```
//        hi ==> hihi
//        ```

import java.util.Scanner;

public class _3_007_String_MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if(word.length()==1)
        {
            System.out.println(Character.toString(word.charAt(0))
                    + Character.toString(word.charAt(0))
                    + Character.toString(word.charAt(0)));
        }
        else if(word.length()==2)
        {
            System.out.println(Character.toString(word.charAt(0))
                    + Character.toString(word.charAt(1))
                    + Character.toString(word.charAt(0))
                    + Character.toString(word.charAt(1)));
        }
        else if(word.length()>=3 && word.length()%2==1)
        {
            System.out.println(Character.toString(word.charAt(word.length()/2)));
        }
        else if(word.length()>=4 && word.length()%2==0)
        {
            System.out.print(Character.toString(word.charAt(word.length()/2-1))
                    + Character.toString(word.charAt(word.length()/2)));
        }
    }
}
