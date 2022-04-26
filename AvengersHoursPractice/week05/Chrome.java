package week05;

public class Chrome extends WebDriver {
    public Chrome(String browserType) {
        super(browserType);
    }

    /*
    Method Overriding Rules:
    1. Same name same parameter
    2. Return type same or covariant
     */
    @Override
    public ID navigateTo(String link){  // Covariant of Locators are: ID,Name or TagName class objects
        return new ID(link);
    }

}
