class NewThread implements Runnable 
{
	String name; 
	Thread t;
	NewThread(String threadName) 
	{
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start(); 
	}
	public void run() 
	{
		try 
		{
			for(int i=1; i<= 5; i++) 
			{
				System.out.println(name + ": " + i);
				Thread.sleep(20);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println(name + " Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
class MultiThreadDemo 
{
	public static void main(String args[]) 
	{
		NewThread ob1 = new NewThread("One"); 
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
		
		try 
		{
			for(int i=1; i<=5;i++)
			{
				System.out.println("Main : "+i);
				Thread.sleep(20);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}