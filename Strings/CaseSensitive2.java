public class CaseSensitive2 
{
	public static void main(String[] args) 
	{
		String x = "abc for technology training";
		 char y[] = x.toCharArray();
		 int size = y.length;
		 int i=0;
		 while (i != size)
		 {
			 if(i !=' ')
			 {
				 y[i] = (char)(y[i]-32);
				 ++i;
			 }
		 }
		 System.out.println(x);
		 System.out.println(y);
	}
}
