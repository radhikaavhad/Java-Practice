package Product;

public class Scanner extends Product implements Scanable{
    String scanThis;

    public Scanner(String model, double price, String scanThis){
        super(model, price);
        this.scanThis = scanThis;
    }

    public String getScanThis() {
        return scanThis;
    }

    public void setScanThis(String scanThis) {
        this.scanThis = scanThis;
    }


    @Override
    public void scan() {
        System.out.println("This is the Scannable interface method body");
        System.out.println(scanThis);
    }
}
