package oops.simpleInheritance;

public class TestEmployee {
    public static void main(String[] args) {
        // PermanentEmployee permanentEmployee = new PermanentEmployee();
        // permanentEmployee.id = 111;
        // permanentEmployee.name = "Radhika";
        // permanentEmployee.basicSalary = 10000f;

        
        // permanentEmployee.calculateSalary();   //calls own function(ie.child class) as it is nearer
        // permanentEmployee.display();

        PermanentEmployee permanentEmployee = new PermanentEmployee(111,"Radhika Avhad",10000f);
        permanentEmployee.calculateSalary();
        permanentEmployee.display();

    }

}
