package week14.browserPagesInheritance;

public class Browser {
    private static String browserType; // chrome, safari, edge, firefox...

    private static String operatingSystem; // windows, androids, IOs ...

    public Browser(String name){
        browserType=name;
    }


    static {
        operatingSystem="Windows";
    }

    public String getName(){
        return browserType;
    }

    public void closeBrowser(){  // this method is created so we can use before setting a new one
        browserType=null;
    }

    public void setName(String name){  // Our setter method checks if there is already an open browser type before setting a new one.
        if(browserType==null)
            this.browserType=name;
        else
            System.out.println("There is already an open browser : "+browserType);
        // only sets a new one if there is no browser assigned
    }

    public static String getOSName(){
        return operatingSystem;
    }

    // we made read only field which is OS
}
