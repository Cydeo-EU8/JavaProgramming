package week01;

public class StringManipulatorTest {
    public static void main(String[] args) {

        StringManipulator objectOne = new StringManipulator("java");
        System.out.println(objectOne.str);

        StringManipulator objectTwo = new StringManipulator("selenium");
        System.out.println(objectTwo.str);

        objectOne.firstTwoChars(); // called the method-> I want my method do the ACTION
        System.out.println(objectOne.str);
        System.out.println(objectTwo.str);

        System.out.println(objectOne.x); // you need to call the attribute or method so they get into effect

        String str = "oscar";
        StringManipulator objectThree = new StringManipulator(str);
        System.out.println(objectThree.str);
        objectThree.str="rabia";
        System.out.println(objectThree.str);


        // call the tripler method with our second object

        String password = objectTwo.tripler();
        System.out.println("password = " + password);
    }
}
