package week05;

public class ReplacePractice {
    public static void main(String[] args) {

        String word = "github";

        System.out.println(word.replace("hub","lab")); // actually an object is created but not assigned to a reference (so we an unreferenced object) Garbage collector cleans that object
// JAVA Memory Usage Topic

        System.out.println("word = " + word);

        System.out.println(word.replace('i','o'));

        String searchResult = "1-48 of over 6,000 results for java";
        String actualResult = searchResult.replace("1-48 of over ","")
                .replace(" results for java","");


        String expectedResult = "6000";

        if(expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
