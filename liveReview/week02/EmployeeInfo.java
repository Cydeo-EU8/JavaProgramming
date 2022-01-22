package week02;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
         * name
         * companyName ----- camelCase  first letter starts small, second one starts Capital
         * jobTitle
         * gender --- char  M/F
         * salary  ---  double
         * employeeID  -- int
         * hasBenefits(Y/N) --- boolean  true/false
         * isMarried --- char  Y/N
         */
        String name, companyName, jobTitle;
        name  = "Oscar";
        companyName = "Cydeo";
       // String jobTitle = "Instructor"; // can NOT double declare, will give compiler error
        jobTitle = "Instructor";
        char gender = 'M';
        int employeeId = 1483;
        boolean hasBenefits =  true;
        char isMarried = 'Y';

        System.out.println("Print all the data we have here");





    }
}
