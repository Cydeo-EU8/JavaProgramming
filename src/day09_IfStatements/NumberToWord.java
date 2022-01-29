package day09_IfStatements;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        number= input.nextInt();
        String word;

        if (number==0){
            word = "Zero";
        }
        else if (number==1){
            word = "One";
        }
        else if (number==2){
            word = "Two";
        }
        else if (number==3){
            word = "Three";
        }
        else if (number==4){
            word = "Four";
        }
        else if (number==5){
            word = "Five";
        }
        else if (number==6){
            word = "Six";
        }
        else if (number==7){
            word = "Seven";
        }
        else if (number==8){
            word = "Eight";
        }
        else if (number==9){
            word = "Nine";
        }
        else{
            System.out.println("INVALID - That is not a number");
            word = null;
        }

        System.out.println("The number you've entered is: "+word);

    }
}
