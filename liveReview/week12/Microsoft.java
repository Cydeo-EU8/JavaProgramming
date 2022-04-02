package week12;

public class Microsoft {
    public static void main(String[] args) {

        String[] arr = {"ab","cv","ed"};

        Employee employee1 = new Employee();
       // employee1 ---> is just a reference
        System.out.println(employee1.asString());
        employee1.name = "Emir";
        employee1.jobTitle="Product Owner";
        employee1.ID = 100;
        employee1.salary= 250000;
        System.out.println(employee1.asString());
        
        Employee[] testers = {
              new Employee("Yasin","SDET",123,150000),
              new Employee("Erol","QA Lead",101,170000),
              new Employee("Rumeysa","QA Engineer",232,120000),
              new Employee("Dilek","SDET",134,155000)  
        };
        
        // let's find max salary 
        double maxSalary = Double.MIN_VALUE;
        for(Employee each : testers){
            System.out.println(each.asString());
            // each is a reference for our objects created inside the array
            if(each.salary>maxSalary)
                maxSalary = each.salary;
        }

        System.out.println("maxSalary = " + maxSalary);

        System.out.println(testers[0].name);

    }
}
