package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods2 {
    public static void main(String[] args) {
        //Elemanlari A, B, ve C olan bir list o lusturunuz
        // List iterator kullanarak bu e leman lari AW, BW, ve CW'ye donusturunuz
        List<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println(list1);

        ListIterator<String> MyLit = list1.listIterator();
        while(MyLit.hasNext()) {
            Object element = MyLit.next();
            MyLit.set(element + "W");
        }
        System.out.println(list1);

        MyLit.add("Can");
        System.out.println(list1);



    }
}
