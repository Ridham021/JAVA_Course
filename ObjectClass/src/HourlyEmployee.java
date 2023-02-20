public class HourlyEmployee extends Employee
{
    private int hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, int hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40*hourlyPayRate;
    }

    public double getDoublePay(){
        return 2*collectPay();
    }


}
