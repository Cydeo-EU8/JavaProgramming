package week12;

public class Telephone {
    /*
    Write the definition of a class Telephone.
The class has no constructors, one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92.
Create getNumber() and setNumber() methods that will manipulate with number instance variable.
     */

    // no constructor means that we will use default construstor

    public String number;

    public static int quantity;

    public static double total;

    static {
        quantity = 250;
        total = 15658.92;
    }

    public void setNumber(String number){
        this.number= number;
    }

    public String getNumber(){
        return this.number;
    }

}
