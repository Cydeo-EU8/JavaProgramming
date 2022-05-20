package day53_FunctionalInterface;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 6.0);
        unit1.put("Escape Sequences", 3.0);
        unit1.put("Primitives", 6.0);
        unit1.put("Operators", 9.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 14.5);
        unit6.put("OOP Polymorphism", 8.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);

        List<Map<String, Double>> allUnits = new ArrayList<>();
        allUnits.addAll(Arrays.asList(unit1, unit2, unit3, unit4, unit5, unit6));

        // 1. Display each Java topic and its hours on the console

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> entry : eachUnit.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        System.out.println("---------------------------------------------------------");


        //  2. Display the names of the java topics that we spend more than 7 hours
        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> entry : eachUnit.entrySet()) {
                if (entry.getValue() >= 7) {
                    System.out.println(entry.getKey());
                }
            }
        }

        System.out.println("---------------------------------------------------------");
        //   3. Display the names of the java topics that we spend less than 3 hours

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> entry : eachUnit.entrySet()) {
                if (entry.getValue() < 3) {
                    System.out.println(entry.getKey());
                }
            }
        }

        System.out.println("---------------------------------------------------------");
        //   4. Which Java Topic has the maximum hours?
        // 5. Which topic has the minimum hours?

        double max = Double.MIN_VALUE;
        String name1 = "";

        double min = Double.MAX_VALUE;
        String name2 = "";

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> entry : eachUnit.entrySet()) {
                    if(entry.getValue() > max){
                        max = entry.getValue();
                        name1 = entry.getKey();
                    }

                    if(entry.getValue() < min){
                        min = entry.getValue();
                        name2 = entry.getKey();
                    }

            }
        }

        System.out.println("name1 = " + name1);
        System.out.println("max = " + max);

        System.out.println("name2 = " + name2);
        System.out.println("min = " + min);




    }

}

/*
Given the following maps that contains the main java topics that we have covered during the course
and hours that have been spent on them:

        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 6.0);
        unit1.put("Escape Sequences", 3.0);
        unit1.put("Primitives", 6.0);
        unit1.put("Operators", 9.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 14.5);
        unit6.put("OOP Polymorphism", 8.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);
        
    1. Display each Java topic and its hours on the console
    2. Display the names of the java topics that we spend more than 7 hours
    3. Display the names of the java topics that we spend less than 3 hours
    4. Which Java Topic has the maximum hours?
    5. Which topic has the minimum hours?
    
 */