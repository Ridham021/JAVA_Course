public class SumOdd {
    public static void main(String[] args) {

        int start=1,end=20;
        System.out.println("sum of odd number from "+start+" to "+end+" is "+sumOdd(start,end));
    }

    public static boolean isOdd(int number)
    {
        if(number<0 )
        {
            return false;
        }
        else
        {
            return number%2!=0;
        }
    }

    public static int sumOdd(int start , int end) {
        int sum = 0;
        if (start < 0 || end < 0 || start > end) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            return sum;
        }
    }
}
