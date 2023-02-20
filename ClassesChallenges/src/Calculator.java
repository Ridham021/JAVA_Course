public class Calculator {

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    private Floor floor;
    private Carpet carpet;




    public double getTotalCost()
    {
        return floor.getArea()*carpet.getCost();
    }
}
