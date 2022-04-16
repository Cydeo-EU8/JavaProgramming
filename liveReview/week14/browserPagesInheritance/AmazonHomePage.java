package week14.browserPagesInheritance;

public class AmazonHomePage extends Browser{

    public String product;

    public AmazonHomePage(String name) { // super class constructor always executes before subclass constructor
        super(name);
    }

    public void navigateTo(String link){
        // normally we will have selenium code but for right now we will just use println to understand inheritance
        System.out.println("Navigating to "+link+" using "+super.getName());
    }

    void shopFor(String product){
        this.product=product;  // instead of initializing in the constructor I can do it in this method as well
        System.out.println("Navigating to "+this.product+" 's Page");
    }

    @Override
    public String toString() {
        return "AmazonHomePage{" +
                "product='" + product + '\'' +
                '}';
    }
}
