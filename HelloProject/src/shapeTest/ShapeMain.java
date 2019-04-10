package shapeTest;

abstract class Shape
{
    int x,y;
    double area;
    abstract void draw();
    abstract double getArea();

}

class Circle extends Shape
{

    double radius;
    public Circle(int x,int y,double radius)
    {
        super.x = x;
        super.y = y;
        this.radius = radius;

    }
    @Override
    public void draw()
    {
        System.out.println("Draw the Circle!!");
    }
    @Override
    public double getArea()
    {
        return radius*radius*Math.PI;
    }

}

class Rectangle extends Shape
{
    int width,height;

    public Rectangle(int x, int y,int width,int height)
    {
        super.x = x;
        super.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw()
    {
        System.out.println("Draw the Rectangle!!");

    }
    public double getArea()
    {
        return width*height;
    }
}

public class ShapeMain
{

    public static void main(String[] args)
    {
        Shape circle = new Circle(1,2,4);
        Shape rec = new Rectangle(3,4,4,5);

        circle.draw();
        System.out.println("The Circles Area is : "+Math.round(circle.getArea())+" and it's on point ("+circle.x+","+circle.y+")");

        rec.draw();
        System.out.println("The Rectangles Area is : "+Math.round(rec.getArea())+" and it's on point ("+rec.x+","+rec.y+")");
        //Math.round()를 사용하여 정수로 반올림 해주면 깔끔!
    }
}