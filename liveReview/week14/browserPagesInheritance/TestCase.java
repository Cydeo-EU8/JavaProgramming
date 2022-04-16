package week14.browserPagesInheritance;

public class TestCase {
    public static void main(String[] args) {

        // If I want to use fields and methods of Browser Class: do I have to create an object from browser class? Can I also reach with child class object?

        AmazonHomePage amazonHomePage = new AmazonHomePage("Chrome");

        System.out.println("I am automating : "+amazonHomePage.getName());
        System.out.println("My operating system is : "+ Browser.getOSName()); // use class name for static field

        amazonHomePage.navigateTo("www.amazon.com");

        amazonHomePage.navigateTo("Search for laptops");

        amazonHomePage.shopFor("Samsung PC");

// Can I use amazonHomePage object to reach ProductPage shopFor method

        ProductPage productObject = new ProductPage("Chrome",2);
        String product = amazonHomePage.product;
        productObject.shopFor(product);  //

        // navigate to Cart: I can use both objects
        // productObject.navigateTo("Cart");  we can use as well child class object
        amazonHomePage.navigateTo("Cart");

        CartPage cartPage = new CartPage("Chrome","Mike Smith");
        cartPage.fillInfo();
        cartPage.payFor(4325654634251678L);

        cartPage.setName("Firefox");  // There is already an open browser : Chrome

        // I needed to closeBrowser
        cartPage.closeBrowser();

        cartPage.setName("Firefox");
        System.out.println("I am automating : "+cartPage.getName());
        System.out.println("I am automating : "+amazonHomePage.getName());




    }
}
