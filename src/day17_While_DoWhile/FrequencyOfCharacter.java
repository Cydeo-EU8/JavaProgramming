package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
        String str = "AAABBBCAAAAAAAAAAAAAAAAA";

        char ch = 'B';

        int frequency = 0; //1+1+1

        for (int i = 0; i < str.length() ; i++) { // i: indexes of str
            char eachChar = str.charAt(i);  //eachChar: each character of str

            if(ch == eachChar){ // if given ch is matching with the eachChar, then ch is appeared in the string
               // frequency++;
                frequency += 1;
            }

        }

        System.out.println(frequency);



    }


}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */