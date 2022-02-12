//Write a program that will calculate laptop price based on the components.
//
//        First ask user for a screen size.
//        - If screen size is equals to 13.3, add  $200 to the laptop price.
//        - If screen size is equals to  15.0 - add  $300 to the laptop price.
//        - If screen size is equals to  17.3 - add  $400 to the laptop price.
//
//        Then ask user for CPU type.
//        - If CPU type equals to i3, add  $150 to the laptop price.
//        - If CPU type equals to i5, add  $250 to the laptop price.
//        - If CPU type equals to i7, add  $350 to the laptop price.
//
//        Then ask user for RAM size.
//        - Add  $50 for every 4GB of ram to the laptop price.
//
//        Then, ask user for storage type. There are 2 options: SSD and HDD.
//        - If it's HDD - add $50 to the laptop price for every 500gb.
//        - If it's SSD - add $100 to the laptop price for every 500GB.
//
//        Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.
//        - Add $100 if it's FULLHD screen
//        - Add $200 if it's 4K screen.
//
//        Example:
//
//        ```
//        Display message: Select screen size:
//        input: 13.3
//        Display message: Select CPU type:
//        input: i7
//        Display message: Select RAM size:
//        input: 8
//        Display message: Select storage type:
//        input: SSD
//        Display message: Enter memory size:
//        input: 1000
//        Display message: Enter screen resolution:
//        input: 4K
//        Display message: Laptop price is: $1050.0
//        ```
//
//        Example #2
//
//
//        ```
//        Display message: Select screen size:
//        input: 13.3
//        Display message: Select CPU type:
//        input: i3
//        Display message: Select RAM size:
//        input: 4
//        Display message: Select storage type:
//        input: HDD
//        Display message: Enter memory size:
//        input: 500
//        Display message: Enter screen resolution:
//        input: FULLHD
//        Display message: Laptop price is: $550.0
//        ```

import java.util.Locale;
import java.util.Scanner;

public class _2_031_Statements_LaptopConfigurator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in).useLocale(Locale.US);
        String screenSize, cpuType, storageType, screenResolution;
        int ramSize, memorySize;
        double price=0;

        System.out.println("Select screen size:");
        screenSize=scan.nextLine();
        if(screenSize.equals("13.3"))
        {
            price+=200;
        }
        else if(screenSize.equals("15.0"))
        {
            price+=300;
        }
        else if(screenSize.equals("17.3"))
        {
            price+=400;
        }

        System.out.println("Select CPU type:");
        cpuType=scan.nextLine();
        if(cpuType.equals("i3"))
        {
            price+=150;
        }
        else if(cpuType.equals("i5"))
        {
            price+=250;
        }
        else if(cpuType.equals("i7"))
        {
            price+=350;
        }

        System.out.println("Select RAM size:");
        ramSize=scan.nextInt();
        price+=(ramSize/4)*50;

        scan.nextLine();

        System.out.println("Select storage type:");
        storageType=scan.nextLine();

        System.out.println("Enter memory size:");
        memorySize=scan.nextInt();

        if(storageType.equals("HDD"))
        {
            price+=(memorySize/500)*50;
        }
        else if(storageType.equals("SSD"))
        {
            price+=(memorySize/500)*100;
        }

        scan.nextLine();

        System.out.println("Enter screen resolution:");
        screenResolution=scan.nextLine();
        if(screenResolution.equals("FULLHD"))
        {
            price+=100;
        }
        else if(screenResolution.equals("4K"))
        {
            price+=200;
        }

        System.out.println("Laptop price is: $"+price);


    }
}
