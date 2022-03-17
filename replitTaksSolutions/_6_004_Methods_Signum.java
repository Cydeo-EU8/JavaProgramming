//Given a method **sign** write the code so that its takes a number arguement and tells you
// if its positive, negative or zero.
//
//        for example :
//
//        ```
//        sign(5)  => positive
//        ```
//
//        ```
//        sign(-30) => negative
//        ```
//
//        ```
//        sign(0)  => zero
//        ```


import java.util.Scanner;

public class _6_004_Methods_Signum {
    public static void sign(int n){
        //your code here
        if(n>0)
        {
            System.out.println("positive");
        } else if(n<0)
        {
            System.out.println("negative");
        } else
        {
            System.out.println("zero");
        }


    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }
}
