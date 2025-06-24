import java.util.Scanner;

public class DataTypes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i = sc.nextInt();
        double d = sc.nextDouble();
    
        System.out.println("Double = " + d);
        System.out.println("Int = " + i);
        System.out.println("String = " + s);
    }
}