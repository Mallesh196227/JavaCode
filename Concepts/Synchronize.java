import java.io.ObjectInputStream.GetField;

public class Synchronize implements Runnable  {
	int count;
	public synchronized void run()
	{
		for(int i=1;i<=20;i++)
		{
			count++;
		}
		
	}
	

	public static void main(String[] args) {
		 MultiSynchronize m1=new  MultiSynchronize();//Object
		 Thread t1 =new Thread(m1);
		 Thread t2=new Thread(m1);
		 t1.start();
		 t2.start();
		 System.out.println(t1.isAlive());
		 t1.setName("Mythread 1");
		 t2.setName("Mythread 2");
		 System.out.println(t1.getName());
		 System.out.println(t2.getName());
		 t1.setPriority(1);
		 t2.setPriority(10);
		 System.out.println(t1.getPriority());
		 System.out.println(t2.getPriority()); 
		 try 
		 {
			 t1.join();
			 t2.join();
		 }
		 catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println(m1.count);
		 System.out.println(t1.isAlive());
	}
}