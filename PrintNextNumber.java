import java.util.Scanner;

public class PrintNextNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = '\0';

        do{
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int i = 2;

        while(i<num)
        {
            if(num%i==0)
            break;
            i++;
        }

        if(i==num)
        System.out.println(num + " is a prime number");
        else
        System.out.println(num + " is not prime"); 

        System.out.println("Enter 'y' to continue");
        ch = sc.next().charAt(0);
    }

    while(ch == 'y' || ch == 'Y');


    }
}
