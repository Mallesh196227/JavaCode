public class dotProduct 
{
	public static int dotProduct(int[] array1,int[] array2)
    {
        int a,b,sum;
        a=array1[0]*array2[0];
        b=array1[1]*array2[1];
        sum = a+b;
        return sum;
    }

    public static boolean doTestPass(){
        boolean testPass;
        int[] array1={1,2};
        int[] array2 = {2,3};
        int sum= dotProduct(array1,array2);
        if(sum!=8) {
           testPass=false;
            System.out.println("Test 1 Failed");
        }else { testPass=true;
            System.out.println("Test Passed");
        } return testPass;
    }

    public static void main(String[] args)
    {
        doTestPass();
    }
}
