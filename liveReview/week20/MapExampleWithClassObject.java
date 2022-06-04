package week20;

import java.util.*;

public class MapExampleWithClassObject {
    public static void main(String[] args) {

    Map<String,Object> cydeo = new LinkedHashMap<>();

    Employee empOne = new Employee();
    empOne.setInfo("Steven","King","AD_PRES",24000,90);

    cydeo.put("empOne",empOne);

        Employee empTwo = new Employee();
        empTwo.setInfo("Neena","Kochar","AD_VP",17000,90);

        cydeo.put("empTwo",empTwo);

        Employee empThree = new Employee();
        empThree.setInfo("Lex","De Haan","AD_VP",17000,90);

        cydeo.put("empThree",empThree);


      //  System.out.println("cydeo = " + cydeo);
        
        /*
        Find Neena's Salary: verify that it is equal to 17000
        1. Iterate through Map with keySet method
        2. Find the person
        3. Retrive Salary
        cydeo.get(eachEmp) ---> this brings value of each key : Object of EMplyee Class
         */
        double expectedSalary =0;
        for (String eachEmp : cydeo.keySet()){
            Employee temp = (Employee) cydeo.get(eachEmp); // this brings an Object, I need to cast it to Employee class object
           // System.out.println("temp = " + temp);
            if(temp.getFirst_name().equals("Neena")){
                expectedSalary = temp.getSalary();
            }
        }
        System.out.println("expectedSalary = " + expectedSalary);
        if(expectedSalary==17000.0){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        /*
        Task:
        Change Steven's Salary to 40.000
         */
        for (Map.Entry<String, Object> eachEmpEntry : cydeo.entrySet()) {
            Employee temp = (Employee) eachEmpEntry.getValue();// this brings an Object, I need to cast it to Employee class object
            if(temp.getFirst_name().equals("Steven")){
                temp.setSalary(40000);
            }
        }
        System.out.println("cydeo = " + cydeo);


    }
}
