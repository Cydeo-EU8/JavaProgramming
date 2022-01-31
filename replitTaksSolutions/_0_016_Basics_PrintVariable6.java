//Five friends are going to the theater. They have purchased a row of five seats with an aisle on either end.
//
//        5 String variables are already declared to stored their names.
//
//        James doesn't want to sit next to Jill
//        Betty and Herb are dating and want to sit next to each other
//        Bob wants to sit on an left side aisle
//        James wants to sit on the aisle
//        Provide a seating order that conforms to the above rules. An example of an invalid seating order is:
//
//        James, Betty, Herb, Bob, Jill
//        The above arrangement is invalid because: Bob is not sitting on left aisle.
//
//        Specify the seating order as the names separated by commas and a space (as in the above example).
//        Use variables and print names in the right order.

public class _0_016_Basics_PrintVariable6 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        String p1 = "James";
        String p2 = "Jill";
        String p3 = "Bob";
        String p4 = "Betty";
        String p5 = "Herb";
        //WRITE YOUR CODE BELOW THIS LINE:

        System.out.println(p3 + ", " + p2 + ", " + p4 + ", " + p5 + ", " + p1);
    }
}
