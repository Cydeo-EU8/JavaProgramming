package week02;

public class CustomMethodsExample {

    public static void main(String[] args) {
        int sum;

        sum = add(5,6);

        double sumTwo = add(5.5,6.5);

     //    double sumThree = add(5.5,5); this one is calling viod method, it does not return anything

        add(5.5,5);
    }

    // create a static public custom method that adds two numbers

    public static int add(int x,int y){
        return x+y;
    }

    public static double add(double x,double y){

        return (x+y);
    }

    public static void add(double x,int y){ // same name with diff parameters
        System.out.println(x+y); // the action is just printing, However in real life our void methods will open browser, do some tests for us
    }

    // for different implementation of the same method: we can overload our method. How? Same name with different parameters. (we don't care about return type)
}
