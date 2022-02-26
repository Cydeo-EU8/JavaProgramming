package week07;

public class FrequencyOfCharacters {
/*
What is pseudocode?  In computer science, pseudocode is a plain language description of the steps in an algorithm or another system. Pseudocode often uses structural conventions of a normal programming language, but is intended for human reading rather than machine reading.
- Iterate over given string with an outer loop so that you can get each get char
- I need an inner loop to itarate again to compare that particular char with the rest of the string
-- Empty Bucket : this will hold each char and its frequency   String result = ""

 */

    public static void main(String[] args) {
        String str = "aabcccd";
        String result = ""; //a2b1c3d1

        for(int i=0; i<str.length();i++){
            char c = str.charAt(i); // 'a'

            int count = 0;

            for(int j=0; j<str.length();j++){
                if(c==str.charAt(j)){
                    count++;
                }
            }
// if I already have that particular char in the bucket, don't execute following codes
            if(result.contains(""+c)){
                continue;
            }

            result+=c;
            result+=count;

        }
        System.out.println("result = " + result);
    }

}
