class MTh implements Runnable
{
    Thread t;
    MTh()
    {
        t = new Thread(this, "MThread");
        t.start();
    }  
    public void run() 
    {
        try {
            
            System.out.println(t.getId() + " R ");

        } 
        catch (Exception e) 
        {
            System.out.println(" Exception ");
            // TODO: handle exception
        }
    }
}
class MThP2
{
        public static void main(String[] args) 
    { 
        for (int i=0; i<10; i++) 
        { 
            MTh obj = new MTh(); 
        } 
    } 
}