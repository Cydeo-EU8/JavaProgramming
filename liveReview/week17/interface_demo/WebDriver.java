package week17.interface_demo;

public interface WebDriver {
    void get(String url);  // it is automatically public abstract
    void findElement(String locator);
    void quit();
    String getTitle();
}
