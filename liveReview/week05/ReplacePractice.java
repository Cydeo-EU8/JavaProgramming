package week05;

public class ReplacePractice {
    public static void main(String[] args) {

        String word = "github";

        System.out.println(word.replace("hub","lab")); // actually an object is created but not assigned to a reference (so we an unreferenced object) Garbage collector cleans that object
// JAVA Memory Usage Topic

        System.out.println("word = " + word);

    }
}
