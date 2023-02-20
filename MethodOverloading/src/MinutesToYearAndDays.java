public class MinutesToYearAndDays {
    public static void main(String[] args) {

        printYearsAndDays(527040);
    }

    public static void printYearsAndDays(long minutes)
    {
        if(minutes<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int years= (int) (minutes/(60*24*365));
            int days = (int) (minutes/(24*60));
            if(years>0)
            {
                days =  days - years*365 ;
            }
            else {

            }

            System.out.println(minutes+" min = "+years+" y and "+days+" d");
        }
    }
}
