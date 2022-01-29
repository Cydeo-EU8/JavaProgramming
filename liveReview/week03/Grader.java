package week03;

public class Grader {

    public static void main(String[] args) {
        // for a given score assign Letter scores: 100-90 (inclusive): A, 89 -  80 : B , 79 - 70 : C, 69 - 60 : D, Below is F
        int score = 90;

        // do sanity check

        if(score >= 0 && score <= 100){
            System.out.println("Your score is valid");
            if(score <=100 && score >= 90){
                System.out.println("A");
            }else if(score <90 && score >= 80){
                System.out.println("B");
            }else if(score <80 && score >= 70){
                System.out.println("C");
            }else if(score <70 && score >= 60){
                System.out.println("D");
            }else {
                System.out.println("F");
            }
        }else{
            System.out.println("Not valid score");
        }

        // if I give values very close to limits of my tests
        // such as 101,99,-1,0,1   : Boundary Value Test
    }
}
