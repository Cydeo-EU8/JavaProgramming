package week05;

public class UsingThrowKeyword {
    public static void main(String[] args) {

        /*
        We can use throw keyword to create an exception object
         */

        String userName = "";

        if(userName.isEmpty()){
            throw new RuntimeException("Username can NOT be empty");
        }




    }
}
