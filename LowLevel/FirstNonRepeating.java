import java.util.HashMap;
public class FirstNonRepeating {

		public static char findFirst(String input) 
		{
			HashMap<Character,Integer> hs=new HashMap<>();
			
			for(int i=0;i<input.length();i++) 
			{
				char ch=input.charAt(i);
				if(hs.containsKey(ch))
				{
					hs.put(ch,hs.get(ch)+1);
				}
				else
				{
					hs.put(ch,1);
				}
			}

			for(int i=0;i<input.length();i++)
			{
				char ch=input.charAt(i);
				if(hs.get(ch)==1)
				{
					return ch;
				}
			}
			return 0;
		}
		public static boolean doTestPass() 
		{
			String[] input = {"apple", "racecars", "ababdc",};
			char[] output = {'a', 'e', 'd'};
			boolean result = true;
			for (int i = 0; i < 3; i++) 
			{
				result = result && findFirst(input[i]) == output[i];
				if (!result) 
				{
					System.out.println("Test failed for " + input[i]);
					result = false;
				}
				else 
				{
					System.out.println("Test passed for " + input[i]);
					result = true;
				}
			}
			return result;
		}
		public static void main(String[] args)
		{
			doTestPass();
		}
}
