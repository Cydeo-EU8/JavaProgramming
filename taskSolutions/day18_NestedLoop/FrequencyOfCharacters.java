package day18_NestedLoop;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "aabcccd";
        String result = ""; //a2b1c3d1


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;
        }


        System.out.println(result);


    }


}
/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

        Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

 */