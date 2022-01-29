package week03;

public class DivisionAndRemainderPractice {
    public static void main(String[] args) {

        // input is some amount of seconds (45000)
        // hours : minutes : seconds

        int inputSeconds = 4000;
        int hours,minutes,seconds; // declared
        /*
        Algorithm:
        1. 1 minute is 60 seconds, 1 hour 3600 seconds
        2. remainder operator to turn inputSeconds to find seconds
         */

        seconds = inputSeconds%60; // calculate remaining seconds
        minutes = (inputSeconds/60) % 60; // remaining minutes
        hours = inputSeconds / 3600; // how many hours we have
// from Discord : Hi Oscar can you explain a bit how we can crate a variable called address by concatenating ( String street, city, state) and int zipcode, from patient information
        String clock = "Hours : " +hours+" Minutes : "+minutes+" Seconds : "+seconds;

        System.out.println("clock = " + clock);
    }

}
