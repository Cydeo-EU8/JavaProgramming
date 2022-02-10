package day15_ForLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Java";

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        System.out.println(result);

    }

}
/*
7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */