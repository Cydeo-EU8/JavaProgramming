package week16;

public class Running extends Exercise{

    @Override
    public void perform() {
        System.out.println("Performing Running Exercise on the Track");
    }

    @Override
   public int getCaloriesCount(int minutes) {
        return minutes*13;
    }

    //  public abstract void run();  you can declare your methods as abstract in regular classes


}
