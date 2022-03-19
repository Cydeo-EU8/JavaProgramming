package week10;

public class R02_DifferenceBetween {
    public static void main(String[] args) {

        int[] arr = {4,7,10,45,-34,0,12};
        System.out.println(difference(arr));

        // I want to see even numbers of this array

        System.out.println(R01_CountOfEven.counter(arr));
    }

    public static int difference(int[] arr) {
        int diff = 0;

        int max = Integer.MIN_VALUE; // int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        diff = max - min ;
        return diff;
    }
}
