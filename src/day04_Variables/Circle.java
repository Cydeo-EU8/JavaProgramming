package day04_Variables;

public class Circle {

    public static void main(String[] args) {
        //PI, radius, diameter, area, perimeter
        double radius = 5.5;

        double PI = 3.14;

        double diameter = radius * 2;  // finds the diameter by multiplying the radius to 2
        double area = radius * radius * PI; // finds the area of the circle
        double perimeter = diameter * PI;  // finds the perimeter of the circle

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }


}
/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = diameter * PI
 */


