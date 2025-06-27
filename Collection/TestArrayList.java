package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("One");
        arrayList.add(2);
        arrayList.add(3.0);

        System.out.println(arrayList);

//        System.out.println("Printing list using get()");
//        for(int i=0;i< arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
//
//        System.out.println("Printing list using iterator");
//        Iterator iterator = arrayList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        System.out.println("Printing list using enhanced for");
//        for(Object element : arrayList)
//            System.out.println(element);

        System.out.println("===Printing list using for each lambda===");  //used in modern times java 8 onwards
        arrayList.forEach(System.out::println);

        arrayList.add("Five");
        System.out.println("===ADD FIVE===");
        System.out.println(arrayList);

        arrayList.add(3, 4L);
        System.out.println("===inserting at given index===");
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.remove((Integer)2);
        System.out.println(arrayList);

    }
}
