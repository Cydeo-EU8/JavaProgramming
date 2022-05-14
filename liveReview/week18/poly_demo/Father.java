package week18.poly_demo;

public class Father extends Parent implements Worker{

    @Override
    public void raiseKid() {
        System.out.println("Raising Kids, helping moms");
    }

    @Override
    public void playWithKid() {
        System.out.println("Playing with Kids occasionally");
    }

    @Override
    public void feedKid() {
        System.out.println("Providing food and supplies to home");
    }

    @Override
    public void work(String job) {
        System.out.println("Working as "+job);
    }

    @Override
    public double getPaid() {
        return 100000.0;
    }
}
