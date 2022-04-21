public class PrimeOneToHun 
 {

   public static int CheckPrime(int prime)
    {
      for (int i = 2; i < prime; i++)
        {
           if (prime % i == 0)
           {
            return 1;
           }
        }
     return 0;
    }
public static void main(String[] args)
   {
     int x = 1;
    // PrimeOneToHun obj = new PrimeOneToHun();
        for (int prime = 2; prime < 99; prime++)
         {
             x=CheckPrime(prime);
             if (x == 0)
             System.out.println(prime);
         }
   }
}

