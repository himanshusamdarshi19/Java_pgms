//Get the content of a text file and store the content in another file.
import java.io.*;
class txt
{
public static void main(String ar[])throws IOException
{
int ch;
DataOutputStream out=new DataOutputStream(new FileOutputStream("C:/Users/himan/Desktop/JAVA/new.txt"));
out.writeInt(24);
out.writeFloat(74.76f);
out.writeBoolean(true);
out.close();
DataInputStream in=new DataInputStream(new FileInputStream("C:/Users/himan/Desktop/JAVA/new.txt"));
System.out.println(in.readInt());
System.out.println(in.readFloat());
System.out.println(in.readBoolean());
in.close();
File infile=new File("new.txt");
File ofile=new File("new1.txt");
FileReader fr=null;
FileWriter fw=null;
try
{
fr=new FileReader(infile);
fw=new FileWriter(ofile);
while((ch=fr.read())!=-1)
{
fw.write(ch);
}
}
catch(IOException e)
{
   System.out.println(e);
}
finally
{
try
{
fw.close();
fr.close();
}
catch(IOException e)
{
   System.out.println(e);
}
}
}
}