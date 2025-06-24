import java.util.Scanner;

public class AddZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================");

        for(int i = 0 ; i<3 ; i++){
        String subject = sc.next();
        int num = sc.nextInt();
        
        System.out.println(subject);
        
            for(int j = 0 ; j<=i ; j++){
                System.out.println("               ");
        }
        System.out.println(num);
        


    }
}
}