package EmployeeToStringAndEquals;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        int totalEmployees;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of employees: ");
        totalEmployees = sc.nextInt();

        EmployeeToStringAndEquals.Employee[] employeesArray = new Employee[totalEmployees];

        for (int i = 0; i < employeesArray.length; i++) {
            System.out.println("Enter 1 for Permanent Employee and 2 for Contract Employee: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Employee name: ");
            String name = sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Basic Salary: ");
                    float basicSalary = sc.nextFloat();
                    EmployeeToStringAndEquals.PermanentEmployee permanentEmployee = new PermanentEmployee(id, name, basicSalary);
                    permanentEmployee.calculateSalary();
                    employeesArray[i] = permanentEmployee;
//                    (employeesArray[i] = new PermanentEmployee(id, name, basicSalary)).calculateSalary();
                    break;

                case 2:
                    System.out.println("Enter Total hours worked: ");
                    float totalHours = sc.nextFloat();
                    EmployeeToStringAndEquals.ContractEmployee contractEmployee = new ContractEmployee(id, name, totalHours);
                    contractEmployee.calculateSalary();
                    employeesArray[i] = contractEmployee;
//                    (employeesArray[i] = new ContractEmployee(id, name, totalHours)).calculateSalary();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }


        for(int i=0; i<employeesArray.length;i++){
            for(int j=i+1;j<employeesArray.length;j++){
                if(employeesArray[i].equals(employeesArray[j]))
                    System.out.println("Duplicate ID found : "+employeesArray[i].id);
            }
        }
    }
}
