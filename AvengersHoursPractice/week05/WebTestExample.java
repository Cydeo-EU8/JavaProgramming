package week05;

public class WebTestExample {
    public static void main(String[] args) {

        WebDriver driver = new WebDriver("Opera");

        // re-usability, and benefit of Method Overloading
        driver.findElement(new ID("ID_locator_provided"));
        driver.findElement(new Name("Name_locator_provided"));
        driver.findElement(new TagName("TagName_Locator_provided"));

        Locators object = driver.navigateTo("www.google.com"); // using parent class overridden method


        Chrome chromeDriver = new Chrome("Chrome");

        ID ID_object= chromeDriver.navigateTo("www.tesla.com"); // using child class overriding method
    }
}
