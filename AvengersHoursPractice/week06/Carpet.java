package week06;

public class Carpet {

    private double cost;

    public Carpet(double cost){
       setCost(cost);
    }
// If method's parameter and global parameter is same name we should use this
    public void setCost(double cost){
        if(cost<0)
            this.cost=0;
        else
            this.cost=cost;
    }

    public double getCost() {
        return cost;
    }
}
