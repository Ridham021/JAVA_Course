public class NumberToWords {
    public static void main(String[] args) {

        System.out.println("getDigitCount = "+getDigitCount(100));
        System.out.println("reverse number = "+reverse(-125));
        numberToWords(125);

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int count = 0;
            while (number >= 0) {
                count++;
                number = number / 10;
            }
            return count;
        }
    }

    public static int reverse(int number)
    {
        int temp = number;
        int sum=0,rm;
        if(number==0)
        {
            return 0;
        }
        else if(number>0)
        {


                while(temp>0)
                {
                    rm=temp%10;
                    sum=sum*10+rm;
                    temp=temp/10;
                }
                return sum;

        }
        else
        {
            while(temp<0)
            {
                rm=temp%10;
                sum=sum*10+rm;
                temp=temp/10;
            }
            return sum;

        }
    }
    public static void numberToWords(int number)
    {
         if(number < 0)
         {
             System.out.println("Invalid Value");
         }

         else
         {
            int reversedNumber = reverse(number);
            for(int i=0;i<getDigitCount(number);i++)
             {

                 switch (reversedNumber%10){
                     case 0:
                         System.out.println("Zero");
                         break;
                     case 1:
                         System.out.println("One");
                         break;
                     case 2:
                         System.out.println("Two");
                         break;
                     case 3:
                         System.out.println("Three");
                         break;
                     case 4:
                         System.out.println("Four");
                         break;
                     case 5:
                         System.out.println("Five");
                         break;
                     case 6:
                         System.out.println("Six");
                         break;
                     case 7:
                         System.out.println("Seven");
                         break;
                     case 8:
                         System.out.println("Eight");
                         break;
                     case 9:
                         System.out.println("Nine");
                     default:
                         break;
                 }
                 reversedNumber /= 10;
             }
         }
    }

    //Alternate Method
  /*  public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {

            switch (reverseNumber % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }

        System.out.println();
    }*/
}
