public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(90,55));
    }

    public static boolean hasSharedDigit(int x , int y)
    {
        if((x<10 || x>99) || (y<10 || y>99))
        {
            return false;
        }
        else
        {
            int xFirst = x/10 , yFirst = y/10;
            int xLast = x%10 , yLast = y%10;

            return (xFirst == yFirst || xFirst == yLast || xLast == yFirst || xLast == yLast);
        }
    }
}
