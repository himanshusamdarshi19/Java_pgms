//In a 3*3 matrix find the sum of the diagonal values from left to right.
import java.util.*;
class sod
{
public static void main(String a[])throws Exception
{
Scanner sc=new Scanner(System.in);
int i,j,sum;sum=0;
int[][] ar=new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
ar[i][j]=sc.nextInt();
if(i==j)
{
sum=sum+ar[i][j];
}
}
}
System.out.println("Sum of diagonal from left to right is:");
System.out.println(sum);
}
}