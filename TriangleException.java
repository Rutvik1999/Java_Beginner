import java.lang.Exception;
class IllegalTriangleException extends Exception
{
	private double perimeter;
	IllegalTriangleException(double perimeter)
	{
		this.perimeter = perimeter;
	}
	public String toString()
	{
		return "Illegal Triangle. Perimeter =  " + this.perimeter;
	}
}

class Triangle

{
	double side1, side2, side3;
	Triangle()
	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	Triangle(double side1, double side2, double side3) throws IllegalTriangleException
	{
	    if (((side1 + side2) < side3) || ((side2 + side3) < side1) || ((side3 + side1) < side2)) 
			{
			    throw new IllegalTriangleException(side1 + side2 + side3);
			}
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		
	}
	double getSide1(){ return this.side1; }
	double getSide2(){ return this.side2; }
	double getSide3(){ return this.side3; }
	double getArea()
	{
		double s = (side1 + side2 + side3)/2;
		return Math.sqrt(s * ( s - side1 ) * ( s - side2 ) * ( s - side3 ) );
	}
	double getPerimeter()
	{
		return (side1 + side2 + side3);
	}
	public String toString()
	{
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
	}
}


public class TriangleException
{
	public static void main(String[] args) throws IllegalTriangleException
	{
		Triangle t1= new Triangle(2,3,4);		 
		System.out.println("t1 created successfully \n" + t1);
		Triangle t2 = new Triangle(12,13,105);
		System.out.println("t2 created successfully \n" + t2);
	}
}
