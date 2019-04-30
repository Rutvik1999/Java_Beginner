/*
Write a program by creating an 'Employee' class having the following methods and print the final salary.
                1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
                2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
                3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
*/
import java.util.Scanner;
class Employee
{
    float salary;
    float wPerDay;
    void getInfo(float sal, float wPD)
    {
        salary = sal;
        wPerDay = wPD;
    }
    void AddSal()
    {
        if(salary < 500.0)
            salary = salary + 10;
    }
    void AddWork()
    {
        if(wPerDay > 6.0)
            salary = salary + 5;
    }
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter no. of Employees");
        int c = scr.nextInt();
        Employee[] emp = new Employee[c]; 
        System.out.println("Enter salary and work hrs. per day :");
        for(int i = 0; i < c; i++)
        {
            emp[i] = new Employee();
            emp[i].getInfo(scr.nextFloat(), scr.nextFloat());
            emp[i].AddSal();
            emp[i].AddWork();
        }
        System.out.println("Adjusted Salary : ");
        for(int i = 0; i < c; i++)
        {
            System.out.println("of Employee " + (i+1) + " is " + emp[i].salary );
        }
    }
}