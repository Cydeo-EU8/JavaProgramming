//Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:
//
//
//        zz
//
//        zy
//
//        zx
//
//        zw
//
//        zv
//
//        yz
//
//        ....
//
//        vv

public class _4_005_Loops_PrintLettersCombinations {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        for(char i='z';i>='v';i--)
        {
            for(char j='z';j>='v';j--)
            {
                System.out.print(i);
                System.out.print(j);
                System.out.println();
            }
        }

    }
}
