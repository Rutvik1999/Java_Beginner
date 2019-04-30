/*
Q.3) Define an Employee class with suitable attributes having getSalary() method, 
which returns salary withdrawn by a particular employee. 
Write a class Manager which extends a class Employee, override the getSalary() method, 
which will return salary of manager by adding traveling allowance, house rent allowance etc.
*/
import java.util.Scanner;

class Employee_Inherit
{
    String name;
    int id;
    float sal;

    void accept() 
    {
        System.out.println("Enter id & name");
        Scanner scr = new Scanner(System.in);
        id = scr.nextInt();
        name = scr.next();
    }
    float getSalary() 
    {
        System.out.println("Enter salary : ");
        Scanner scr = new Scanner(System.in);
        return scr.nextFloat();
    }
}

class Manager extends Employee_Inherit
{
    int tr_al, h_rnt;
    float mgr_sal;
    float getSalary() 
    {
        super.accept();
        mgr_sal = super.getSalary();
        System.out.println("Enter travelling allownces & house rent");
        Scanner scr = new Scanner(System.in);
        tr_al = scr.nextInt();
        h_rnt = scr.nextInt();
        return mgr_sal + tr_al + h_rnt;
    }
    void display() 
    {
        System.out.println("Name = " + name + ", ID = " + id + ", Total Salary = " + (mgr_sal + tr_al + h_rnt));
    }
}

class Worker
{
      public static void main(String[] args) 
      {
        Manager obj = new Manager();
        obj.getSalary();
        obj.display();
    }

}