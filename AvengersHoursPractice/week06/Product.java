package week06;

public class Product implements Comparable<Product> {
    public String name;
    public double price;

    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product otherProduct) {
        if(this.price > otherProduct.price){
            return 1;
        }else if(this.price == otherProduct.price){
            return 0;
        }else {
            return -1;
        }
    }
}
