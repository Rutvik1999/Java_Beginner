/*
Q.1) Define a class Student with attributes rollno and name. 
Define default and parameterized constructor. Override the toString() method. 
Keep the count of Objects created. Create objects using parameterized constructor and Display the object count after each object is created.
*/
import java.util.Scanner;
class Student
{
    String rollno;
    String name;
    static int count;
    Student() {}
    Student(String rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
        count++;
    }
    
    public String toString() 
    {
        return "rollno = " + rollno + " name = " + name;
    }
    public static void main(String[] args)
      {
            int n;
            String rollno;
            System.out.println("Enter no of students : ");
            Scanner scr = new Scanner(System.in);
            n = scr.nextInt();
            Student[] obj = new Student[n];
            for(int i=0; i < n; i++)
            {
                  System.out.println("Enter roll no : ");
                  rollno = scr.next();
                  System.out.println("Enter name : ");
                  obj[i] = new Student(rollno, scr.next());
                  System.out.println("Object no. " + (i+1) + " Created");
            }
            System.out.println("Students are : ");
            for(int i = 0;i < n; i++)
            {
                  System.out.println(obj[i]);
            }
      }

}