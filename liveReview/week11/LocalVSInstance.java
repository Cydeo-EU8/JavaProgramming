package week11;

public class LocalVSInstance {

    public int a = 4; // initialized value

    public void showDifference(int number){    // Ques= I want to be able to change this a as well
        int a = number;  // this a is local to the method
        System.out.println(a);
    }



}
