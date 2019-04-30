
/*
public class Person
{
private String name;
public Person() {  name = "No name yet."; }
public Person(String n) { name = n;   }
public void setName(String newName){name = newName;}
public String getName(){return name; }
public void print(){ System.out.println("Name: " + name);}
public boolean equals(Object p){ return name.equals(p.name);}
}
 

Create a class called Employee whose objects are records for an employee. This class will be a derived class of the
 class Person which you will have to copy into a file of your own and compile. An employee record has an employee's name 
 (inherited from the class Person), an annual salary represented as a single value of type double, 
 a year the employee started work as a single value of type int and a national insurance number, which is a value of type String.

Your class should have a reasonable number of constructors and accessor methods, as well as an equals method. 
Write another class containing a main method to fully test your class definition.
*/

class Person
{
    private String name;
    Person()
    {
        name = "No name yet.";
    }
    Person(String name)
    {
        this.name = name;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String newName) 
    {
        name = newName;
    }
    public String toString()
    {
        return "Name: " + name;
    }
    
    public boolean equals(Person p) 
    {
        return name.equals(p.name);
    }
}

class Employee extends Person
{
    private double salary;
    private int insurance_no;
    private int join_year;
    Employee(String name, double salary, int insurance_no, int join_year)
    {
        super(name);
        this.insurance_no = insurance_no;
        this.join_year = join_year;
        this.salary = salary;
    }
    int getInsurance_no()
    {
        return insurance_no;
    }
    
    int getJoin_year() 
    {
        return join_year;
    }
    
    double getSalary() 
    {
        return salary;
    }

    public String toString()
    {
        return "name = " + this.getName() + ",salary = " + salary + ", Join Year = " + join_year + ", Insurance no =  " + insurance_no;
    }
    
    boolean equals(Employee p) 
    {
        return (p.getName() == this.getName() && p.salary == this.salary && p.join_year == this.join_year && p.insurance_no == this.insurance_no);
    }

}

class EmployeeMain
{
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee("Qwerty", 5000, 178, 2014);
        Employee emp2 = new Employee("Abcd", 6000, 248, 2015);
        Employee emp3 = new Employee("Qwerty", 5000, 178, 2014);
        if (emp1.equals(emp2))
        {
            System.out.println("Employee 1 = Employee 2");
        }
        if (emp2.equals(emp3))
        {
            System.out.println("Employee 2 = Employee 3");
        }
        if (emp3.equals(emp1))
        {
            System.out.println("Employee 1 = Employee 3");
        }
        System.out.println("Emp1 : " + emp1);
        System.out.println("Emp2 : " + emp2);
        System.out.println("Emp3 : " + emp3);

    }
}