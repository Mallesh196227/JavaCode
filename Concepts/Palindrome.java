import java.util.Scanner;

public class Palindrome 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the String");
		Scanner scn = new Scanner(System.in);
		String x = scn.nextLine();
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