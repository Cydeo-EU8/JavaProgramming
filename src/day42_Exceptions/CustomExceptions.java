package day42_Exceptions;

class FadyException extends RuntimeException{ // custom unchecked exception

    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){
        super(message);
    }

}


class NoBreakException extends Exception{ // custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args)  {

      // throw new FadyException("It's time for lunch break");


        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }


    }

}
