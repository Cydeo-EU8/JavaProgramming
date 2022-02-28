package day19_LoopsAndString;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter your hourly rate:");
            int hourlyRate = scan.nextInt();

            if(hourlyRate <= 0 ){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work in a week?");
            int weeklyHours = scan.nextInt();

            if(weeklyHours <= 0){
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate:");
            double stateTaxRate = scan.nextDouble();

            if(stateTaxRate <= 0 || stateTaxRate > 0.1){
                System.err.println("Invalid Entry for state tax rate");
                System.exit(0);
            }

            double federalTaxRate = 0.26;

            int salaryBeforeTax = hourlyRate * weeklyHours * 52; // salary is equal to one week' salary * 52
            double stateTax = salaryBeforeTax * stateTaxRate / 100;
            double federalTax = salaryBeforeTax * federalTaxRate / 100;
            double totalTax = stateTax + federalTax;
            double salaryAfterTax = salaryBeforeTax - totalTax;

            System.out.println("Gross pay is: $" + salaryBeforeTax  );
            System.out.println("State tax = $" + stateTax);
            System.out.println("Federal tax = $" + federalTax );
            System.out.println("Total tax = $" +totalTax );
            System.out.println("Net income = $"+salaryAfterTax);

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while( !(a.equals("yes") || a.equals("no")) ){
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")){
                System.out.println("Thank you for using Cydeo salary calculator app!");
                break;
            }

        }


        scan.close();

    }

}
