package week16;

public class FreeWeight extends Lifting{
    public FreeWeight(double weight) {
        super(weight);
    }

    @Override
    void perform() {
        System.out.println("Lifting Free Weight with dumbbells");
    }

    @Override
    int getCaloriesCount(int minutes) {
        return (int) (minutes*6*(weight/100));
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
    /*
    How many methods does this class have to implement
     */
}
