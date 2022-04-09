package week13.inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public AudioBook(String title, String type, String author, double price,int length,String narrator) {
        super(title, type, author, price);
        this.length=length;
        this.narrator=narrator;
    }


    public void listen(){
        System.out.println("Listening to AudioBook");
        System.out.println("title = " + title);
        System.out.println("type = " + type);
        System.out.println("author = " + author);
        System.out.println("length = " + length);
        System.out.println("narrator = " + narrator);
    }

}
