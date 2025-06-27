//abstract class allows everything from class and abstract method
//however it does not allow object creation

//tight coupling --> abstract class --> animal kingdom example --> snake extends reptiles , now it cannot say it wants to fly
//loose coupling --> interface

//interface provides absolute abstraction --> eg: UPI , HTTP --> we know it works but do not know how it works
//abstract class --> enforces hierarchy

package AbstractClass;

public class Circle extends Shape {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    void findArea(){
        area = 3.14 * radius * radius;
    }

    void display(){
        System.out.println("Radius = "+radius);
        super.display();
    }
}
