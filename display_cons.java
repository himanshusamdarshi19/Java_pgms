//The content of a file saved as character should be displayed on the console as ascii values.
import java.io.*;
class display_cons
{
public static void main(String ar[])throws IOException
{
FileOutputStream out=new FileOutputStream("C:/Users/himan/Desktop/JAVA/new2.txt");
FileInputStream in=new FileInputStream("C:/Users/himan/Desktop/JAVA/new2.txt");
int c;
System.out.println("Enter the data and type '$' to terminate");
while((c=System.in.read())!='$')
out.write(c);
out.close();
while((c=in.read())!=-1)
System.out.print((int)c+" ");
in.close();
}
}
/*
play_arrow

brightness_4
// Creating a text File using FileWriter 
import java.io.FileWriter; 
import java.io.IOException; 
class CreateFile 
{ 
    public static void main(String[] args) throws IOException 
    { 
        // Accept a string  
        String str = "File Handling in Java using "+ 
                " FileWriter and FileReader"; 
  
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("output.txt"); 
  
        // read character wise from string and write  
        // into FileWriter  
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        System.out.println("Writing successful"); 
        //close the file  
        fw.close(); 
    } 
}*/
/*// Reading data from a file using FileReader 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
class ReadFile 
{ 
    public static void main(String[] args) throws IOException 
    { 
        // variable declaration 
        int ch; 
  
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("text"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        // read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
  
        // close the file 
        fr.close(); 
    } 
}*/