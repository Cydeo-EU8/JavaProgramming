package week19;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        // Does NOT allow duplicates: helps you to implement some coding algorithms

        String str = "zzzzoooooxxxxxxxaaaabbbcccccddddeeee"; // str to char array
        List<String> listOne = new ArrayList<>();
        listOne.addAll(Arrays.asList(str.split("")));
        System.out.println("listOne = " + listOne);

        Set<String> linkedHashSet = new LinkedHashSet<>(); // to keep my insertion order
        linkedHashSet.addAll(listOne); // What happens at this line, duplicates are removed
        System.out.println("stringSet = " + linkedHashSet);
        linkedHashSet.add(null);
        System.out.println("stringSet after adding null = " + linkedHashSet);

        Set<String> hashSet = new HashSet<>(); // if we don't need any kind of order we can go ahead with HashSet, we can put one null value
        hashSet.addAll(listOne);
        System.out.println("stringSet1 = " + hashSet);
        hashSet.add("g");
        hashSet.add("null");
        System.out.println("stringSet1 = " + hashSet);

        Set<String> treeSet = new TreeSet<>(); // orders the list: sorting ==>> according to the asci table
        treeSet.addAll(listOne);
      //  treeSet.add(null); // Exception in thread "main" java.lang.NullPointerException
        System.out.println("stringSet2 = " + treeSet);


    }
}
