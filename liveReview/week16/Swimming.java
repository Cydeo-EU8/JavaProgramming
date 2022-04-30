package week16;

public class Swimming extends Exercise{
    @Override
    protected void perform() {
        System.out.println("Swimming in the pool doing laps");
    }

    @Override
    protected int getCaloriesCount(int minutes) {
        return minutes*11;
    }
}
