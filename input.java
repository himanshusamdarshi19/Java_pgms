//Get the input from the user till he enters a positive number.If he types a negative number the loop should break.
import java.io.*;
class input
{
public static void main(String ar[])throws IOException
{
int b,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any number:");
n=Integer.parseInt(ar[0]);
System.out.println(n);
while(n>0)
{
System.out.println("Enter a number:");
b=Integer.parseInt(br.readLine());
if(b<0)
break;
n--;
if(n==0)
{
System.out.println("Re-enter the value of n:");
n=Integer.parseInt(br.readLine());
}
}
}
}
