package week05;

public class Locators {
    String locator;
    public Locators(String locator){
        this.locator=locator;
    }
}
class ID extends Locators{
    public ID(String locator) {
        super(locator);
    }
}
class Name extends Locators{
    public Name(String locator) {
        super(locator);
    }
}
class TagName extends Locators{
    public TagName(String locator) {
        super(locator);
    }
}
