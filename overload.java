//Using overloading get the input from the user string values and try the String functions in the overloaded methods.
import java.io.*;
class overload
{
String conc(String x,String y)
{
return (x.concat(y));
}
String conc(String x,String y,String z)
{
return ((x.concat(y)).concat(z));
}
public static void main(String ar[])throws IOException
{
String a,b,c;
overload ov=new overload();
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter the string to concat");
a=dis.readLine();
b=dis.readLine();
c=dis.readLine();
System.out.println("Sum of two String a and b ="+ov.conc(a,b));
System.out.println("Sum of three String a,b and c ="+ov.conc(a,b,c));
}
}