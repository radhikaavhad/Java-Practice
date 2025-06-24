import java.util.Scanner;

public class DigitCalc {
    public static void main(String[] args) {
        // 123 % 10 = 3
        // 123 /10 = 12
        // 12 % 10 = 2
        // use while loop

        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = num;
        int[] arrDigits = new int[15];
        int i=0;
        int sum = 0;

        while(n>0)
        {
            arrDigits[i] = n%10;
            n = n/10;
            // System.out.println(arrDigits[i]);
            i++;
        }

        for(int j=i-1;j>=0;j--)
        {
            System.out.println(arrDigits[j]);
            sum =sum + arrDigits[j];
        }
        System.out.println("sum = " + sum);
    }
}
