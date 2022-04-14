package day38_MethodOverriding.browserTask;

public class Opera extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing opera browser");
    }
}
