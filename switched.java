import java.io.*;
class switched
{
public static void main(String arg[])throws Exception
{
char c;
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter the character");
c=(char)dis.read();
if(c>='0' && c<='9')
System.out.println("Number");
else if(c>='a' && c<='z')
System.out.println("Lowercase");
else
System.out.println("Uppercase");
}
}
