import java.util.Scanner;

public class PrimeInRange {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start range : ");
        int start = sc.nextInt();
        System.out.println("Enter end range : ");

        int end = sc.nextInt();

        while(start<end)
        {
            int i = 2;
            while(i<start)
            {
                if(start%2==0)
                break;
                i++;
            }

            if(i == start)
            System.out.println(start);

            start++;
        }
    }
}
