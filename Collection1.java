public class Collection1 extends Exception 
{
	
	public Collection1(String str)
	{
		super(str);
	}
	
	public static void main(String[] args)  throws Exception
	{
		try {
			java.util.Scanner sc =new java.util.Scanner(System.in);
			System.out.println("Enter Your age");
			int age = sc.nextInt();
			if(age<18)
				throw new Exception("You are not eligible");
			else 
				System.out.println("Eligible for vote");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
