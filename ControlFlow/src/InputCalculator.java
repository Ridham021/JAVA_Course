import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage()
    {
        Scanner sc = new Scanner(System.in);
        int sum=0,count=0;
        String number;

        try {
            do {
                System.out.println("Enter number : ");
                number = sc.nextLine();
                sum = sum+Integer.parseInt(number);
                count++;
            }while(true);
        }
        catch (NumberFormatException nfm)
        {
            System.out.println("SUM = "+sum+" AVG = "+(long)Math.round((double) sum/count));
        }
    }
}
