public class MThP6 extends Thread 
{
	public static void main(String[] args) throws Exception
	{
		for(int i=0;i<5;i++)
		{
			MThP6 t = new MThP6();
			t.start();
		}
		ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
		int noThreads = currentGroup.activeCount();
		Thread[] lstThreads = new Thread[noThreads];
		currentGroup.enumerate(lstThreads);
		System.out.println("Running Threads : ");
		for(int i = 0; i < noThreads; i++)
		{
			System.out.println(lstThreads[i].getName());
		}
	}
}