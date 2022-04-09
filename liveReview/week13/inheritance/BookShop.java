package week13.inheritance;

public class BookShop {
    public static void main(String[] args) {

Book bookOne = new Book();
bookOne.title= "intro to Java";
bookOne.author = "Savitch";
bookOne.type = "programming";
bookOne.price=85.90;

        System.out.println("bookOne = " + bookOne);

        AudioBook audioBook = new AudioBook("Selenium Cookbook","Automation","Unmesh",44.99,60,"Irina");

    audioBook.listen();

    // can I call parent class method with Child class object?
        audioBook.buy();
    }
}
