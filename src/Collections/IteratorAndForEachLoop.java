package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAndForEachLoop {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.add("X");
        list1.add("Y");
        list1.add("Z");
        System.out.println(list1);

        Iterator<String> iterator = list1.iterator();

    }
}
