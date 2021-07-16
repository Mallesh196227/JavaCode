import java.util.Scanner;
public class TwoDArray 
{

	public static void main(String[] args) 
	{
		int arr1[][] = new int [3][3];
		Scanner scn =new Scanner(System.in);
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1.length-1;j++)
			{
				System.out.println("Please enter the marks of class " + i +" Student " +j );
				arr1[i][j] = scn.nextInt();
			}
		}
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1.length-1;j++)
			{
				System.out.println("These are the marks of the class " + i  + " Student "+ j +" is : "+arr1[i][j] );
			}
		}
	}

}
