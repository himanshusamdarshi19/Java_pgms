//Get the Email Id as the input from the user.If the input does not have the @ symbol then using the throw keyword print a 
//message that the given input is wrong.
import java.io.*;
class email
{
public static void main(String ar[])throws IOException
{
int i,sum;sum=0;
String s;
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter the email input");
s=dis.readLine();
char d='@';
char c[]=s.toCharArray();
for(i=0;i<c.length;i++)
{
if(c[i]=='@')
sum++;
}
if(sum==0)
{
throw new ArithmeticException("Input is wrong");
}
}
}