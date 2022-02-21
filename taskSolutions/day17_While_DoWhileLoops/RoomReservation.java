package day17_While_DoWhileLoops;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;


        System.out.println("Which room would you like to select?");
        System.out.println("\t\tKing Bed == $120");
        System.out.println("\t\tQueen Bed == $100");
        System.out.println("\t\tSingle Bed == $80");

        String word = scan.nextLine().toLowerCase();

        while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {
            System.out.println("Invalid Entry, Please Re-Enter");
            word = scan.nextLine().toLowerCase();
        } // to make sure user selected either the king bed, or queen bed or single bed

        total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

        System.out.println("Your total price is: $" + total);

        scan.close();


    }


}
/*
5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */