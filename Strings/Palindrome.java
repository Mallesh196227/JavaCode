
import java.util.Scanner;
public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the Word");
		String x=scn.nextLine();
		
		char y[] =x.toCharArray();
		int size = y.length;
		char a[] = new char[size];
		
		int i=0;
		
		while(i != size)
		{
			a[size-1-i] = y[i];
			++i;
		}
		System.out.println(a);
		
		i=0;
		while(i != size)
		{
			if(a[i] != y[i])
			{
				System.out.println("Not a palindrome");
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