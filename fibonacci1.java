//We have done a program to find the fibonacci series using a for loop. Now find the fibonacci series using constructors.
import java.util.*;
class fibonacci1
{
int k1,k2;
fibonacci1()
{
k1=0;k2=1;
}
void fibonacci_series(int x)
{
int next,i;
System.out.print(k1+" "+k2+" ");
for(i=1;i<=x-2;i++)
{
next=k1+k2;
System.out.print(next+" ");
k1=k2;k2=next;
}

}
public static void main(String ar[])throws Exception
{
int n;
Scanner sc=new Scanner(System.in);
fibonacci1 fib=new fibonacci1();
n=sc.nextInt();
fib.fibonacci_series(n);
}
}