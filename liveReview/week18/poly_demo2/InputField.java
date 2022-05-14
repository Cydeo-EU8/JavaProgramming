package week18.poly_demo2;

public class InputField implements WebElement{

        public String getValue(){
            System.out.println("Getting value of the inputField");
            return "Selenium";
        }
    @Override
    public void sendKeys(String txt) {

    }

    @Override
    public void click() {

    }

    @Override
    public String getText() {
        return null;
    }
}
