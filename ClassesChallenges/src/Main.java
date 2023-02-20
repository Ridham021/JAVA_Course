public class Main {
    public static void main(String[] args) {


        //Bank Account Starts
        //BankAccount bankAccount = new BankAccount(101,10000,"raj","raj@gmail.com",9173649260l);
        //  BankAccount bankAccount = new BankAccount();
     /*   bankAccount.setAccountNumber(101);
        bankAccount.setAccountBalance(10000);
        bankAccount.setCustomerName("Ridham Shingala");
        bankAccount.setEmail("rshingala@gmail.com");
        bankAccount.setPhoneNumber(9104249260l);


        bankAccount.withdrawFund(2500);
        bankAccount.depositFund(12525);
        bankAccount.printDetails();*/

        //BankAccount Ends
/*
        Customer customer = new Customer("raj","raj@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());*/

//LPA
       /* for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
*/
//LPA ends

           /* Car car = new Car();
        car.describeCar();

        car.setModel("Model Y");

        System.out.println("model - "+car.getModel());
        System.out.println("color - "+car.getColor());
        System.out.println("doors - "+car.getDoors());
        System.out.println("convertible? - "+car.isConvertible());*/
/*
        Wall area = new Wall(-1.25,-1.25);
        System.out.println(area.getHeight());
        System.out.println(area.getWidth());*/

        //Point Starts
       /* Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());*/
        //Point Ends

        //Start of Carpet Cost Calculator
        /*Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        *///End of Carpet Cost Calculator

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());



    }
}