//Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
//Write a program with a variable that holds the number of mgs of caffeine in a drink and outputs
//how many drinks it takes to kill a person.
//
//        In one gram, there is 1000 mg. Formula to get drink count to cause an overdose is
//
//        Flow: Enter number of milligrams in drink: It would take about # drinks for a lethal overdose.
//
//        10*1000 / numOfMilligrams

import java.util.Scanner;

public class _1_011_Variables_CaffeineOverDose {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:

        int mgInDrink;
        int lethalDose = 10;//in grams

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        mgInDrink=scan.nextInt();

        System.out.println("It would take about " + (lethalDose * 1000)/mgInDrink + " drinks for a lethal overdose.");
    }
}
