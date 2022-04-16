package week14.browserPagesInheritance;

public class ProductPage extends AmazonHomePage {
    public int quantity;

    public ProductPage(String name, int quantity){
        super(name);
        this.quantity=quantity;
    }

    // need: our shopFor method is not specialized enough for this class
    @Override   // annotation should be applicable to the method
    public void shopFor(String product){
        super.product=product;
        System.out.println("Automating "+super.getName()); // which browser we are automating
        System.out.println("Adding "+quantity+" amount of "+super.product+" to cart");
    }


}
