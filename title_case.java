//Get the input from the user as a string and convert the text into Title Case.(First letter in caps of all the words)
import java.io.*;
class title_case
{
public static void main(String ar[])throws Exception
{
String s;int l;
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter a string:");
s=dis.readLine();
l=s.length();
s=s.trim();
System.out.println("Length of string:"+l);
char c[]=s.toCharArray();
for(int i=0;i<l-1;i++)
{
if((i==0)&&(Character.isLowerCase(c[i+1])))
{
c[i]=Character.toUpperCase(c[i]);
}
if((c[i]==32)&&(Character.isLowerCase(c[i+1])))
{
c[i+1]=Character.toUpperCase(c[i+1]);
}
}
System.out.println("Enter the new string");
for(int i=0;i<l;i++)
{
System.out.print(c[i]);
}
}
}