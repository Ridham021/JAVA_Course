public class SpeedConverter {
    public static void main(String[] args) {

        double kilometersPerHour = 15d;
        long ans = toMilesPerHour(kilometersPerHour);
        if (ans == -1) {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println(kilometersPerHour+" km/h = "+ans+" mi/h");
        }


    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        else{
        double milesperHour = kilometersPerHour / 1.609;
        //System.out.println(Math.round(kilometersPerHour/1.609));
        //printConversion(kilometersPerHour);
        return Math.round(milesperHour);

    }

    }

    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            long milesperHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = "+milesperHour+" mi/h");
        }
    }
}
