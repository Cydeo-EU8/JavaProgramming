package day35_Encapsulation.rectangleTask;

public class Test {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println(rectangle);

        rectangle.setLength(10);
        rectangle.setWidth(20);

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        System.out.println(rectangle);


    }

}
