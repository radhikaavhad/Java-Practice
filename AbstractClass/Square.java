package AbstractClass;

public class Square extends Shape{

    double side;

    public Square(double side){
        this.side = side;
    }

    void findArea(){
        area = side * side;
    }

    void display(){
        System.out.println("Side = "+side);
        super.display();
    }
}
