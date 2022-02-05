package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        //123Enter
        Scanner input = new Scanner(System.in); //

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //Wooden SpoonEnter

        System.out.println("Enter your Programming Language:");
        String programming = input.nextLine(); //Java Programming LanguageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt(); //25

        input.nextLine(); // capture the Entre key that user pressed for nextInt()

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }

}
