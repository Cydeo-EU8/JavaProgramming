package week12;

public class ValueTest {
    public static void main(String[] args) {
        Value value = new Value();
        System.out.println(value.calledMethod);
        value.setValue(5);
        System.out.println(value.calledMethod);

    }
}
