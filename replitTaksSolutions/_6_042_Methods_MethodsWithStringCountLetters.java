//Write a method **countLetters** that can count letters in a given string and return
// a new string in the given format:
//
//        ```
//        number of letters + letter
//        ```
//
//        Example:
//
//        ```
//        input: countLetters("aaabbcccc");
//
//        output: "3a2b4c"
//        ```


import java.util.Scanner;

public class _6_042_Methods_MethodsWithStringCountLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

        int stringLength=str.length();
        int counter;
        String strOrj=str;
        String tmp="";

        //first remove the duplicates and find the characters in the string
        for(int i=0;i<stringLength;i++)
        {
            for(int j=i+1;j<stringLength;j++)
            {
                if(Character.compare(str.charAt(i),str.charAt(j))==0 &&
                        Character.compare(str.charAt(j),' ')!=0)
                {
                    str=str.substring(0,j) + " " + str.substring(j+1);
                }
            }
        }
        //remove the blanks and obtain the short string with only one occurence.
        str=str.replace(" ","");

        //use the short string above and find the number of occurences in the original string
        for(int i=0;i<str.length();i++)
        {
            counter=0;

            for(int j=0;j<stringLength;j++)
            {
                if(Character.compare(str.charAt(i), strOrj.charAt(j))==0)
                {
                    counter++;
                }
            }

            if(counter!=0)
            {
                tmp+=Integer.toString(counter)+Character.toString(str.charAt(i));
            }
        }

        return tmp;
    }
}
