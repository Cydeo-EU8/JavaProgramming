package utilities;

public class AssignmentOperators {

    public static void main(String[] args) {
        
        int i = 100;

        System.out.println("i = " + i);
        
        i+=10;  // i = i+10;

        System.out.println("i = " + i);
        
        i-=10;
        System.out.println("i = " + i);
        
        i*=3;
        System.out.println("i = " + i);

        i/=4;

        System.out.println("i = " + i);

        i%=5;  // re-assign  i value changes each time

        System.out.println("i = " + i);

        String statement = "EU8";
        
        statement+=" Great";

        System.out.println("statement = " + statement);        
        
    }
}
