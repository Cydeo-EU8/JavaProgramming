package week15.customExceptions;

public class CustomExceptionTest {
    public static void main(String[] args) {

        int minutes = 30;
        System.out.println("Class is going on for "+minutes+" minutes");
        if(minutes > 50 ){
            throw new BreakTimeException("It is break time!");
        }
        System.out.println("Let's continue the class another "+(50-minutes)+" minutes");


        double balance = 395.50;
        double itemPrice = 500.0;
        System.out.println("I have "+balance+" Euros in my account the item is "+itemPrice);

        if(itemPrice > balance){
            throw new InsufficientBalanceException("Transaction declined due to insufficient balance hold");
        }


    }





}
