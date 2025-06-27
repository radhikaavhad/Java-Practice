package EmployeeToStringAndEquals;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    float salary;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+salary);
    }

    void calculateSalary(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

   public boolean equals(Object obj){
        if(obj instanceof Employee && this.id == ((Employee)obj).id)
            return true;
        return false;
   }

}
