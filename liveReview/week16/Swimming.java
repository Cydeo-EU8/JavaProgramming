package week16;

public class Swimming extends Exercise{
    public Swimming(double weight) {
        super(weight);
    }

    @Override
    protected void perform() {
        System.out.println("Swimming in the pool doing laps");
    }

    @Override
    protected int getCaloriesCount(int minutes) {
        return (int) (minutes*11*(weight/100));
    }
}
