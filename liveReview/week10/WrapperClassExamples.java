package week10;

public class WrapperClassExamples {

    public static void main(String[] args) {

        int i1 = 100;

        Integer i2 = i1; // Auto-boxing : from primitive to Object Type

        // explicit example
        Long i3 = (long)i1;

        Integer n1 = 300;

        int n2 = n1; // un-boxing : from object to primitive


        String str = "123";

        System.out.println(str+1); // 1231

        int num = Integer.parseInt(str);  // turns the value to primitive data type
        System.out.println(num+1); // 124

        String price = "$27.16";
        price = price.substring(1);

        double priceInDouble = Double.parseDouble(price);
        Double priceInWrapDouble = Double.valueOf(price);

        System.out.println(priceInDouble);

// Differenence between Integer.parseInt(str) and Integer.valueOf(str)

        Integer num2 = Integer.valueOf(str);
        System.out.println(num2+1); // 124

        char ch = 'a';
        
        boolean isDigit = Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);
        boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);


        String strTwo = "a1b2c3";

        // sum of the integers inside strTwo

        int sumOfDigits = 0;

        for(char each : strTwo.toCharArray()){
            if(Character.isDigit(each)){
                sumOfDigits+= Integer.parseInt(each+"");
            }
        }

        System.out.println("sumOfDigits = " + sumOfDigits);

        String strThree = "abcd1234!@#$efghi6789#$%^ABCD";

    }
}
