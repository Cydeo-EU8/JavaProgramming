package week13;

public class Credentials {

    private String userName = "A12345678"; // instance fields
    private String passWord = "Cydeo123.";

    // we need instance methods to read or write the data(getter and setter)

    public String getUserName(){
        if(true)// we can implement some condition to reach the data
            return this.userName;  // it will work without this keyword
        return "condition has NOT been satisfied";
    }

    public String getPassWord(){
        // the system maybe checks if you are admin
        return this.passWord;}


    public void setPassWord(String newPassword){
        if(true)  // we require user to apply some condition
            this.passWord=newPassword;
        System.exit(-1); // usually it means an error happened
    }

}
