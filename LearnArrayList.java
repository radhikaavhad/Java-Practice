import java.util.*;

public class LearnArrayList {
     public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Radhika");
        studentName.add("Rahul");
        System.out.println(studentName);

        studentName.add("Shardul");
        System.out.println(studentName);

        studentName.add(2, "Ojas");   //time complexity to insert = O(n)
        System.out.println(studentName);

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Asmita");
        newList.add("Amit");
        System.out.println(newList);

        studentName.addAll(newList);
        System.out.println(studentName);

        System.out.println(studentName.get(0));

        studentName.remove(3);    //time complexity to remove = O(n)
        System.out.println(studentName);

        studentName.remove(String.valueOf("Amit"));
        System.out.println(studentName);

        newList.clear();
        System.out.println(newList);

     }
}
