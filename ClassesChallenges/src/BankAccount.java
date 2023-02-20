public class BankAccount {

    public BankAccount()
    {
        this(10000,1234,"Default name","default email",123456789l);
        this.printDetails();
        System.out.println("default constructor called..");
    }

    public BankAccount(String customerName, String email, long phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private int accountNumber;
    private static int accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(int accountBalance, int accountNumber, String customerName, String email, long phoneNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber=phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void depositFund(int depositAmount)
    {
        if(depositAmount<=0)
        {
            System.out.println("Negative or Zero amount can't be deposited");
        }
        else
        {
            accountBalance += depositAmount;
            System.out.println(depositAmount+"deposited successfully, after deposite balance = "+accountBalance);
        }
    }

    public void withdrawFund(int withdrawAmount)
    {
        if(withdrawAmount<0 || withdrawAmount>=accountBalance)
        {
            System.out.println("withdraw Amount is greater than accountBalamce or negative");
        }
        else
        {
            accountBalance -= withdrawAmount;
            System.out.println(withdrawAmount+" withdrawed , balance left = "+accountBalance);
        }
    }

    public void printDetails()
    {
        System.out.println("account number : "+accountNumber);
        System.out.println("customer name : "+customerName);
        System.out.println("balance : "+accountBalance);
        System.out.println("email : "+email);
        System.out.println("phone : "+phoneNumber);
    }
}
