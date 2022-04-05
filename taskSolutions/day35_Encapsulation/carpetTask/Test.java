package day35_Encapsulation.carpetTask;

public class Test {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(4,5,3.5, false);

        System.out.println(carpet);

        carpet.setPersian(true);
        carpet.setUnitPrice(8);
        carpet.setWidth(7);
        carpet.setLength(6);

        System.out.println(carpet);

    }

}
