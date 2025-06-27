package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(10, "Rahul");
        hashMap.put(20, "Rita");
        hashMap.put(30, "Raya");
        hashMap.put(40, "Ria");

        System.out.println(hashMap);

        LinkedHashMap linkedhashMap = new LinkedHashMap();
        linkedhashMap.put(10, "Rahul");
        linkedhashMap.put(20, "Rita");
        linkedhashMap.put(30, "Raya");
        linkedhashMap.put(40, "Ria");

        System.out.println(linkedhashMap);

        TreeMap treeMap = new TreeMap();
        treeMap.put(10, "Rahul");
        treeMap.put(70, "Rita");
        treeMap.put(30, "Raya");
        treeMap.put(10, "Ria");

        System.out.println(treeMap);
    }
}
