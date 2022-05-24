package week06;

public class Calculator {
    public Floor floor; // floor is an instance variable for Calculator class and also serves as the object of Floor class
    public Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }

   // totalCost = cost(meter square) * area (total meter square)

   public double getTotalCost(){
        double cost = carpet.getCost();
        double area = floor.getArea();
        return cost*area;
   }

}
