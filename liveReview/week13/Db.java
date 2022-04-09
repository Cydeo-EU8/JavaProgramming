package week13;

public class Db {
    private String data;
    private  int yint;

    public void insertData(String data,int i){
        setData(data);
        setYint(i);

        // this.data=data;
        // we use this keyword only if our instance variable has same name with local variable (both of them 'data')
        // yint=i;

    }

    public String getData() {
        // condition
        return data;
    }

    public void setData(String data) {
        // condition
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
