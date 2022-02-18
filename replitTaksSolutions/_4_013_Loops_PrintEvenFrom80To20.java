//Write a for loop that prints all even integers from 80 through and including 20.
// Separate each number with a space

public class _4_013_Loops_PrintEvenFrom80To20 {
    public static void main(String[] args) {

        int start=80;
        int end=20;

        for(int i=start; i>=end ; i=i-2)
        {
            System.out.print(i);
            if(i!=end)
            {
                System.out.print(" ");
            }
        }
    }
}
