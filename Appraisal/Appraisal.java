package Appraisal;

public class Appraisal {
    public void calculateAppraisal(Employee employee){
        if(employee instanceof PermanentEmployee){
            ((PermanentEmployee)employee).salary *= 1.02f;
            employee.display();
        }
        else if(employee instanceof ContractEmployee){
            ((ContractEmployee)employee).salary *= 1.02f;
            employee.display();
        }
    }
}
