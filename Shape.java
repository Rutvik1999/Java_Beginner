import java.util.Scanner;

abstract class Shape_abstract
{
    abstract double area();
    abstract double volume();
}

class Cylinder extends Shape_abstract
{
    double r, h;
    Cylinder(double r, double h)
    {
        this.r = r;
        this.h = h;
    }
    double area()
    {
        return (2*Math.PI*r*r + 2*Math.PI*r*h);   
    }
    double volume()
    {
        return Math.PI*r*r*h;
    }
}

class Cone extends Shape_abstract
{
    double r, h;
    Cone(double r, double h) 
    {
        this.r = r;
        this.h = h;
    }

    double area() 
    {
        return (Math.PI * r * (r + Math.sqrt(h*h + r*r)));
    }

    double volume() 
    {
        return (h/3)* Math.PI * r * r;
    }
}

public class Shape
{
    public static void main(String[] args)
    {
        System.out.println("Enter Radius and Height of Cylinder");
        Scanner scr = new Scanner(System.in);
        Cylinder c = new Cylinder(scr.nextDouble(),scr.nextDouble());
        System.out.println("Area of Cylinder = " + c.area() + ", " + "Volume of Cylinder = " + c.volume());
        System.out.println("Enter Radius and Height of Cone");
        Cone o = new Cone(scr.nextDouble(), scr.nextDouble());
        System.out.println("Area of Cone = " + o.area() + ", " + "Volume of Cone = " + o.volume());
    }
}


