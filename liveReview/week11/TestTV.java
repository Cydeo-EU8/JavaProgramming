package week11;

import java.util.ArrayList;

public class TestTV {

    public static void main(String[] args) {

        // we will create a TV object

        TV Samsung = new TV(); // new keyword invokes our constructor with no parameters
        System.out.println(Samsung);

        Samsung.turnOn();
        Samsung.setChannel(7);
        Samsung.setVolume(3);
        System.out.println(Samsung); // toString is redundant

        TV LG = new TV();
        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG.toString());
        LG.turnOn();
        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG.toString());

        TV Sony = new TV(3,5,false);

        // Arraylist
        ArrayList<TV> tvList = new ArrayList<>();
        tvList.add(Samsung);
        tvList.add(LG);
        tvList.add(Sony);

        for(TV eachTv : tvList){   // eachTv: becomes object reference for our TV objects
            System.out.println("Is the TV on ? "+eachTv.on);
        }




    }
}
