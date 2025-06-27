package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);

        System.out.println(hashSet);

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);

        System.out.println(linkedHashSet);

        TreeSet treeSet = new TreeSet();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);

        System.out.println(treeSet);

    }
}
