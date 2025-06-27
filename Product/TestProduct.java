package Product;

public class TestProduct {
    public static void main(String[] args) {
        PrintScan printScan = new PrintScan("HP129", 10000, "Printing to printer", "Scanning from Scanner");
        printScan.getPrinter().print();
        printScan.getScanner().scan();
    }
}
