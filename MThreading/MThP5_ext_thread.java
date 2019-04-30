class Store
{
    int n;
    static boolean item_avail;
    synchronized int get()
    {
        while(!item_avail)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }
        System.out.println("Consumer: "+this.n);
        item_avail = false;
        notify();
        return n;
    }
    synchronized void put(int a)
    {
        while(item_avail)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }
        this.n = a;
        System.out.println("Producer: " + this.n);
        item_avail = true;
        notify();
    }
}

class Producer extends Thread
{
    Store s;
    Producer(Store s)
    {
        super("Producer");
        this.s = s;
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            s.put(i++);
            try
            {
                sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }
    }
}

class Consumer extends Thread
{
    Store s;
    Consumer(Store s)
    {
        super("Consumer");
        this.s = s;
    }
    public void run()
    {
        while(true)
        {
            s.get();
        }
    }
}
public class MThP5_ext_thread {
    public static void main(String[] args)
    {
        Store s = new Store();
        Producer p = new Producer(s);
        Consumer c = new Consumer(s);
        p.start();
        c.start();
    }
}
