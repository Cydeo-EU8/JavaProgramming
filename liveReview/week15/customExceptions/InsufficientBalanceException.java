package week15.customExceptions;

public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException(){}

    public InsufficientBalanceException(String message){super(message);}

}
