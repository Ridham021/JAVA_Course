public class Sum3And5 {
    public static void main(String[] args) {
        int count = 0, i = 0;

        for (i = 1; i <= 1000 && count<5; i++)

        {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                System.out.println(i + " is divisible by both 3 & 5.");


            }


        }

        System.out.println("total count is " + count);
    }
}
