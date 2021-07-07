//Write a program to get 5 values from the user and if a program comes across a duplicate value then it should prompt the user to 
//type a non-duplicate value.
import java.io.*;
class duplicate1
{
boolean checkDuplicate(int[],int);
int enterNonDuplicate(int[],int);
public static void main(String a[])throws IOException
{
int i;
int ar[]=new int[5];
DataInputStream dis=new DataInputStream(System.in);
for(i=0;i<5;i++)
{
ar[i]=Integer.parseInt(dis.readLine());
}
for(i=0;i<5;i++)
{
if(checkDuplicate(ar,ar[i])==true)
{
ar[i]=enterNonDuplicate(ar,i);
}
}
boolean checkDuplicate(int m[],int s)
{
int t,i;
t=1;
for(i=0;i<5;i++)
{
if(m[i]==s)
{
t++;
}
if(t>1)
break;
}
if(t>1)
return true;
else
return false;
}
int enterNonDuplicate(int m[],int j)
{
int n;
System.out.println("Enter a non-duplicate number at position "+j);
System.out.printf("%d",m[j]);
n=m[j];
if(checkDuplicate(m,m[j]==true))
return enterNonDuplicate(m,j);
else
return n;
}
}
}