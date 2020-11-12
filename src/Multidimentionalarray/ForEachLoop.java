package Multidimentionalarray;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] arr1 = {"Ali", "Can", "Kemal"};

        for (String w : arr1) {
            System.out.print(w + " ");

        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        int sum = 0;

        for (int w : list) {
            sum = sum + w;
        }
        System.out.println(sum);


        int arr2[][] = {{1, 2}, {4}, {6, 7, 18}};
        int sum1 = 0;

        for (int[] w : arr2) {
            for (int z : w) {
                sum1 = sum1 + z;
                System.out.println(sum1);
            }
        }
    }
}
