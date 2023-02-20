public class AreaCalculator {
    public static void main(String[] args) {
        double circleArea = area(2);
        System.out.println("Area of circle is "+circleArea);
        double squareArea = area(5,5);
        System.out.println("Area of Square is "+squareArea);

    }

    public static double area(double radius)
    {
        if(radius<0)
        {
            return -1;
        }
        else
        {
            return radius*radius*Math.PI;
        }

    }
    public static double area(double x,double y){
        if((x<0) || (y<0))
        {
            return -1;
        }
        else
        {
            return x*y;
        }
    }
}
