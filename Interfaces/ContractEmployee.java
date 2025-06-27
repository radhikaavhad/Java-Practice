package Interfaces;

public class ContractEmployee extends Employee implements IncomeTax,GST {
    int ratePerHour = 2000;
    float hoursWorked;

    public ContractEmployee(int id, String name, float hoursWorked) {
        super(id, name);
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary(){
        salary = ratePerHour * hoursWorked;
    }


    @Override
    public void payGST() {
        System.out.println("Contract Employee pays this Tax : GST");
    }

    @Override
    public void payIncomeTax() {
        if(salary > EXEMPT_AMOUNT)
            System.out.println("Permanent Employee pays this Tax : Income Tax");
        else
            System.out.println("No Tax Applied");
    }

    void display(){
        super.display();
        System.out.println("Rate per hours: "+ ratePerHour);
        System.out.println("Hours Worked: " + hoursWorked);
        payGST();
        payIncomeTax();
    }

}