//Write a program to get the input from the user and find if the given number is a strong number. e.g., 145=1!+4!+5!(This is a Strong 
//Number)
//Note:Strong number is a number for which sum of factorials of the digits is equal to the number itself
class strong
{
public static void main(String ar[])
{
int i,j,d,x,n,f=1,sum=0;
System.out.println("Enter any number:");
n=Integer.parseInt(ar[0]);
System.out.println(n);
i=n;
while(i!=0)
{
d=i%10;
sum=sum+factorial(d);
i=i/10;
}
if(n==sum)
System.out.println(n+" is a strong number");
else
System.out.println(n+" is not a strong number");
}
static int factorial(int x)
{
int f=1;
while(x!=0)
{
f=f*x;
x--;
}
return f;
}
}


