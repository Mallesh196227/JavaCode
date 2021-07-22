public class FibinacciSeries
{
	public static long fibonacci(int x)
    {
               int x1=0,x2=1,x3;
               if(x==0)
                   return x1;
               
               for(int i=2;i<=x;i++)
               {
                   x3=x1+x2;
                   x1=x2;
                   x2=x3;
               }
               return x2;
    }
	public static void doTestPass()
    {
       boolean result=true;
       result=result && fibonacci(0)==0;
       result=result && fibonacci(1)==1;
       result=result && fibonacci(2)==1;
       result=result && fibonacci(10)==55;
       result=result && fibonacci(40)==102334155;
       if(result)
       {
          System.out.println("all test pass");
       }
       else
       {
          System.out.println("there are test failures");
       }
    }
	public static void main(String[] args)
    {
        doTestPass();
    }
}