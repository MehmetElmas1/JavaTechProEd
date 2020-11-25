package Collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        // Linked list objesi olusturunuz
    LinkedList<String> linkList= new LinkedList<>();
    linkList.add("Mark");
        linkList.add("Amanda");
        linkList.add("John");
        linkList.add("Ann");
        linkList.add("Pamela");
        System.out.println(linkList);

        linkList.remove(2);
        System.out.println(linkList);
        linkList.removeFirst();
        System.out.println(linkList);
        linkList.removeLast();

        LinkedList<String> linkList2 = new LinkedList<>();
        linkList2.add("X");
        linkList2.add("Y");
        linkList2.addAll(linkList);
        System.out.println(linkList2);

        linkList.addAll(2, linkList2);
        linkList2.contains("Can");
        System.out.println(linkList2);

        linkList2.contains("X");
        System.out.println(linkList2);


    }
}
