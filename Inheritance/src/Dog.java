public class Dog extends Animal{

    private String earShape;
    private String tailShape;



    public Dog() {
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type,double weight)
    {
        this("Mutt",50,"perky","curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15 ? "small":(weight<35 ? "medium":"large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
