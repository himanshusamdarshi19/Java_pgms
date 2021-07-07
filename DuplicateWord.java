//Check a sentence given as input by the user and print the number of duplicate words in the given sentence.
import java.io.*;
import java.util.*;
import java.lang.String;
public class DuplicateWord 
{    
    public static void main(String[] args)throws IOException
    {    
	DataInputStream dis=new DataInputStream(System.in);   
        StringBuffer str=new StringBuffer(dis.readLine());
        int count;   
        String s=str.toString();
        s=s.trim();    
        //Converts the string into lowercase    
        s=s.toLowerCase();                
        //Split the string into words using built-in function    
        String words[]=s.split(" ");    
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < words.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;    
                    //Set words[j] to 0 to avoid printing visited word    
                    words[j] = "0";    
                }    
            }    
                
            //Displays the duplicate word if count is greater than 1    
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }  
    }    
}