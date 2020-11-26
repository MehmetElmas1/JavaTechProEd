package Maps;

import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {

        Hashtable< String, String>  hTable = new Hashtable<>();

        hTable.put("Dil", "Kalp");
        hTable.put("Gonul","Kalp");
        hTable.put("Dil", "Tad alma organi");
        System.out.println(hTable);

    }
}
