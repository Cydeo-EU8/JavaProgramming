package week01;

public class StringManipulator {

    public String str; // attribute

    public int x;

    public StringManipulator(String str){ // one parameter constructor
        this.str=str;
    }

    public void firstTwoChars(){
        str = str.toUpperCase().substring(0,2);
    }


}
