public class IsPower 
{
	public static boolean isPowerOf10(int n)
    {
        if (n == 1) 
        {
            return true;
        }
        if (n % 10 != 0 || n == 0) 
        {
            return false;
        }
        if (n == 10) 
        {
            return true;
        }
        return isPowerOf10(n/10);
    }
        public static boolean doTestPass()
        {
            int[] isPowerList = {1,10,20,100,10000};
            int[] isNotPowerList = {3,50,-1};
            for (int i : isPowerList) 
            {
                if (!isPowerOf10(i)) 
                {
                    System.out.println("Test failed for " + i);
                    return false;
                }
            }
            for (int j : isNotPowerList) 
            {
                if (isPowerOf10(j)) 
                {
                    System.out.println("Test failed for " + j);
                    return false;
                }
            }
            System.out.println("All test Passed");
            return true;
        }		        
        public static void main(String[] args)
        {
            doTestPass();
        }
}