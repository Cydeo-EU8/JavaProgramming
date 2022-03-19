package week10;

public class WrapperClassExamples {

    public static void main(String[] args) {

        int i1 = 100;

        Integer i2 = i1; // Auto-boxing : from primitive to Object Type

        // explicit example
        Long i3 = (long)i1;

        Integer n1 = 300;

        int n2 = n1; // un-boxing : from object to primitive

    }
}
