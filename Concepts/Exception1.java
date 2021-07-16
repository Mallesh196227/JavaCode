public class Exception1 {

	public static void main(String[] args) {
		System.out.println("Today's topic is Exception Handling");
		try {
			int a = 20;
			int b = 0;
			int c = a/b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		catch (ArithmeticException ae) 
		{
			ae.printStackTrace();
		}
		finally 
		{
			System.out.println("From Finally Block");
		}
		System.out.println("Hello Welcome");
		System.out.println("Welcome Back");
	}
}