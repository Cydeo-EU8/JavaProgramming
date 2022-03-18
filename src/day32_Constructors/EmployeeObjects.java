package day32_Constructors;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");

        Employee employee2 = new Employee("Yuliya", 'F');

        Employee employee3 = new Employee("Olga", 'F', "SDET");


        System.out.println(employee1);

        System.out.println(employee2);

        System.out.println(employee3);

    }


}
