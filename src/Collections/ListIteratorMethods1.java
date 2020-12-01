package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods1 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("A");
        mylist.add("B");
        mylist.add("C");
        System.out.println(mylist);

        // cerate a list iterator
        ListIterator<String> myListIterator = mylist.listIterator();
        while(myListIterator.hasNext()) {
            Object element = myListIterator.hasNext();
            System.out.println(element+ " ");

        }

    }
}
