//Get the input from the user the details of students and using PrintWriter print the values in the console as in 
//a list format with the rows separated by lines.
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class details 
{
public static List<String> listA = new ArrayList<>();
public static List<String> listB = new ArrayList<>();
public static void main(String ar[])throws IOException
{
int j=0;
listA.add("Himanshu");
listA.add("Samdarshi");
listA.add("Bhagalpur");
listA.add("Bihar");
try
{
PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
while(j<listB.size())
{
for(int i=0;i<listA.size();i++) 
{
    writer.print(listA.get(i));
    writer.print(listB.get(i));
    writer.println();
}
j++;
}
  writer.close();
} 
catch (IOException e) 
{
  System.out.println(e);
}
j=0;
PrintWriter out1=new PrintWriter(System.out,true);
while(j<listB.size())
{
for(int i=0;i<listA.size();i++) 
{
    out1.print(listA.get(i));
    
    out1.print(listB.get(i));
    
    out1.println();
}
j++;
}
}
}