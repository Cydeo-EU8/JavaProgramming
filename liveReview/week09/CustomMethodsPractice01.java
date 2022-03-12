package week09;

public class CustomMethodsPractice01 {
    public static void main(String[] args) {
        int personOneAge = 10;
        if(personOneAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }

        int personTwoAge = 20;
        if(personTwoAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }

        int personThirdAge = 30;
        if(personThirdAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }

        System.out.println("==============================");

        eligibleOrNot(personOneAge);
        eligibleOrNot(personTwoAge);
        eligibleOrNot(personThirdAge);
        eligibleOrNot(45);
    }

    public static void eligibleOrNot(int age){  // no return type
        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }
    }
}
