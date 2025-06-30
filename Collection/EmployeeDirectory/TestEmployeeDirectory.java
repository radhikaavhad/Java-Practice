package CollectionAPI.EmployeeDirectory;

import java.util.Scanner;

public class TestEmployeeDirectory {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();

        Scanner sc = new Scanner(System.in);
        System.out.println("===Welcome to Employee Directory===");

        while(true) {
            System.out.println("1) Display Employee Details");
            System.out.println("2) Add Employee");
            System.out.println("3) Remove Employee");
            System.out.println("4) Fetch Employee name");
            System.out.println("5) Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("===Employee Details===");
                    employeeDirectory.display();
                    System.out.println("======================");
                    break;

                case 2:
                    System.out.println("Enter Employee ID: ");
                    int employeeID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Employee Name: ");
                    String employeeName = sc.nextLine();
                    employeeDirectory.addEmployee(employeeID,employeeName);
                    break;

                case 3:
                    System.out.println("Enter Employee ID to remove: ");
                    int removeID = sc.nextInt();
                    sc.nextLine();
                    employeeDirectory.removeEmployee(removeID);
                    break;

                case 4:
                    System.out.println("Enter Employee ID: ");
                    int fetchID = sc.nextInt();
                    sc.nextLine();
                    employeeDirectory.fetchEmployee(fetchID);
                    break;

                case 5:
                    System.out.println("Exited successfully");
                    return;

                default:
                    System.out.println("Invalid choice number!");
                    break;
            }
        }
    }
}
