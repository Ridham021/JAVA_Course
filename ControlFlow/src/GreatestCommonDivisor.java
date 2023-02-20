public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(500,250));
    }

   /* public static int getGreatestCommonDivisor(int x , int y)
    {
        if(x<10 || y<10)
        {
            return -1;
        }
        else
        {
            int min = x>y?y:x;
            int max = x>y?x:y;

            int gcd=1;
            for(int i=1;i<=min;i++)
            {
                if(min%i==0 && max%i==0)
                {
                    gcd = i;
                }
            }
            return gcd;
        }
    }
*/

    //Alternate method


    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }



}
