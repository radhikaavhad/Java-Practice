package Appraisal;

//variation 1 - increase salary by 2% for every employee
//public class Appraisal {
//    public void calculateAppraisal(Employee employee){
//        if(employee instanceof PermanentEmployee){
//            System.out.println("===Before Appraisal===");
//            employee.display();
//            ((PermanentEmployee)employee).salary *= 1.02f;
//            System.out.println("===After Appraisal===");
//            employee.display();
//        }
//        else if(employee instanceof ContractEmployee){
//            System.out.println("===Before Appraisal===");
//            employee.display();
//            ((ContractEmployee)employee).salary *= 1.02f;
//            System.out.println("===After Appraisal===");
//            employee.display();
//        }
//    }
//}

//variation 2 - increase permanentEmployee basicSalary by 5% and contractEmployee by 10% if totalHours > 100
public class Appraisal {
    public void calculateAppraisal(Employee employee){
        if(employee instanceof PermanentEmployee){
            System.out.println("===Before Appraisal===");
            employee.display();
            ((PermanentEmployee)employee).basicSalary *= 1.05f;
            employee.calculateSalary();
            System.out.println("===After Appraisal===");
            employee.display();
        }
        else if(employee instanceof ContractEmployee){
            System.out.println("===Before Appraisal===");
            employee.display();
            if(((ContractEmployee) employee).hoursWorked > 100){
                ((ContractEmployee)employee).ratePerHour *= 1.10f;
                employee.calculateSalary();
                System.out.println("===After Appraisal===");
                employee.display();
            }
            else{
                System.out.println("No Appraisal");
            }

        }
    }
}