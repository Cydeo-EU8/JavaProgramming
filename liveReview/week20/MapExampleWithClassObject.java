package week20;

import java.util.*;

public class MapExampleWithClassObject {
    public static void main(String[] args) {

    Map<String,Object> cydeo = new LinkedHashMap<>();

    Employee empOne = new Employee();
    empOne.setInfo("Steven","King","AD_PRES",24000,90);

    cydeo.put("empOne",empOne);




    }
}
