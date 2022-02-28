package day19_LoopsAndString;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "aaabbbbbccd";

        int highestFrequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if(count > highestFrequency){
                highestFrequency = count;
            }

        }


        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if(count == highestFrequency && !result.contains(ch+"")){
                result += ch;
            }

        }


        System.out.println( result);




    }

}
