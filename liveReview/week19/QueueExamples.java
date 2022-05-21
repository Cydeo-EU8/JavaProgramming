package week19;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<String> cities = new ArrayDeque<>();

        cities.add("Ankara");
        cities.addAll(Arrays.asList("NewYork","Athens","Washington","Brussels","Paris"));

        Queue<String> citiesLinkedList = new LinkedList<>();
        citiesLinkedList.addAll(cities);

        // These data structures works as FIFO: First In First Out

        for (int i = 0; i < cities.size(); ) {
            // FIFO
            System.out.println(cities.poll()); // brings the head of the list and deletes
          //  System.out.println(cities.peek()); // brings the head and does not delete

        }
        System.out.println("cities.size() = " + cities.size());

        for (int i = 0; i < citiesLinkedList.size(); ) {
            // FIFO
            System.out.println(citiesLinkedList.poll()); // it did not require casting

        }
        System.out.println("citiesLinkedList.size() = " + citiesLinkedList.size());

    }
}
