public class Car {

    private String model= "Model x";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar()
    {
        System.out.println(doors+"-door "+color+" "+model+" "+"(covretible? - "+convertible);
    }
}
