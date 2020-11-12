package Multidimentionalarray;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        List<String> list01 = new java.util.ArrayList<>();
        System.out.println(list01);

        list01.add("Ali");
        System.out.println(list01);

        list01.add("Can");
        System.out.println(list01);

        list01.add(1, "Veli");
        System.out.println(list01);

        ///list01.add(0, "Han", 1, "Ali", 2, "Ayse" );  bu yanlis cikti

        list01.add(0, "Han");
        System.out.println(list01);

        list01.add(1, "Kemal");
        System.out.println(list01);

        list01.add(2, "Ayse");
        System.out.println(list01);

        //listin eleman  sayisini yazidirin

        System.out.println("Eleman" + list01.size());  ///arraylerde size kullaniriz , Unutma !!
    }
}
