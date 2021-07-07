//Get the list of files in a folder based on the file extension given by the user.For eg.,If the extension given by the user 
//is .xls then print the list of files with the .xls file extension only.
import java.io.*;
public class fil
{
public static void main(String ar[])
{
File f1=new File(ar[0]);
if(f1.exists())
{
if(f1.isDirectory())
{
String data[]=f1.list();
for(int i=0;i<data.length;i++)
{
if(data[i].endsWith(".txt"))
System.out.println(data[i]);
}
}
}
}
}