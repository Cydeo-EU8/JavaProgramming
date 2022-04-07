package day36_Inheritance.cryptoTask;

public class CryptoToken {

    private double price;
    private int quantity;
    private long marketCap;
    private long circulatingSupply;
    private boolean isMineable;

    public void setInfo(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0 ){
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public int getQuantity() {
        if(quantity < 0 ){
            System.err.println("Invalid quantity: "+quantity);
            System.exit(1);
        }
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(long circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }


    public double totalPrice(){
        return price * quantity;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}

/*
1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

 */