// 






// import java.util.Scanner;

// class Student {
//     private int id;
//     private String name;
//     private int[] marks;

//     public Student(int id, String name, int[] marks) {
//         this.id = id;
//         this.name = name;
//         this.marks = marks;
//     }

//     void printDetails() {
//         int sum = 0;
//         System.out.println("Id = " + id);
//         System.out.println("Name = " + name);
//         System.out.print("Marks = ");
//         for (int mark : marks) {
//             System.out.print(mark + " ");
//             sum += mark;
//         }

//         float percentage = ((float) sum / marks.length);
//         char grade;
//         if (percentage >= 80) grade = 'A';
//         else if (percentage >= 60) grade = 'B';
//         else if (percentage >= 40) grade = 'C';
//         else grade = 'F';

//         System.out.println("Total Marks = " + sum);
//         System.out.println("Percentage = " +  percentage);
//         System.out.println("Grade = " + grade);
//     }
// }


import java.util.Scanner;

public class TestMarksArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int studentCount = Integer.parseInt(sc.nextLine());

        System.out.print("Enter number of marks per student: ");
        int marksCount = Integer.parseInt(sc.nextLine());

        Student[] students = new Student[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n=== Entering details for student " + (i + 1) + " ===");

            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            int[] marks = new int[marksCount];
            for (int j = 0; j < marksCount; j++) {
                System.out.print("Enter mark " + (j + 1) + ": ");
                marks[j] = Integer.parseInt(sc.nextLine());
            }

            students[i] = new Student(id, name, marks);
        }

        System.out.println("\n=== Printing Student Details ===");
        for (Student student : students) {

            student.printDetails();
            System.out.println();
        }
    }
}
