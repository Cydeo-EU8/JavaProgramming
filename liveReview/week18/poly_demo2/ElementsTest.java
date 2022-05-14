package week18.poly_demo2;

public class ElementsTest {
    public static void main(String[] args) {

        Links links = new Links(); // No poly: It reaches implementation of the methods from Links class
        links.click();
        links.getText();
        links.sendKeys("EU8");
        links.getLinkHref();

        WebElement loginLink = new Links();  // There is polymorphic way
        loginLink.click();  // Dynamic Poly-Dynamic Binding
        String text = loginLink.getText();
        System.out.println("text = " + text);
        ((Links)loginLink).getLinkHref();  // Explicit-DownCasting

        WebElement userName = new InputField();// There is polymorphic way
        userName.click();
        userName.sendKeys("superman");

        ((InputField)userName).getValue(); // This method can be reached with casting

        System.out.println("----Changed object of the reference type---");
        userName = new Links();  // benefit of PolyMorphism
        userName.click();
       //  ((Links)userName).click();  No need to do that because click method is already defined in the parent and child class
        ((Links)userName).getLinkHref();

        userName = new InputField();

        // two objects InputField, Links
        WebElementUtility.clickElement(loginLink);
        WebElementUtility.clickElement(userName);
      //  WebElementUtility.clickElement(new String("Hello")); String is not child of WebElement
        WebElementUtility.clickElement(links);

        WebElement login = WebElementUtility.getLinkWithText("login");
        login.click();
        ((Links)login).getLinkHref();


    }
}
