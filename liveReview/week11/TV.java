package week11;

public class TV {
    // data fields + attributes
    public int channel = 1; // Default channel is 1
    public int volumeLevel = 1; // default volume will be 1
    public boolean on = false; // TV is off

    public TV(){
        //  Constructor with NO parameters
    }

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if(on && newChannel >=1 && newChannel <= 120){
            channel = newChannel;
        }
    }


}
