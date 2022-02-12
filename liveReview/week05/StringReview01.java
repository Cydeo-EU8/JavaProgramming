package week05;

public class StringReview01 {
    public static void main(String[] args) {

        String str1 = "Java";  // literal way of creating
        // string object is created in the HEAP memory, there is a special place called "String Pool"
        String str2 = "Java"; // litaral

        System.out.println(str1 == str2); // true: THE REASON : both str1 and str2 references are pointing to the same object in the memory

        String str3 = new String("Java"); // over here we are creating totally a new object

        System.out.println(str1 == str3); // false: The Reason : str1 and str3 are pointing to a different objects

        // What does equals() method do? It is checking for the value of the object
        System.out.println((str1.equals(str3))); // true

        String str4 = new String("JAVA");
        // if you want to check without case sensetivity
        // equalignorecase method
        System.out.println(str2.equalsIgnoreCase(str4)); // true
    }
}
