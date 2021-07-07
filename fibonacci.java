//Write a program to generate a fibonacci series of order 5.
class fibonacci
{
public static void main(String ar[])
{
int f,i,n,j,k;
j=1;
i=1;
k=1;
System.out.println("Enter the length of the fibonacci series:");
n=Integer.parseInt(ar[0]);
System.out.println(n);
System.out.print(k+",");
while(n!=0)
{
if(n!=1)
System.out.print(k+",");
else
System.out.print(k+".");
k=i+j;
i=j;
j=k;
n--;
}
}
}
