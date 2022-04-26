package week05;

public class Chrome extends WebDriver {
    public Chrome(String browserType) {
        super(browserType);
    }

    /*
    Method Overriding Rules:
    1. Same name same parameter
    2. Return type same or covariant (sub-class, sub-type)
    3. Access modifier of the overriding method in child class should be more visible
    4. private and final methods can not be over-ridden
    5. Static methods can not be overridden, they can be hidden (you will learn later)
    6. @Override annotation should be applicable.
     */
    @Override
    protected ID navigateTo(String link){  // Covariant of Locators are: ID,Name or TagName class objects
        return new ID(link);
    }

//    @Override
//    public static void clickElement(ID id){
//        System.out.println("Clicking on "+id.locator);
//    }
}
