public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(5,3,24));
    }

    public static boolean canPack(int bigCount , int smallCount , int goal)
    {
        if(bigCount<0 || smallCount<0 || goal<0)
        {
            return false;
        }
        else
        {
            if(goal<5)
            {
                return smallCount>=goal;
            }
            else
            {
                return  (bigCount*5+smallCount)>=goal && ((goal%5-smallCount )<= 0);
            }
        }
    }
}
