package Multidimentionalarray;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class LisAllMethod {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();

        list2.add(2);
        list2.add(3);

        System.out.println(list2);

        list1.addAll(list2);

        System.out.println(list1);

    list2.addAll(list1);

        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(5);
        list3.add(6);
        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(7);
        list4.add(8);
        list4.add(9);
        System.out.println(list4);


        list3.addAll(1,list4);

        System.out.println(list3);





    }


}
