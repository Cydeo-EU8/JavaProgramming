package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {100, 500, 30, 40, 600, 80, -90};

        int min = numbers[0]; // 30

        for (int i = 0; i < numbers.length; i++) {//i: 0,1,2,3...

            if(numbers[i] < min){ // if there is an element in the array that's smaller
               min = numbers[i]; // smaller number will be assigned to the variable min
            }

        }

        System.out.println(min);

    }

}
