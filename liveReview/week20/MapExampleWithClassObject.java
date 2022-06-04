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
        empTwo.setInfo("Lex","De Haan","AD_VP",17000,90);

        cydeo.put("empThree",empThree);


      //  System.out.println("cydeo = " + cydeo);


    }
}
