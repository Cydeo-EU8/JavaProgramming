package week19;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        // Does NOT allow duplicates: helps you to implement some coding algorithms

        String str = "aaaabbbcccccddddeeee"; // str to char array
        List<String> listOne = new ArrayList<>();
        listOne.addAll(Arrays.asList(str.split("")));
        System.out.println("listOne = " + listOne);

        Set<String> stringSet = new LinkedHashSet<>(); // to keep my insertion order
        stringSet.addAll(listOne); // What happens at this line, duplicates are removed
        System.out.println("stringSet = " + stringSet);
        stringSet.add(null);
        System.out.println("stringSet after adding null = " + stringSet);

    }
}
