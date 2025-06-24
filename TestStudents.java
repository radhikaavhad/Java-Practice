
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private float marks;

    public Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void printDetails() {
        System.out.println("Id=" + id);
        System.out.println("Name=" + name);
        System.out.println("Marks=" + marks);
    }
}


public class TestStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");

        Student[] students = new Student[Integer.parseInt(sc.nextLine())];

        System.out.println("=====Reading Student Information====");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter id, name and marks for student:" + (i+1));
            students[i] = new Student(Integer.parseInt(sc.nextLine()), sc.nextLine(), Float.parseFloat(sc.nextLine()));
        }

        System.out.println("=====Printing Student Information====");

        for(Student student:students){
            student.printDetails();
            System.out.println();
        }

    }
}