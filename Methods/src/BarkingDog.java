public class BarkingDog {
    public static void main(String[] args) {

        boolean ans = shouldWakeUp(true,0);
        if(ans)
        {
            System.out.println("You should wake Up");
        }
        else
        {
            System.out.println("You shouldn't Wake Up");
        }
    }

    public static boolean shouldWakeUp(boolean barking , int hourOfDay)
    {
        if(!barking || hourOfDay<0 || hourOfDay>23 || (( hourOfDay>7 && hourOfDay<23)))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
