package week06;

public class EncryptPassword {

    /**
     * 5.
     * Given a string password. Encrypt with "x" a given password
     * and print.
     * (do with for loop)
     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
     */

    public static void main(String[] args) {

        String password = "cydeo";

        char encryptWithChar = 'x';

        String encryptedPassword = "";

        for(int i = 0; i < password.length() ; i++){
            // i stands for index of password string
            encryptedPassword += ""+password.charAt(i)+encryptWithChar;  // String + char + char = String
        }

        System.out.println("encryptedPassword = " + encryptedPassword);

    }
}
