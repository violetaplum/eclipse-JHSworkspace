package rectangleMain;

abstract class Shape
{
    public String name = "Shape";
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public String getName()
    {
        return this.name;
    }
    public String toString()
    {
        return "Shape..."+super.toString();
    }
}

class Rectangle extends Shape
{
    private  final double width, height, area, perimeter;
    public Rectangle(double width,double height)
    {
        this.width = width;
        this.height = height;
        this.area = width*height;
        this.perimeter = 2*(width + height);
    }
    @Override
    public double calcArea()
    {
        return this.area;
    }
    @Override
    public double calcPerimeter()
    {
        return this.perimeter;
    }
    public String toString()
    {
        return "Rectangle..."+super.toString();
    }
}

class Circle extends Shape
{
    private final double radius, area, perimeter;
    public Circle(double radius)
    {
        this.radius = radius;
        this.area = Math.PI*radius*radius;
        this.perimeter = 2*Math.PI*radius;
    }
    public double calcArea()
    {
        return this.area;

    }
    public double calcPerimeter()
    {
        return this.perimeter;
    }
    public String toString()
    {
        return "Circle..."+super.toString();
    }
}

public class RectangleMain
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(3,4);
        Circle c = new Circle(5);
        r.calcArea();
        c.calcArea();
    }
}