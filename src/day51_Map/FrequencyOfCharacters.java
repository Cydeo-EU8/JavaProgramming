package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //           bca
        //           235
        //Collections.frequency()

       String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>(); // {b=2, c=3, a=5}

        for (String each : arr) { // each: characters of string
            int frequency = Collections.frequency( Arrays.asList(arr), each);
            result.put(each,  frequency  );
        }

        System.out.println(result);

    }

}

/*
2. Write a program that can return the frequency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */