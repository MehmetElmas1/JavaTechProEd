package Collections;

import com.sun.source.tree.Tree;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class linkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<String> lhSet = new LinkedHashSet<>();
        lhSet.add("Z");
        lhSet.add("A");
        lhSet.add("D");
        lhSet.add("B");
        System.out.println(lhSet);

        LinkedHashSet<Integer> lhSet1 = new LinkedHashSet<>();
        lhSet1.add(1);
        lhSet1.add(5);
        lhSet1.add(6);
        lhSet1.add(7);
        System.out.println(lhSet1);

        TreeSet<Integer> tSet = new TreeSet<> (lhSet1);
        System.out.println(tSet);


    }
}
