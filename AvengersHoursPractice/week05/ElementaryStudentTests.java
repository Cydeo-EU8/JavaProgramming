package week05;

public class ElementaryStudentTests {
    public static void main(String[] args) {

        ElementaryStudent student = new ElementaryStudent();
// if I need my codes to execute until the end then I need to surround my (possible)exceptions with try-catch
       try {
           student.setName("Max");
           student.setAge(1);   // will throw an exception
       }catch (Exception e){
           e.printStackTrace();
       }


        System.out.println("Some more executions");
        System.out.println("Some more executions");
        System.out.println("Some more executions");
        System.out.println("Some more executions");
        System.out.println("Executions Completed");

// WE HANDLED THE EXCEPTION: HOW? we surround with try and catch

    }
}
