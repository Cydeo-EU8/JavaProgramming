package week20;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {

        // we want to keep insertion order: LinkedHashMap

        Map<String,Object> empOne = new LinkedHashMap<>();
        empOne.put("First_Name","Steven");
        empOne.put("Last_Name","King");
        empOne.put("Job_ID","AD_PRES");
        empOne.put("Salary",24000);
        empOne.put("Deparment_ID",90);
        System.out.println("empOne = " + empOne);


        Map<String,Object> empTwo = new LinkedHashMap<>();
        empTwo.put("First_Name","Neena");
        empTwo.put("Last_Name","Kochhar");
        empTwo.put("Job_ID","AD_VP");
        empTwo.put("Salary",17000);
        empTwo.put("Department_ID",90);
        System.out.println("empTwo = " + empTwo);

        List<Map<String,Object>> cydeo = new ArrayList<>();
        cydeo.add(empOne);
        cydeo.add(empTwo); // all employees added as Maps

        System.out.println("cydeo = " + cydeo);


        // Find salary of Neena
        /*
        Algorithm:
        1. Iterate through the list and maps until we find name=Neena
        2. When you find Neena's Map Data, retrive the salary
         */
        int salary = 0;
        for (Map<String, Object> eachEmployee : cydeo) {

            if(eachEmployee.get("First_Name").equals("Neena")){
                salary= (int) eachEmployee.get("Salary");  // all the values are Object Type, we need to cast
            }
        }
        System.out.println("Neena's salary = " + salary);

    }
}
