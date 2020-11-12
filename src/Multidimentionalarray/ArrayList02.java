package Multidimentionalarray;

import java.util.List;
import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        List<Integer> list01 = new ArrayList<>();
        System.out.println(list01.isEmpty());

       // list01.add(123);
        //System.out.println(list01.isEmpty());


        list01.add(123);
       System.out.println(list01);

        list01.add(124);
        list01.add(125);
        list01.add(124);
        System.out.println(list01);

        list01.remove(1);
        System.out.println(list01);

        list01.remove(0);
        System.out.println(list01);

        list01.remove(list01.size()-1);
        System.out.println(list01);

    }
}

