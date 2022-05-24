package week06;

import java.util.*;

public class SetOfProducts {
    public static void main(String[] args) {

        Set<Product> products = new TreeSet<>() ;  //

        /*
        Set : does not keep duplicate results
        HashSet : random order
        TreeSet: it is ordered ---> However in order to be able to use this your class has to extend comparable interface
        LinkedHashSet: keeps insertion order
         */

        products.add(new Product("book",24.99));
        products.add(new Product("newspaper",5.99));
        products.add(new Product("magazine",7.99));
        /*
        Since a user might enter a null object to our TreeSet and there is a chance to get RunTime Exception, we surround our code with try catch, so our execution is NOT interrupted
         */

        try {
            products.add(new Product("book",24.99));
            products.add(new Product("newspaper",5.99));
            products.add(new Product("magazine",7.99));
            products.add(null);  // RunTime Exception
        }catch (Exception e){

        }
        System.out.println(products);

        for(Product eachProduct: products ){
            if(eachProduct.getName().equalsIgnoreCase("newspaper")){
                eachProduct.setName("comics");
                eachProduct.setPrice(9.99);
            }
        }

        // Collections.sort(products);
        System.out.println(products);

        Set<Integer> nums = new TreeSet<>();
        nums.addAll(Arrays.asList(3,67,34,56,19));
        System.out.println(nums);

    }
}
