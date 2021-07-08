interface Calculator 
{
	abstract public void mul();
	abstract public void div();
	int a =20;
	int b = 30;
}

class Calculator1 implements Calculator
{
	
	public void mul()
	{
		
		int c = a*b;
		System.out.println("Multiply of a and b is: "+ c);
	}
	public void div() {
		int d = a/b;
		System.out.println("Division of a and b is: "+ d);
	}
	
	
}

class Calculator2 implements Calculator
{
	public void mul()
	{
		int e = a*b;
		System.out.println(e);
	}
	public void div() 
	{
		
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 c1 = new Calculator1();
		
	}

}