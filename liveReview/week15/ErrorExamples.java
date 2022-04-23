package week15;

public class ErrorExamples {
    /*
    Normally we don't try to catch ERROR like the one below
     */
    public static void main(String[] args) {
        try {
            deathlyMethod();
        }catch (StackOverflowError error){
            System.out.println(error.getMessage());
            System.out.println(error.getCause());
            System.out.println(error.getClass());
        }



    }

    static int counter = 0;

    public static void deathlyMethod(){
        System.out.println(counter++);
        deathlyMethod();   // infinite loop
    }

}
