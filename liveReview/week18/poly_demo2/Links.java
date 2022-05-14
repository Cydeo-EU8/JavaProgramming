package week18.poly_demo2;

public class Links implements WebElement{

    public void getLinkHref(){
        System.out.println("https://www.java.com");
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Not Supported Action");
    }

    @Override
    public void click() {
        System.out.println("Clicking the link");
    }

    @Override
    public String getText() {
        System.out.println("Getting Link Text");
        return "Oracle Java";
    }
}
