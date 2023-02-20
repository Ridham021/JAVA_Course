public class Main {
    public static void main(String[] args) {
        int switchValue = 6;

      /*  switch(switchValue)
        {
            case 1:
                    System.out.println("value is "+1);
                break;

            case 2:
                System.out.println("value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("value is 3 or 4 or 5");
            System.out.println("actual value is "+switchValue);
            break;

            default:
                System.out.println("Value is not 1,2,3,4,5");
                break;
        }*/

        //Enhanced swithCase

        switch (switchValue) {
            case 1 -> System.out.println("value is " + 1);
            case 2 -> System.out.println("value is 2");
            case 3, 4, 5 -> {
                System.out.println("value is 3 or 4 or 5");
                System.out.println("actual value is " + switchValue);
            }
            default -> System.out.println("Value is not 1,2,3,4 or 5");
        }
        String month = "March";
        int quarter = getQuarter(month);

        System.out.println("month is " + month + " & Quarter is " + quarter);


    }

    public static int getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> 1;
            case "April", "May", "June" -> 2;
            case "July", "August", "September" -> 3;
            case "October", "November", "December" -> 4;
            default -> {
                yield 0;
            }
        };
    }
}