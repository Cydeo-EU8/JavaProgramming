package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square);

       // square.side = -10000000;
        square.setSide( 15 );

        System.out.println(square);

        System.out.println(square.getName());

        System.out.println("------------------------");

        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println( rectangle.getLength() );

        System.out.println( rectangle);

        System.out.println(rectangle.getName());

        System.out.println("------------------------");

        Circle circle = new Circle(7.5);

        System.out.println(circle);

        //circle.radius = 15.5;

        circle.setRadius(15.5);

        System.out.println( circle.getRadius() );

        System.out.println(circle);

        System.out.println(circle.getName());






    }


}
