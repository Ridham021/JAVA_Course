public class PlayingCat {
    public static void main(String[] args) {

        boolean ans = isCatPlaying(true,10);
        System.out.println(ans);
    }

    public static boolean isCatPlaying(boolean summer , int temprature)
    {
        if(temprature>45 || (!summer && temprature>35) || temprature<25)
        {
            return false;
        } else  {
            return true;

        }

    }
}
