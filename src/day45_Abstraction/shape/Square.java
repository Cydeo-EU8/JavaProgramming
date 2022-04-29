package day45_Abstraction.shape;

public class Square extends Shape{

    private double side;

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
          throw new RuntimeException("Invalid Side: "+side);
        }
        this.side = side;
    }


    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "side=" + side +
                '}';
    }


}
