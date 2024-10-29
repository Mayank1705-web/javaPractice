class Printer
{
	void print(String firstName,String  lastName) 
	{
		System.out.print("[" + firstName);
		try 
		{
			Thread.sleep(3000);
		} 
		catch(InterruptedException e) 
		{
			System.out.println("Interrupted");
		}
		System.out.println(" "+lastName+"]");
	}
}
class Caller implements Runnable 
{
	String firstName,lastName;
	Printer target;
	Thread t;
	public Caller(Printer target, String firstName,String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.target = target;
		t = new Thread(this);
		t.start();
	}
	public void run() 
	{
		target.print(firstName,lastName);
	}
}
class SynchNot
{
	public static void main(String args[]) 
	{
		Printer target = new Printer();
		Caller ob1 = new Caller(target, "Pankaj","Wadhwani");
		Caller ob2 = new Caller(target, "Programming","World");
		Caller ob3 = new Caller(target, "Hello","Indore");
		try 
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} 
		catch(InterruptedException e) 
		{
			System.out.println("Interrupted");
		}
	}
}