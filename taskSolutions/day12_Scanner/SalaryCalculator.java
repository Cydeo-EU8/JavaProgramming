package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        double hourlyRate = scan.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int weeklyHours = scan.nextInt();

        System.out.println("Enter your state tax rate(in percentage)");
        double stateTaxRate =scan.nextDouble() / 100;

        System.out.println("Enter your federal tax rate (in percentage)");
        double federalTaxRate =scan.nextDouble() / 100;

        scan.close(); // we no longer need scanner after this line

        double salary = hourlyRate * weeklyHours * 52; // 52 weeks in a year
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);


    }

}
/*
3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax r (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */