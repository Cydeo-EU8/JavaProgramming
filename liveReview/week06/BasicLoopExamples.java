package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {
        /**
         * Question-1:

         Write a for loop that displays the following set of numbers:

         0,10,20,30,40,50,...1000

         int i=0 : initialization
         i<=1000 : condition
         i+=10   : iteration

         */

        for(int i=0  ;  i<=1000   ;  i+=10 ){  // i: local variable, only works inside for loop
            System.out.print(i+" ");
        }
        System.out.println();
        //==================================
       // initialization
          int z = 0;   // global variable for the whole class
          for(  ; z <= 1000 ;  ){
              if(z%10==0) {
                  System.out.print(z + " ");
              }
              z++;
              // z+=10;  // iteration
          }

        System.out.println("z = " + z);
        // difference: if we make the initialization outside the for loop, the variable z can be used within the entire class. Or when the initalization is made within the for loop as usual, then the z only belongs to the loop  
        /**
         * Question-2:

         Write a program that
         displays all odd numbers between 3-130
         in the same line
         */

        for (int i = 3; i < 130 ; i += 2){

                System.out.print(i + " ");

        }

/*
		 * Question-3:

			Write a program that displays
			the number of even numbers between 5 and 50 (included)
                I am asking How Many
		 */
        System.out.println();
        int countOfEven=0;
        for(int i=5;i<=50;i++){
            if(i%2==0){
                ++countOfEven;
            }
        }
        System.out.println("Count Of Even numbers between 5 and 50 = " + countOfEven);
        /**
         *
         * Question-4:

         Print the table of 12 using for loop.
         Output should be in following format:
         12 X 1 = 12
         12 X 2 = 24
         12 X 3 = 36
         12 X 4 = 48
         12 X 5 = 60
         12 X 6 = 72
         12 X 7 = 84
         12 X 8 = 96
         12 X 9 = 108
         12 X 10 = 120
         */

        int j = 1;
        for( ; j<=10 ; j++ ){
            System.out.println("12 X "+j+" = "+(12*j));
        }


    }

}
