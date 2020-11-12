package Multidimentionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        List<String> namelist = new ArrayList<>();

        namelist.add("Ali");
        namelist.add("Can");
        namelist.add("Ayse");
        namelist.add("Ali");

        System.out.println(namelist);

        namelist.remove(0);
        System.out.println(namelist);

        namelist.remove("Ayse");
        System.out.println(namelist);
//Not remove methodu listede olmayan elemanlar ici hata vermez

        System.out.println(namelist.remove(0));
        System.out.println(namelist);

        System.out.println(namelist.set(0,"Aysegul"));
        System.out.println(namelist);

        namelist.add("Kenan");
        namelist.add("Zeynep");

        namelist.clear();
        System.out.println(namelist.isEmpty());
        System.out.println(namelist);

    }
}
