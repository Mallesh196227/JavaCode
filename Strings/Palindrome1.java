public class Palindrome1 
{
	public static void main(String args[])
	{
		String x = "too HoT to hoot";
		x=x.replace(" ", "");
		x=x.toLowerCase();
		char y[] = x.toCharArray();
		int size = y.length;
		char a[]=new char[size];
		int i=0;
		while(i != size)
		{
			a[size-1-i] = y[i];
			++i;
		}
		i=0;
		while(i != size) 
		{
			if(a[i] != y[i])
			{
				System.out.println("This is not a palindrome");
				System.exit(0);
			}
			else
			{
				++i;
				continue;
			}
		}
		System.out.println("Palindrome");
				
	}
}
