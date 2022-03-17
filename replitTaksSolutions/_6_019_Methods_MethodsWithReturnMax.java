//Finish the method **max** which has two parameters, x and max.
//        -  if **x** is bigger than **max** return `x`
//        -  if **max** is bigger than **x** return `max`
//        -  all other cases return `x`
//
//        Example:
//
//        ```
//        max(1,10) -> 10
//        ```
//
//        ```
//        max(11,5) -> 11
//        ```

import java.util.Scanner;

public class _6_019_Methods_MethodsWithReturnMax {
    public static int max(int x, int max){
        // Code here
        if(x>max)
        {
            return x;
        }
        else
        {
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(11,5));
    }

}
