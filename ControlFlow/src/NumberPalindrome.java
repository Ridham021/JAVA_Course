public class NumberPalindrome {
    public static void main(String[] args) {

        //System.out.println(isPalindrome(115));
        System.out.println(sumFirstAndLastDigit(159));
    }

  /*  public static boolean isPalindrome(int number)
    {
        if(number<10)
        {
            return true;
        }
        int temp = number,sum=0,rm;
        while(temp>0)
        {
            rm=temp%10;
            sum=sum*10+rm;
            temp=temp/10;
        }

        return (number==sum);
    }*/

    public static int sumFirstAndLastDigit(int number)
    {
        if(number<0)
        {
            return -1;
        }
        else
        {
            int lastDigit = number%10;
            while(number>9)
            {
                number=number/10;
            }
            return number+lastDigit;
        }
    }
}
