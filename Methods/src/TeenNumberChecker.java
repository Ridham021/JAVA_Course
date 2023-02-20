public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean ans = hasTeen(10,20,25);
        System.out.println(ans);
    }

    public static boolean hasTeen(int a,int b,int c)
    {
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }

    public static boolean isTeen(int a)
    {
        return (a>=13 && a<=19);
    }
}
