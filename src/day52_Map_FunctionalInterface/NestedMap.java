package day52_Map_FunctionalInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new LinkedHashMap<>(); // employeeId & jobTitle
        map1.put(11, "SDET");
        map1.put(12, "SM");
        map1.put(13, "BA");
        map1.put(14, "Developer");
        map1.put(15, "PO");


        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Shay", 100000);
        map2.put("Hulya", 110000);
        map2.put("Veronica", 115000);
        map2.put("Ali", 150000);
        map2.put("Alex", 160000);


        Map< Map<Integer, String>,  Map<String, Integer> > mapOfMap = new LinkedHashMap<>();
        mapOfMap.put(map1, map2);

        for (Map.Entry<Map<Integer, String>, Map<String, Integer>> mapMapEntry : mapOfMap.entrySet()) {

            for (Map.Entry<Integer, String> entry : mapMapEntry.getKey().entrySet()) {
                System.out.println(entry.getValue());
            }

            for (Map.Entry<String, Integer> entry : mapMapEntry.getValue().entrySet()) {
                System.out.println(entry.getKey());
            }

        }

        System.out.println("------------------------------------------------");

        System.out.println( mapOfMap.get(map1).get("Veronica") );

        System.out.println("------------------------------------------------");


        Map< Map<Map<Integer, Integer>, Map<Integer, Integer>>,  Map<Map<Integer, Integer>, Map<Integer, Integer>> > mapOfMapOfMap = new LinkedHashMap<>();


    }


}

/*
    Id   JobTitle  Name  Salary
    11, "SDET"    "Shay", 100000
    12  "SM"     "Hulya", 110000
    13, "BA"     "Veronica", 115000


 */