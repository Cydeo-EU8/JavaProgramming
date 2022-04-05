package week02;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamplesWithMethods {
    public static void main(String[] args) {
        // add(Object)
        // create an arraylist that holds String objects
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Denver");
        cities.add("Paris");
        System.out.println(cities);

        // add(index,Object) ---> adds the element to the given index(index must exist)
      //  cities.add(5,"Istanbul"); // checking the size and our index is bigger than size
cities.add(1,"Istanbul");
        // what is the difference between size and capacity?

        System.out.println(cities);

        // Why in arraylists we have to define index at the methods?
        // index based collection, keeps track of the order

        // get(index) ---> returns the element at given index
        System.out.println("cities.get(0) = " + cities.get(0));
        String myCity = cities.get(1);

        // set(index, Object)----> replaces the old element at the given index
        cities.set(0,"New York");

        //indexOf(Object) ----> returns us the first matching index with the given element
        // if the element does not exist it returns -1
        int indexOfParis = cities.indexOf("Paris");
        System.out.println("indexOfParis = " + indexOfParis);

        // size() : return the total number of element
        System.out.println("cities = " + cities.size());

        // index of last element is cities.size()-1

        // contains(): returns boolean
        System.out.println(cities.contains("Istanbul"));

        // remove(index)  -- the element will be deleted at the given index
        System.out.println(cities.remove(0)); // returns the element which is removed
        // remove(Object) --- removes the matching object
        System.out.println("cities removed = " + cities.remove("Istanbul"));
        System.out.println("cities removed = " + cities.remove("Istanbul"));


        // Bulk Operations
        // adding array element in one shot

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.addAll(Arrays.asList(123,234,345,456,123,234));

        System.out.println("before removeAll: "+arrayList);
        // removeAll: to remove multiple elements

        arrayList.removeAll(Arrays.asList(123,345));
        System.out.println("after removeAll: "+arrayList);

        //retainAll(): if you want to retain multiple elements

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Serdar","Ceyhun","Ahmet","Metin","Zehra","Mike","Serdar","Ceyhun"));
        System.out.println("Names before RetainAll"+names);
        names.retainAll(Arrays.asList("Serdar","Ceyhun"));
        System.out.println("Names after RetainAll"+names);

        names.addAll(Arrays.asList("Serdar","Ceyhun","Ahmet","Metin","Zehra","Mike","Serdar","Ceyhun"));

        // removeIf() : removes element according to a condition
        names.removeIf(each->each.length()>5); // each is predicate that holds place of each Arraylist element
        System.out.println(names);

        // clear()  : removes all the objects from the list
        names.clear();

        // isEmpty(): returns true if the arraylist contains NO element
        System.out.println("is Name empty : "+names.isEmpty());

    }
}
