public class AltPrime {
    public static void main(String[] args) {
    
        int count = 0;
        int num=2;
        //level 1 loop
        while(count < 100)
        {
            int i = 2;
            //level 2 loop
            while(i<num)
            {
                if(num%i==0)
                break;

                i++;
            }    

                if(i==num)
                {
                    count++;
                    if(count % 2 != 0)
                     {
                    System.out.println(num + " is a prime number , "+"count = " + count/2);
                }
                }
               
                num++;
        }
}
}
