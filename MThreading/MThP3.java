import java.util.Scanner;
class MTh extends Thread 
{
    public void run() 
    {
        try 
        {
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter nos : ");
            int a = scr.nextInt();
            int b = scr.nextInt();
            System.out.println("Sum is :" + (a+b));
        } 
        catch (Exception e) 
        {
            System.out.println(" Exception ");
            // TODO: handle exception
        }
    }
}

class MThP3 
{
    public static void main(String[] args) 
    {
        MTh[] obj = new MTh[10];
        for (int i = 0; i < 10; i++) 
        {
            obj[i] = new MTh();
            obj[i].start();
        }
    }
}