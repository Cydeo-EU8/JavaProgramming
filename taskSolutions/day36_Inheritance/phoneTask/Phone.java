package day36_Inheritance.phoneTask;

public class Phone {

    public String brand, model, size, color;
    public double price;

    public void setInfo( String model, String size, String color, double price) {
        brand = getClass().getSimpleName(); // this gets the class name automatically
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +  // this gets the class name automatically
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


}

/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */