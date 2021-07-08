public class MultiDemo1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args)
	{
		MultiDemo1 m1= new MultiDemo1();
		Thread t = new Thread(m1);
		t.start();
	}
}
