import java.util.*;
class TestClass 
{
    static int N[]=new int[100000];
    public static void main(String args[] ) throws Exception 
    {
      int T,i;
      Scanner sc=new Scanner(System.in);
      TestClass t=new TestClass();
      System.out.println("Enter the number of test cases");
      T=sc.nextInt();
      for(i=0;i<T;i++)
      {
          N[i]=sc.nextInt();
          t.mul(N[i]);
      }
     }
       	public void mul(int n)
	{  
           int i;
	   for(i=1;i<=n;i++)
      	     {
          	multiple(i);
     	     }
        }
      void multiple(int num)
      {
          if((num%3==0)&&(num%5==0))
          System.out.println("FizzBuzz");
          else if(num%5==0)
          System.out.println("Buzz");
          else if(num%3==0)
          System.out.println("Fizz");   
          else
          System.out.println(num);                 
      }
}