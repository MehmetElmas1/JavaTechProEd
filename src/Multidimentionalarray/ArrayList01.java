package Multidimentionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2  = new ArrayList<>();

        System.out.println(list1.equals(list2));

        list1.add("A");

        System.out.println(list1.equals(list2));


    }
}
