package day33_CustomClass_Statics.personTask;

public class Test {

    public static void main(String[] args) {

        Person person1 = new Person("Josh", 28, 'M');
        Person person2 = new Person("Breanna", 32, 'F');

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);


        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);


    }

}
