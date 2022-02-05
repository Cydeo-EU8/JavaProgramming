package week04;

public class TrafficLightSelector {
    public static void main(String[] args) {
        char color = 'r';

        switch (color){
            case 'R': case 'r':   // or logic
                System.out.println("Red Light");
                break;
            case 'O': case 'o':   // or logic
                System.out.println("Orange Light");
                break;
            case 'G': case 'g':   // or logic
                System.out.println("Green Light");
                break;
            default:
                System.out.println("Invalid Light");
        }
    }
}
