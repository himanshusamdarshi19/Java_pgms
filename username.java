//Get the username from the user.If the username is less than 6 characters then the program should not ask for the password else 
//the password is prompted from the user.Write this program using assertion.
import java.io.*;
class username
{
public static void main(String ar[])throws Exception
{
String s;int l;
DataInputStream dis=new DataInputStream(System.in);
s=dis.readLine();
l=s.length();
assert l<6:"Enter the password";
System.out.println("No password is required:");
}
}


/*import java.io.*;
class username
{
public static void main(String ar[])throws Exception
{
int i=8;
if(i%==0)
System.out.println("First");
else if(i%3==1)
System.out.println("First1");
else
assert false:"Error";
System.out.println("First3");
}
}*/
/*import java.io.*;
class username
{
public static void main(String ar[])throws Exception
{
try
{
System.out.println("testing...");
assert true:"Condition is true ,so we won't see this";
assert false:"If assertions are on,we'll see this";
}
catch(AssertionError e)
{
e.printStackTrace();
}
}
}*/