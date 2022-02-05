package week04;

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("#####WELCOME TO ADAIRE APARTMENTS#########");
        int numberOfBedrooms = 1;
        double startingPrice = 0;

        switch (numberOfBedrooms) {
            case 0: case 5:  // or logic for switch
                System.out.println("You have selected studio apartment");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("You have selected One Bedroom Apartment");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("You have selected Two Bedroom Apartment");
                startingPrice = 2899.0;
                break;
            default:
                System.out.println(numberOfBedrooms + " bedroom apartment not available");
                break;
        }

        System.out.println("Starting price : $"+startingPrice);

    }
}
