public class Point {


    private int x;
    private int y;

    public Point()
    {

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double  distance()
    {
        return Math.sqrt(x*x+y*y);
    }

    public double distance(int x2,int y2)
    {
        return Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));

    }

    public double distance(Point another)
    {
        System.out.println(x+" "+another.getX());
        System.out.println(y+" "+another.getY());
        return Math.sqrt(Math.pow((x-another.getX()),2)+Math.pow((y-another.getY()),2));
    }
}
