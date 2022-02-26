package week07;

public class Task01 {
    public static void main(String[] args) {
/*
* Print below pattern using loop
        rows : 5
        columns : 5
			1
			2 -"4"- 6                               : row-1
			3 -"4"- 7 -"3"- 10                      : row-1, row-2
			4 -"4"- 8 -"3"- 11 -"2"-13              : row-1, row-2, row-3
			5 -"4"- 9 -"3"- 12 -"2"-14 -"1"- 15     : row-1, row-2, row-3, row-4
 */

        int rowCount = 5;
        for(int row=1; row<=rowCount ; row++){

            int value = row;
            for(int col = 1; col <=row ; col++){
                System.out.print(value+" ");
                value += rowCount - col; // adding 4 for col=1, adding 3 col=2
            }
            System.out.println();


        }


    }
}
