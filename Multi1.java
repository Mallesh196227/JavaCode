public class Multi1 extends Thread {
	public void run() 
	{
		System.out.println("Run method is executed by Jvm");
	}

	public static void main(String[] args) {
		Multi1 m1 = new Multi1();
		Thread t = new Thread(m1);
		t.start(); 
	}

}
