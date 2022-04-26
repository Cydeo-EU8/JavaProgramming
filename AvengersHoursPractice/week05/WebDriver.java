package week05;

import javax.swing.text.html.parser.TagElement;

public class WebDriver {
    String browserType;  // instance variable
    public WebDriver(String browserType){  // one parameter constructor
        this.browserType=browserType;
    }

    /*
     Method OverLoading examples:
     1. Happens in the same class
     2. Same Name but Different parameters
     3. Return Type does not matter same or NOT
     4. Access modifier can be Different
     5. private final methods can be overloaded
     6. static methods can be overloaded
     --- 8 different locators
     */
    public String findElement(ID id){  // I want to overload with different locator objects
        return id.locator;
    }

    protected String findElement(TagName tagName){  // same name but with different parameters
        return tagName.locator;
    }

    public void findElement(Name name){   // Return Type does not matter same or NOT
        System.out.println("Locating the webelement with name locator");
    }

    private final String findElement(ID id,Name name,TagName tagName){
        return "We are using all the locators";
    }

    public static void clickElement(ID id){
        System.out.println("Clicking on "+id.locator);
    }

    public static void clickElement(Name name){
        System.out.println("Clicking on "+name.locator);
    }

    Locators navigateTo(String link){
        Locators locators = new Locators(link);
        return locators;
    }
}
