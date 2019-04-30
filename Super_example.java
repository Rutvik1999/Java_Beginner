/*
Create a base class with only a nondefault constructor, and a derived class with both a default and nondefault constructor.
In the derived-class constructors, call the base-class constructor.
*/

class Base
{
    Base()
    {
        System.out.println("This is Constructor of class Base");
    }
}
class Derived extends Base
{
    Derived()
    {
        super();
    }
    Derived(int x)
    {
        super();
        System.out.println("This is Non-Default Constructor of Derived Class");
    }
}
public class Super_example
{
    public static void main(String[] args)
    {
        Derived d1 = new Derived();
        System.out.println("d1 Created using Default constructor \n");
        Derived d2 = new Derived(1);
        System.out.println("d2 Created using Non-Default constructor");
    }
}