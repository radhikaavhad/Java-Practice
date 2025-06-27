package EmployeeToStringAndEquals;

public class PermanentEmployee extends Employee{
    float basicSalary;
    float da;
    float hra;

    public PermanentEmployee(int id, String name, float basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    @Override
    void calculateSalary() {
        hra = 0.2f * basicSalary;
        da = 0.1f * basicSalary;
        salary = basicSalary + hra + da;
    }

    void display(){
        super.display();
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "basicSalary=" + basicSalary +
                ", da=" + da +
                ", hra=" + hra +
                '}';
    }

}
