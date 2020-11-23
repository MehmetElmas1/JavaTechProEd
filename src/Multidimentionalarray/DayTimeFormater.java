package Multidimentionalarray;

import java.nio.file.LinkOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayTimeFormater {

    public static void main(String[] args) {

    LocalDate date = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-YYYY");

        System.out.println(dtf.format(date));

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        System.out.println(dtf1.format(date));
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-M-dd");
        System.out.println(dtf2.format(date));
}
}
