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
          
    }

}
