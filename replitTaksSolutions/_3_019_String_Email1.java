//Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.
//
//        Examples:
//
//
//        ```
//        input: mike_tyson@gmail.com
//
//output: tyson_mike@gmail.com
//```
//
//        ```
//        input: barakobama@gmail.com
//
//output: barakobama@gmail.com
//```

import java.util.Scanner;

public class _3_019_String_Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if(email.contains("_"))
        {
            System.out.println( email.substring(email.indexOf("_")+1,email.indexOf("@"))
                    + "_"
                    + email.substring(0,email.indexOf("_"))
                    + email.substring(email.indexOf("@")));
        }
        else
        {
            System.out.println(email);
        }
    }
}
