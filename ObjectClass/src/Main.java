import java.text.ParseException;

public class Main extends Object{
    public static void main(String[] args) throws ParseException {

        /*Student max = new Student("Max",22);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent( "jimmy",8,"carrol");
        System.out.println(jimmy);*/
/*
      Employee ridham = new Employee("Ridham","21/06/2002","23/01/2023");
        System.out.println(ridham);
        System.out.println(ridham.collectPay());
        System.out.println(ridham.getAge());

        SalariedEmployee raj = new SalariedEmployee("raj","22/07/2002","02/01/2023",10000);
        System.out.println("raj's paycheck is $"+raj.collectPay());

        HourlyEmployee marry = new HourlyEmployee("marry","10/10/2000","02/01/2023",10);
        System.out.println(marry);
        System.out.println("marry's paycheck is "+marry.collectPay());*/
//Cylinder Starts
      /*  Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());*/

        //Cylinder Ends


        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());


    }

}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" is "+age;
    }
}

class PrimarySchoolStudent extends Student{

    private String parentName;

    PrimarySchoolStudent(String name,int age,String parentName)
    {
        super(name,age);
        this.parentName=parentName;
    }

    @Override
    public String toString() {
        return   super.toString()+" and is son/daughter of "+parentName;
    }
}