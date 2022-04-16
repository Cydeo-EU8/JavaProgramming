package week14;

public class FinalKeyword {

    final int b;  // initialization is mandatory
    final static int c;
 //   final int d; compiler error
 //   d=10;

    public FinalKeyword(int b){
       this.b=b;
    }

    static {
      //   b= 10; Because static block cannot access to instance members
        c=5;
    }



    public static void main(String[] args) {

        // local variables:if we don’t use it, initialization is not mandatory.
        final int a;
        a=100;
        System.out.println(a);
    }
}
