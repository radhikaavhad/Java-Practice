package Product;

public class PrintScan extends Product{
    Printer printer;
    Scanner scanner;

    public PrintScan(String model, double price, String printThis, String scanThis){
        super(model, price);
        this.printer = new Printer(model, price, printThis);
        this.scanner = new Scanner(model, price, scanThis);
    }


public Printer getPrinter() {
    return printer;
}


public Scanner getScanner() {
    return scanner;
}

}

