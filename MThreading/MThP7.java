class MThP7 extends Thread
{
	Fact f;
	public MThP7(Fact nos)
	{
		f = nos;
	}
	public void run()
	{
		synchronized(f) 
		{
			try
			{
				System.out.println("Calculating Factorial");
				sleep(500);
				f.wait();
			} 
			catch (InterruptedException e)
			{
				System.out.println("Exception Caught.");
			}
			System.out.println("Factorialof 5 is :  " + f.factorial);
			//System.exit(0);
		}
	}
	public static void main(String [] args)
	{
		Fact fact = new Fact();
		new MThP7(fact).start();
		new MThP7(fact).start();
		fact.start();
		//new Thread(fact).start();
		
	}
 }

class Fact extends Thread
{
	double factorial = 1;
	public void run()
	{
		synchronized(this)
		{
			for(int i = 1; i <= 5; i++)
			{
				factorial = factorial * i;
			}
			notifyAll();
		}
	}
}