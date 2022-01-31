package day08_SingleIf;

public class EligibleToBuyCigarettes {

    public static void main(String[] args) {

        byte age = 21;

        boolean eligible = age >= 21;

        if(eligible){
            System.out.println("Eligible to buy ");
        }

        if(!eligible){
            System.out.println("Not eligible to buy ");
        }

    }

}
/*
1. Given a number (byte) age, write a program that can check if the
person is eligible to buy Cigarettes
 */
