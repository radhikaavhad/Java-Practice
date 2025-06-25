import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        // PermanentEmployee permanentEmployee = new PermanentEmployee();
        // permanentEmployee.id = 111;
        // permanentEmployee.name = "Radhika";
        // permanentEmployee.basicSalary = 10000f;

        // permanentEmployee.calculateSalary(); //calls own function(ie.child class) as
        // it is nearer
        // permanentEmployee.display();

        // PermanentEmployee permanentEmployee = new PermanentEmployee(111,"Radhika
        // Avhad",10000f);
        // permanentEmployee.calculateSalary();
        // permanentEmployee.display();

        int totalEmployees;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of employees: ");
        totalEmployees = sc.nextInt();

        Employee[] employeesArray = new Employee[totalEmployees];

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
                    // PermanentEmployee permanentEmployee = new PermanentEmployee(id, name, basicSalary);
                    // permanentEmployee.calculateSalary();
                    // employeesArray[i] = permanentEmployee;
                    (employeesArray[i] = new PermanentEmployee(id, name, basicSalary)).calculateSalary();
                    break;

                case 2:
                    System.out.println("Enter Total hours worked: ");
                    float totalHours = sc.nextFloat();
                    // ContractEmployee contractEmployee = new ContractEmployee(id, name, totalHours);
                    // contractEmployee.calculateSalary();
                    // employeesArray[i] = contractEmployee;
                    (employeesArray[i] = new ContractEmployee(id, name, totalHours)).calculateSalary();
                    break;

                default:
                System.out.println("Invalid choice");
                break;
            }
        }
        sc.close();

        System.out.println("=== Printing Employee Details ===");
        for (Employee employee : employeesArray) {
            System.out.println(employee.getClass().getSimpleName());   //states which class it belongs to 
            //can also be done like this      // if (employee instanceof PermanentEmployee) {
            //     System.out.println("PE");
            // }
            employee.display();
            System.err.println("=================");
        }

        // ContractEmployee contractEmployee = new ContractEmployee(001,"Radhika
        // Avhad",6.8f);
        // contractEmployee.calculateSalary();
        // contractEmployee.display();
    }

}
