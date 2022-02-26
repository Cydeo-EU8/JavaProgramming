package week07;

public class WhileHungary {
    public static void main(String[] args) {
  //      boolean isHungary = true;
        int bananas = 0;
        int countToFull = 3;
  /*
        while(isHungary){
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C "+bananas);
            // unicodes :
            // condition that will change the boolean to false

            if(bananas==countToFull){
                isHungary = false;
            }
        }
*/

        while (true){
            // condition that will take us out of the loop
            if(bananas==countToFull){
                break;  // branching statement
            }
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C "+bananas);

        }
        System.out.println("Had enough bananas, let's get back to study");

    }

}
