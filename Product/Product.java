package Product;

import Appraisal.Employee;

public class Product {
    String model;
    double price;

    public Product(String model, double price){
        this.model = model;
        this.price = price;
    }

    void display(){
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}
