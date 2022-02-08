package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        int speedLimit = 55;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your current speed");
        int currentSpeed = scan.nextInt();

        scan.close(); // we no longer need scanner after this line

        int overTheLimit = currentSpeed - speedLimit;

        if(overTheLimit > 0){
            System.out.println("You are driving "+ overTheLimit +" mph over the limit. Slow down!");
        }


    }
}

/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

 */