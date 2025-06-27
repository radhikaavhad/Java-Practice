package EmployeeToStringAndEquals;

public class ContractEmployee extends Employee{
    int ratePerHour = 2000;
    float hoursWorked;

    public ContractEmployee(int id, String name, float hoursWorked) {
        super(id, name);
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary(){
        salary = ratePerHour * hoursWorked;
    }

    void display(){
        super.display();
        System.out.println("Rate per hours: "+ ratePerHour);
        System.out.println("Hours Worked: " + hoursWorked);

    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "ratePerHour=" + ratePerHour +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
