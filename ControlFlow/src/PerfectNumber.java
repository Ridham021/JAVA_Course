public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(8129));
    }

    public static boolean isPerfectNumber(int number)
    {
        if(number<1)
        {
            return false;
        }
        else
        {
            int sum=0;
            for(int i=1;i<number;i++)
            {
                if(number%i==0)
                {
                    sum = sum+i;
                }
            }
            return sum==number;

        }
    }
}
