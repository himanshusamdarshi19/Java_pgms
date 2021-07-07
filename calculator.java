/*Write a program to do the operations of a simple calculator. Your calculator should have the following necessary functionalities. 
1.Addition 2.Subtraction 3.Multiplication 4.Division */
import java.io.*;
class calculator
{
public static void main(String ar[])throws IOException
{
int s;
double a,b,add,mul,sub,div;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value of a & b:");
a=Double.parseDouble(ar[0]);
b=Double.parseDouble(ar[1]);
System.out.println("a="+a+" b="+b);
System.out.println("Enter a number between 1 to 4 to show some of the operation of a calculator : 1.Addition 2.Subtraction 3.Multiplication 4.Division");
s=Integer.parseInt(br.readLine());
switch(s)
{
case 1:add=a+b;
System.out.println(add);
break;
case 2:sub=a-b;
System.out.println(sub);
break;
case 3:mul=a*b;
System.out.println(mul);
break;
case 4:div=a/b;
System.out.println(div);
break;
default:
System.out.print("Invalid Input");
}
}
}