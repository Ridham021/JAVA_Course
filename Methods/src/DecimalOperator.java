public class DecimalOperator {
    public static void main(String[] args) {
       boolean ans =  areEqualByThreeDecimalPlaces(3.171,3.172);
        System.out.println(ans);
    }

  /*  public static boolean areEqualByThreeDecimalPlaces(double num1,double num2)
    {
        if(num1==num2)
        {
            return true;
        }
        else if((num1<0 && num2>0) || (num1>0 && num2<0)  )
        {
            return false;
        }
        else
        {

            if((num1-num2)*1000 < 1 && (num1-num2)*1000 > -0.9)
            {
                System.out.println(((num1-num2)*1000));
              return true;

            }
            else
            {
                return false;

            }
        }

    }*/

    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2)
    {

        return  (int)(num1*1000) == (int)(num1*1000);
    }
}
