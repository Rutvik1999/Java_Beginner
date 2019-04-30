class Table 
{
    synchronized void printTable(int n) 
    {// synchronized method
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(n * i);
            try 
            {
                Thread.sleep(400);
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
    }
}

class MTh extends Thread 
{
    Table t;
    int x;
    MTh(Table t, int x) 
    {
        this.t = t;
        this.x = x;
    }

    public void run() 
    {
        t.printTable(x);
    }

}

public class MThP11 
{
    public static void main(String args[]) 
    {
        Table obj = new Table();// only one object
        new MTh(obj,5).start();
        new MTh(obj,100).start();
    }
}
