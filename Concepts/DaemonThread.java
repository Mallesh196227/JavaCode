//checking daemon thread
public class DaemonThread implements Runnable
{
	public void run()
	{
		System.out.println("Welcome to Daemon Thread");
	}

	public static void main(String[] args) 
	{
		DaemonThread dt = new DaemonThread();
		Thread t1 = new Thread(dt);
		
		t1.setDaemon(true);
		
		t1.start();
		
		System.out.println(t1.isDaemon());
	}
}