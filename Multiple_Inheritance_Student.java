/*
Create a class called MidExam will be derived class of the class Student. 
Create an interface called Sports, and another class called Results which be a derived class of the class MidExam 
and implements Sports interface. Write a Java Program to print Result of student. 
Hint:
Class Studet{
                        int Sting;
                       void getNumber(Sting n){ rollNumber=n;}
               void putNumber(int n){ System.out.println(“Roll Number :”+rollNumber)}

*/

class Student
{
    String rollNumber;
    void setNumber(String rNo)
    {
        rollNumber = rNo;
    }
    void getNumber()
    {
        System.out.println("Roll Number : " + rollNumber);
    }
}

class MidExam extends Student
{
    float sub1, sub2, sub3;
    MidExam(float sub1, float sub2, float sub3)
    {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    float getAvg()
    {
        return (sub1 + sub2 + sub3)/3;
    }
}

interface Sports
{
    void setsMarks(float m);
    float getsMarks();
}

class Results extends MidExam implements Sports
{
    float sMarks;
    public void setsMarks(float m)
    {
        sMarks = m;
    }
    public float getsMarks()
    {
        return sMarks;
    }
    Results(String rNo, float sub1, float sub2, float sub3, float m)
    {
        super(sub1,sub2,sub3);
        setNumber(rNo);
        setsMarks(m);;
    }

    void dispResult()
    {
        this.getNumber();
        System.out.println("Average marks = " + this.getAvg() + "   Sports Marks = " + this.getsMarks());
    }
}

public class Multiple_Inheritance_Student
{
    public static void main(String[] args)
    {
        Results r = new Results("17BIT100",30,40,50,45);
        r.dispResult();
    }
}
