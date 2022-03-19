package week10;

public class R04_HighScore {
    public static void main(String[] args) {

        displayHighScorePosition("Yasin",1);

        int x = calculateHighScorePosition(600);
        displayHighScorePosition("Ali",x);
        displayHighScorePosition("Ali",calculateHighScorePosition(600));

    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+ position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000){
            return 1;
        }else if(playerScore >=500 && playerScore <1000){
            return 2;
        }else if(playerScore >=100 && playerScore <500){
            return 3;
        }else return 4;
    }

}
