public class Customer {

    private String name;
    private int creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer()
    {
        this("Ridham",150000,"rshingala@gmail.com");
    }

    public Customer(String name, String email) {
       this(name,10000,email);
    }


}
