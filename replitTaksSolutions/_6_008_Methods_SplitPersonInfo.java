//The method **person** has a string arguement with this format:
//        "name,last name,age". Print out the person's information
//
//        Example:
//
//        ```
//        person("jon,doe,30");
//
//        output:
//        person name: jon
//        last name: doe
//        age: 30
//        ```
//
//        hint: use the `split` method to split the string to a string array where there is a "," char


import java.util.Scanner;

public class _6_008_Methods_SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here
        String[] tmp= info.split(",",3);
        System.out.println("person name: "+tmp[0]);
        System.out.println("last name: "+tmp[1]);
        System.out.println("age: "+tmp[2]);

    }
}
