package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee {


    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", id, salary, companyName);
    }

    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }


}