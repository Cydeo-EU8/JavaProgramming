package week15.checkedExceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException{

        //Thread.sleep(5000);  // throws or causes an InterruptedException, which is a checked exception
        // 1. Try Catch
        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }
        System.out.println("I will move on with my web automation");

        // 2. Declare using the Throws Keyword
        Thread.sleep(5000);
        System.out.println("More automation after 5 more seconds");


    }
}
