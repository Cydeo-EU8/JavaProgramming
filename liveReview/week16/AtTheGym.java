package week16;

public class AtTheGym {
    public static void main(String[] args) {

//        Exercise exercise = new Exercise() ; // can NOT be instantiated - NO OBJECTS of this class

        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        // polymorphism
     //   Exercise polyObject = new Running(); next week topic

        running.start();
        running.perform();

    }
}
