package Collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {

        HashSet<String> hSet = new HashSet<>();
        hSet.add("Apple");
        hSet.add("Mamgo");
        hSet.add("Grape");
        hSet.add("Orange");
        hSet.add("Fig");
        hSet.add("Can");
        System.out.println(hSet);
        hSet.add("Apple");

        System.out.println(hSet.hashCode());
    }
}
