package week04;

public class OnSaleItem extends Item{

    // inherits from Item Class
    /**
     * private instance variable, used for discount percentage
     */

    private double discountPercentage;

    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price

     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */

    public OnSaleItem(String name,int quantity,int catalogNumber,double price,double discountPercentage){
        super(name,quantity,(price-discountPercentage*price),catalogNumber);
        this.discountPercentage=discountPercentage;
    }


    /**
     * getter for discount
     * @return
     */

    public double getDiscountPercentage(){
        return this.discountPercentage;
    }



    /**
     * setter for discount
     * @param discount
     */

    public void setDiscountPercentage(double discount){
        this.discountPercentage=discount;
    }

    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */

    @Override
    public String toString() {
        return "OnSaleItem{" +
                "discountPercentage=" + discountPercentage
                +" name= "+super.getName()+
                "price= "+super.getPrice()+
                '}';
    }

    // Difference between this and super keywords.

}
