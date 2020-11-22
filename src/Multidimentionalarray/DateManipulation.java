package Multidimentionalarray;

import java.time.LocalDate;

public class DateManipulation {
    public static void main(String[]args){


    LocalDate date = LocalDate.now();

        System.out.println(date);

        System.out.println(date.plusDays(3));

        System.out.println(date.plusDays(13));
        System.out.println(date.plusDays(3));

        System.out.println(date.plusDays(-3));

        System.out.println(date.plusMonths(2));


}
}
