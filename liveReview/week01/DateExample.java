package week01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd HH");
        LocalDateTime now = LocalDateTime.now();
       // System.out.println(dtf.format(now));
        String str = dtf.format(now);
        System.out.println(str);
    }
}
