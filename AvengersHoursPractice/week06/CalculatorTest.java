package week06;

public class CalculatorTest {
    public static void main(String[] args) {

        Floor floorOfLivingRoom = new Floor(4,7);
        Carpet carpetFirstClass = new Carpet(200);
        Calculator calculator = new Calculator(floorOfLivingRoom,carpetFirstClass);

        System.out.println("TotalCost() of Living Room = " + calculator.getTotalCost());


        calculator = new Calculator(new Floor(3,3),new Carpet(75));
        System.out.println("TotalCost() of Kids Room = " + calculator.getTotalCost());
    }
}
