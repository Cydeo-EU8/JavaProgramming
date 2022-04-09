package week13;

public class PasswordTest {
    public static void main(String[] args) {
        Password password = new Password();

        password.getPassword();

        String myPassword = password.getPassword();

        System.out.println(myPassword);
    }
}
