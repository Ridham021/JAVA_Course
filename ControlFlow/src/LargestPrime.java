public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
    }

    public static int getLargestPrime(int number)
    {
        if(number<2)
        {
            return -1;
        }
        else if(number==2)
        {
            return 2;
        }
        else
        {
            int max = 2;
            for(int i=1;i<=number;i++)
            {
                if(number%i==0)
                {
                    boolean f=true;
                    for(int j=2 ; j<=i/2 ; j++)
                    {
                        if(i%j==0)
                        {
                            f=false;
                        }

                    }
                    if(f)
                    {
                        if(i>max)
                        {
                            max=i;
                        }
                    }
                }
            }
            return max;
        }
    }

    //Alternate Solution

   /* public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }*/
}
