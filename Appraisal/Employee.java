package Appraisal;

public class Employee {
    int id;
    String name;
    float salary;
   

    public Employee(){
        System.err.println("Employee");
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

     void display(){        // final void display() --> if we write function as final then it cannot be overridden by child class
        System.out.println("Employee id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+salary);
    }

    void calculateSalary(){    //child should not have a smaller access type than parent : private<defualt<protected<public
        
    }

}
