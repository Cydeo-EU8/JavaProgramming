package week04;

public class TernaryExample {

    public static void main(String[] args) {

        int score1 = 25;
        String result1 = "";

        if(score1>60){
            result1 = "Pass";
        }else {
            result1 = "Fail";
        }

        // Same logic with ternary

        int score2 = 65;
        String result2 = (score2>60)? "Pass":"Fail";
        System.out.println("result2 = " + result2);

        System.out.println((score2>60)? "Pass":"Fail");


    }
}
