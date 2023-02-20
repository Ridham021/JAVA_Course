public class EqualSumChecker {
    public static void main(String[] args) {
        boolean ans = hasEqualSum(-1,-1,-2);
        System.out.println(ans);
    }

    public static boolean hasEqualSum(int a,int b,int sum)
    {
      return (a+b)==sum;
    }
}
