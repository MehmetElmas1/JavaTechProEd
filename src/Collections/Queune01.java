package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queune01 {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("B");
        q.add("A");
        q.add("C");

        System.out.println(q);

        Queue<String> qll = new LinkedList<>();
        qll.add("B");
        qll.add("A");
        qll.add("C");
        System.out.println(qll);





    }

}
