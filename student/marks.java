//Create a package named student and in the class marks get the marks of the n students. In the main program import the package,
//get the marks of the student and print them.
package student;
import java.util.*;
public class marks
{
public void get(int n)
{
int i;
int[] ar=new int[n];
Scanner sc=new Scanner(System.in);
for(i=0;i<n;i++)
{
System.out.println("Enter the marks of student "+i);
ar[i]=sc.nextInt();
System.out.println("Marks of student "+i+" is= "+ar[i]);
}
}
}