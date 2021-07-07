//Using RandomAccessFile class write a program to read from a file only.The file should not be written.
import java.io.*;
class random
{
public static void main(String ar[])throws IOException
{
RandomAccessFile raf1=new RandomAccessFile("new2.txt","r");
System.out.println("Reading from the file");
raf1.seek(0);
byte b1[]=new byte[(int)raf1.length()];
raf1.read(b1);
for(int i=0;i<b1.length;i++)
{
System.out.print((char)b1[i]);
}
}
}