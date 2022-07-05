package week07;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source ="";
      //  String source ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        for(int i=33; i<=122;i++){
            source+=(char)i;
        }

        System.out.println(source.length());
        System.out.println("source = " + source);

        String password = "";

        Random random = new Random(); // I create a random object so I can generate random numbers

        for(int i=1;i<=8;i++){   // $t34mik5
            int index = random.nextInt(source.length()+1); // randomly up to 71 : between 0 - 70, 71 is not included
            System.out.println("index = " + index);
            password+=source.charAt(index);
        }

        System.out.println("password = " + password);
    }
}
