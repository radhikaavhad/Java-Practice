package Product;

public class Printer extends Product implements Printable{
    String printThis;

    public Printer(String model, double price, String printThis){
        super(model, price);
        this.printThis = printThis;
    }

    public String getPrintThis() {
        return printThis;
    }

    public void setPrintThis(String printThis) {
        this.printThis = printThis;
    }


    public void print(){
        System.out.println("This is the Printable interface method body");
        System.out.println(printThis);
    }

}
