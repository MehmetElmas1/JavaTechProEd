package Multidimentionalarray;

import java.time.LocalTime;

public class TimeManipilation {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.plusHours(2));
        System.out.println(time.minusMinutes(10));

        System.out.println(time.minusSeconds(60));


        }
    }

