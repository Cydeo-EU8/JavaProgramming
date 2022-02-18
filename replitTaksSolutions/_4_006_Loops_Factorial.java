//In mathematics a **factorial** of a positive integer _n_, denoted by _n_!,
// is the product of all positive integers less than or equal to _n_.
// Calculate factorial and output result to the console.
//
//
//        Example:
//
//        ```
//        input: 5
//        output: 120
//
//        5 * 4 * 3 * 2 * 1

import java.util.Scanner;

public class _4_006_Loops_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long result=1; //0! equals 1

        while(n>0)
        {
            result= result*n;
            n--;
        }

        System.out.println(result);

        /*
         long sum =1;
    for(int i =1;i<=n;i++){
      sum *= i;
    }
    System.out.println(sum);
  }
         */
    }
}
