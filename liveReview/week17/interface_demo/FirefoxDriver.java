package week17.interface_demo;

public class FirefoxDriver implements WebDriver{
    public FirefoxDriver(){
        System.out.println("Launching Firefox Browser");
    }

    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigating to "+ url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating element by "+locator);
    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver - quiting the driver");
    }

    @Override
    public String getTitle() {
        return "EU8 UI Automation";
    }

    public void someUniqueMethodforFirefox(){
        System.out.println("I am just belonging to FirefoxDriver class");
    }
}
