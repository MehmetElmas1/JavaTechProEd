package Maps;

import java.util.HashMap;

public class Maps01 {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3345, " Ali");
        hashMap.put(112, "Veli");
        hashMap.put(222, "Mine");
        hashMap.put(243, "Kemal");
        System.out.println(hashMap);

        hashMap.remove(4);
        System.out.println(hashMap);
        System.out.println(hashMap.remove(112, "Veli"));

        System.out.println(hashMap.remove(222, "Ayse"));

        System.out.println(hashMap);
        System.out.println(hashMap.get(222));

        System.out.println(hashMap.keySet());

        System.out.println(hashMap.size());
        System.out.println(hashMap.containsKey(333));
        System.out.println(hashMap.containsValue("Mine"));
    }
}
