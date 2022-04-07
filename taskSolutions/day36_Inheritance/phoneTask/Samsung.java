package day36_Inheritance.phoneTask;

public class Samsung extends Phone{

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }

}
/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */