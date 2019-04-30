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

class Producer implements Runnable
{
    Thread t;
    Store s;
    Producer(Store s)
    {
        this.s = s;
        t = new Thread(this,"Producer");
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            s.put(i++);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }
    }
}

class Consumer implements Runnable
{
    Thread t;
    Store s;
    Consumer(Store s)
    {
        this.s = s;
        t = new Thread(this,"Consumer");
    }
    public void run()
    {
        while(true)
        {
            s.get();
        }
    }
}
public class MThP5 {
    public static void main(String[] args)
    {
        Store s = new Store();
        Producer p = new Producer(s);
        Consumer c = new Consumer(s);
        p.t.start();
        c.t.start();
    }
}
