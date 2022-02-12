package week05;

public class StringReview02 {
    public static void main(String[] args) {
        /*
        length(): it does not take parameter, it returns an integer number
         */

        String message = "EU8 is Awesome!!";
        int count = message.length();
        System.out.println("how may characters we have : "+count);
        System.out.println(count==16);
        if(message.length()==16){
            System.out.println("happy testing");
        }


    }
}
