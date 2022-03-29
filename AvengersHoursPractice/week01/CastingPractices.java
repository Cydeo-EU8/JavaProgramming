package week01;

public class CastingPractices {
    public static void main(String[] args) {

        // byte to short
        byte b = 10;
        short s = b; // implicit casting

        // double to int: explicit casting
        double d = 5.3;
        int i = (int) d; // there might be data loss, so the compiler asks you to specfy the commend

    }
}
