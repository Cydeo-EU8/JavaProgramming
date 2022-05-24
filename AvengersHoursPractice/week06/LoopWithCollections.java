package week06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopWithCollections {
    public static void main(String[] args) {

        List<Carpet> carpets = new ArrayList<>();
        
        carpets.add(new Carpet(50));
        carpets.add(new Carpet(100));
        carpets.add(new Carpet(150));
        carpets.add(new Carpet(200));
        
        // loop using for each loop
        
        for(Carpet eachCarpet : carpets){
            System.out.println("eachCarpet.getCost() = " + eachCarpet.getCost()); // eachCarpet represents each object
        }

        // loop with iterating with index
        for(int i=0; i<carpets.size();i++){
            System.out.println("carpets = " + carpets.get(i).getCost()); // carpets.get(i) represents each carpet object
        }

        // looping using forEach method , with lambda expression

        carpets.forEach(n -> System.out.println(" each carpet Cost() = " + n.getCost())); // n represents each carpet object

        // Loop with Iterator
        Iterator<Carpet> it = carpets.iterator();
        while (it.hasNext()){
            double cost = it.next().getCost();  // it.next() represents our carpet objects
            System.out.println("cost of each Carpet = " + cost);
        }

    }
}
