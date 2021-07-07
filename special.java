//Using character functions get an input from the user with atleast 10 special characters and print the number of special characters 
//in the sentence given.
import java.io.*;
class special
{
public static void main(String ar[])throws Exception
{
String s;
int i,l,sp_char;sp_char=0;
DataInputStream dis=new DataInputStream(System.in);
s=dis.readLine();
s=s.trim();
l=s.length();
char c[]=s.toCharArray();
for(i=0;i<l;i++)
{
if((c[i]>=32 && c[i]<=47)||(c[i]>=58 && c[i]<=64)||(c[i]>=91 && c[i]<=96)||(c[i]>=123 && c[i]<=126))
{
sp_char++;
}
}
System.out.println("Number of special characters:"+sp_char);
}
}