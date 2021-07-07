//Get an input from the user and convert the text to its ASCII values.
import java.io.*;
class ascii
{
public static void main(String ar[])throws Exception
{
String s;
int l,i;
DataInputStream dis=new DataInputStream(System.in);
s=dis.readLine();
s=s.trim();
l=s.length();
int x[]=new int[l];
char c[]=s.toCharArray();
for(i=0;i<l;i++)
{
x[i]=(int)c[i];
System.out.print(x[i]);
}
}
}