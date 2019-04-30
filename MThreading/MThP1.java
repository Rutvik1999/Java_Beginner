class MTh extends Thread
{
    public void run()
    {
        try 
        {
            System.out.println(Thread.currentThread().getId() + " Running ");
        } 
        catch (Exception e) 
        {
            System.out.println(" Exception ");
            //TODO: handle exception
        }
    }
}

class MThP1 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 10; i++) 
        {
            MTh obj = new MTh();
            obj.start();
        }
    }
} 