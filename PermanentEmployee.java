
public class PermanentEmployee extends Employee {
    float basicSalary;
    float da;
    float hra;

    public PermanentEmployee(){     //rule of 1s --> can be called only once and on first line only
        super();    //super call --> calls the constructor of the parent class
        System.out.println("Permanent Employee");
    }

    public PermanentEmployee(int id, String name, float basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    @Override  //-->used for readability
    void calculateSalary() {   // same function as parent --> method overriding
        hra = 0.2f * basicSalary;
        da = 0.1f * basicSalary;
        salary = basicSalary + hra + da;
    }

    void display(){
        super.display();    // calls current parent class (acts as 'this' which calls the object of current class)
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
    }

}
