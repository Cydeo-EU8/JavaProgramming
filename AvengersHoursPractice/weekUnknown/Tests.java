package weekUnknown;

public class Tests {
    public static void main(String[] args) {

        for(int i = 100; i <100000 ; i++){
            if(PracticeTasks.isArmstrong(i)){
                System.out.println("i = " + i);
            }
        }

        String[] steps = {"x/","y/","../","z/","./"};

        System.out.println(PracticeTasks.minSteps(steps));


    }
}
