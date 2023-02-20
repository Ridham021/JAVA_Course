public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234568));
    }

    public static int getEvenDigitSum(int number)
    {
       if(number<0)
       {
           return -1;
       }
       else
       {
           int sum=0;
           while(number>0)
           {
               int temp = number%10;
               if(temp%2==0)
               {
                   sum=sum+temp;
               }
               number=number/10;
           }
           return sum;
       }
    }
}
