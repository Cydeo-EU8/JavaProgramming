package day10_NestedIf_Ternaries;

public class Loans {

    public static void main(String[] args) {

        int salary = 60000,
                creditScore = 700;

        String result = (salary >= 60000 && creditScore >= 650) ? "Loan Approved"
                        : "Loan Denied";

        System.out.println(result);

    }

}

/*
6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise, print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */
