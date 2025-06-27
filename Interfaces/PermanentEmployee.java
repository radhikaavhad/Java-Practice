package Interfaces;


public class PermanentEmployee extends Employee implements IncomeTax, ProvidentFund{
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

    @Override
    public void payIncomeTax() {
        if(salary > EXEMPT_AMOUNT)
            System.out.println("Permanent Employee pays this Tax : Income Tax");
        else
            System.out.println("No Tax Applied");
    }

    @Override
    public void openAccount() {
        System.out.println("This creates your provident fund");
    }

    @Override
    public void closeAccount(){
        System.out.println("This closes your provident fund");
    }

    void display(){
        super.display();    // calls current parent class (acts as 'this' which calls the object of current class)
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        payIncomeTax();
        openAccount();
        closeAccount();
    }



}

