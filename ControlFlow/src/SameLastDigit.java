public class SameLastDigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23, 32,42));
    }

    public static boolean isValid(int number) {
        return !(number < 10 || number > 1000);

    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        System.out.println(isValid(x) && isValid(y) && isValid(z));
        if (isValid(x) && isValid(y) && isValid(z)) {
            return ((x % 10 == y % 10) || (y % 10 == z % 10) || (x % 10 == z % 10));

        } else {


            return false;
        }
    }

}

