package week04;

public class Item {
    /*
    In this assignment you will practice:
inheritance
constructors and calling parent class constructor
overriding
list with custom classes

Please follow the instructions on top of each method.

Work on this flow:
Item > OnSaleItem > TJMaxx
     */

    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     * @param n
     * @param quantity
     * @param catalogNumber
     * @param price
     *
     * assigns to values to instance variables
     */

    public Item(String n, int quantity, double price, int catalogNumber){
        name=n; // if local variable is deifferent name then we don't have to use this keyword
        this.quantity=quantity;
        this.price=price;
        this.catalogNumber=catalogNumber;
    }


    /**
     * setter for name instance variable
     * @param name
     */

    public void setName(String name){
        this.name=name;
    }


    /**
     * setter for private price
     * @param price
     */

    public void setPrice(double price){
        this.price=price;
    }


    /**
     * getter for price
     * @return
     */

    public double getPrice(){
        return this.price;
    }


    /**
     * getter for name
     * @return
     */


    public String getName(){
        return this.name;
    }


    public int getCatalogNumber() {
        return catalogNumber;
    }

    /**
     * Override toString:
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */

    public String toString(){
        return "Regular Item{name='"+name
                +"', catalogNumber="+catalogNumber
                +", quantity="+quantity
                +", price="+price+"}";
    }

}
