class MTh extends Thread 
{
    static int i;
    public void run() 
    {
        try {
            Thread.currentThread().setPriority(++i);
            System.out.println("Th : " + Thread.currentThread().getId() + " R . Priority =  " + Thread.currentThread().getPriority());
        } 
        catch (Exception e) 
        {

            System.out.println(e);
            // TODO: handle exception
        }
    }
}

class MThP4 {
    public static void main(String[] args) 
    {
        for (int i = 0; i < 10; i++) 
        {
            MTh obj = new MTh();
            obj.start();
        }
    }
}