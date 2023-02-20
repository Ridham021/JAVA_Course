public class Cars {

    private String description;

    public Cars(String description) {
        this.description = description;
    }

    public void startEngine()
    {
        System.out.println("Engine Started");
    }

    protected void runEngine()
    {
        System.out.println("car -> runEngine");
    }

    public void drive(){
        System.out.println("car -> driving , type is "+getClass().getSimpleName());
        runEngine();
    }

}

class GasPoweredCars extends Cars
{
    private double avgkmPerLiter;
    private int cylinders = 6;

    public GasPoweredCars(String description){
        super(description);
    }

    public GasPoweredCars(String description, double avgkmPerLiter, int cylinders) {
        super(description);
        this.avgkmPerLiter = avgkmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> all %d cylinders are fired up , Ready!",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n",avgkmPerLiter);
    }
}
