import java.util.Scanner;

class Student {
    String s_name;
    int s_id;
    int obtMarks;

    public Student(String name, int s_id, int obtMarks) {
        this.s_name = name;
        this.s_id = s_id;
        this.obtMarks = obtMarks;
    }

    public String getName() {
        return s_name;
    }

    public int getId() {
        return s_id;
    }

    public int getObtMarks() {
        return obtMarks;
    }
}

class Result {
    public static final int totalMarks = 1200;

    public double calculatePercentage(int obtMarks) {
        return ((double) obtMarks / totalMarks) * 100;
    }

    public String calculateGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "Fail";
    }
}

public class Details {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = s.nextLine();

        System.out.print("Enter Student ID: ");
        int id = s.nextInt();

        System.out.print("Enter Obtained Marks (out of 1200): ");
        int obtainedMarks = s.nextInt();

        Student student = new Student(name, id, obtainedMarks);
        Result result = new Result();

        double percentage = result.calculatePercentage(student.getObtMarks());
        String grade = result.calculateGrade(percentage);

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Obtained Marks: " + student.getObtMarks());
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
    }
}
