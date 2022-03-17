//Write the method **won(char[])** that should determine who won in tic-tac-toe game.
//
//        - If X player won, return string: "Player X won"
//        - If O player won, return string: "Player O won"
//
//        Example:
//
//        char[] game1 = {
//        'X', 'X', 'X',
//        '-', 'O', '-',
//        '-', 'O', '-'
//        };
//
//        Result: Player X won

import java.util.Scanner;

public class _6_049_Methods_MethodsWithArraysTicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] game = new char[9];
        for(int i=0; i < game.length; i++)
        {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }



    public static String won(char[] x)
    {

        for (int a = 0; a < 8; a++)
        {
            String line = null;

            switch (a)
            {
                case 0:
                    line = "" + x[0] + x[1] + x[2];
                    break;
                case 1:
                    line = "" + x[3] + x[4] + x[5];
                    break;
                case 2:
                    line = "" + x[6] + x[7] + x[8];
                    break;
                case 3:
                    line = "" + x[0] + x[3] + x[6];
                    break;
                case 4:
                    line = "" + x[1] + x[4] + x[7];
                    break;
                case 5:
                    line = "" + x[2] + x[5] + x[8];
                    break;
                case 6:
                    line = "" + x[0] + x[4] + x[8];
                    break;
                case 7:
                    line = "" + x[2] + x[4] + x[6];
                    break;
            }
            //For X winner
            if (line.equals("XXX"))
            {
                return "Player X won";
            }
            // For O winner
            else if (line.equals("OOO"))
            {
                return "Player O won";
            }
        }

        return "No player won";

    }
}
