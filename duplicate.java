//Write a program to get 5 values from the user and if a program comes across a duplicate value then it should prompt the user to 
//type a non-duplicate value.
import java.io.*;
class duplicate 
{
public static void main(String ar[])throws Exception
{
int i,k,j=0;
int []n=new int[5];
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter the 5 values:");
for(i=0;i<5;i++)
{
n[i]=Integer.parseInt(dis.readLine());
}
//Replace Duplicate values
for(i=0;i<5;i++)
{
for(k=i-1;k>=0;k--)
{
if(n[i]==n[k])
{
System.out.println("Enter a non-duplicate number at position "+k);
n[i]=Integer.parseInt(dis.readLine());
}
}
for(k=i+1;k<5;k++)
{
if(n[i]==n[k])
{
System.out.println("Enter a non-duplicate number at position "+k);
n[i]=Integer.parseInt(dis.readLine());
}
}
}
for(i=0;i<5;i++)
{
System.out.printf("n[%d]=%d ",i,n[i]);
System.out.println();
}
}
}

//Write a Java program to find the duplicate values of an array of integer values.
/*import java.util.Arrays; 
public class Exercise12 {
  public static void main(String[] args) 
    {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }    
}
*/