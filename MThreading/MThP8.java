class MTh extends Thread
{  
	public void run() 
	{
		System.out.println(getName() + " starting."); 
		for(int i = 0; i <= 4; i++)
		{  
			System.out.println(i);  
			//if((i%2)==0) 
			try
			{
				sleep(500);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			} 
		} 
		System.out.println("Exit "+ getName());  
	}  
} 

public class MThP8 
{  
	public static void main(String[] args) throws InterruptedException
	{  
		MTh t = new MTh();
		t.start();
		Thread.sleep(1000); 
		System.out.println("Suspend Thread."); 
		t.suspend(); 
		Thread.sleep(1000);  
		System.out.println("Resume Thread.");  
		t.resume();
		Thread.sleep(1000);
		System.out.println("Suspend Thread.");  
		t.suspend();
		Thread.sleep(1000); 
		System.out.println("Resume Thread.");  
		t.resume();
		Thread.sleep(1000); 
		System.out.println("Stop Thread.");   
		t.stop(); 
		System.out.println("End Main thread");  
	}  
}