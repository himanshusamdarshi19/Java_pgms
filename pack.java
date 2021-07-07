//Create a package with three class files.In each class get a number from the user and in the main method find the maximum number.
import files.*;
import java.util.*;
class pack
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int a,b,c,max,m;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
one o=new one();
two t=new two();
three th=new three();
m=(o.getnumber(a)>t.getnumber(b))?o.getnumber(a):t.getnumber(b);
max=(th.getnumber(c)>m)?th.getnumber(c):m;
System.out.println("Maximum Number out of three is:"+max);
}
}