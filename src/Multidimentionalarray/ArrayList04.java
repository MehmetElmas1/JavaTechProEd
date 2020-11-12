package Multidimentionalarray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        List<String> harfList = new ArrayList<>();
        harfList.add("A");
        harfList.add("C");
        harfList.add("B");
        harfList.add("C");
        System.out.println(harfList);

        harfList.contains("B");
        System.out.println(harfList.contains("B"));

        System.out.println(harfList.contains("Z"));

        Collections.sort(harfList);

        System.out.println(harfList);
        
    }
}
