package week16;

public class FreeWeight extends Lifting{
    @Override
    void perform() {
        System.out.println("Lifting Free Weight with dumbbells");
    }

    @Override
    int getCaloriesCount(int minutes) {
        return 0;
    }

    @Override
    public void endLift() {

    }
    /*
    How many methods does this class have to implement
     */
}
