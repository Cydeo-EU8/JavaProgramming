package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency( Arrays.asList(arr) , each );
            if(frequency == 1){
                result.put(each, frequency);
            }
        }


        System.out.println(result);


    }

}
/*
1. Write a program that can find the unique characters from a String

			Ex:
					str = "aabcccdeeeef";

			output:
					{b=1, d=1, f=1}

 */