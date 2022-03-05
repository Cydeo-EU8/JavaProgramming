package day24_CustomMethods_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String str = "cccccccddddaaaaaaabbbbbbbb";
         str = removeDuplicates(str);

        System.out.println(str);


    }


    //1. create a method that can remove duplicated characters from a string and returns the new value
    public static String removeDuplicates(String str){ //"aaabbcc" ==> "abc"

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result += each;
            }

        }

        return result;

    }

}
