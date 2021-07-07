class samplecheck
{
public static void main(String ar[])
{
try
{
String num=ar[0];
int numValue=Integer.parseInt(num);
}
catch(NumberFormatException nb)
{
System.out.println("Not a number");
}
catch(ArrayIndexOutOfBoundsException ne)
{
System.out.println("No Arguements given!!!");
}
}
}