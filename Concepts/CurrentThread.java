//Checking the current thread



public class CurrentThread implements Runnable 
{
	public void run()
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
	}

	public static void main(String[] args) 
	{
		CurrentThread ct = new CurrentThread();
		Thread t = new Thread(ct);
		t.start();
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
		
	}

}
