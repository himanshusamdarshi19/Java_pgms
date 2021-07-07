class oper
{
int a,b,ans;
void add(char c)
{
System.out.println(a+""+c+""+b+"="+(a+b));
}
void sub(char c)
{
System.out.println(a+""+c+""+b+"="+(a-b));
}
void mul(char c)
{
System.out.println(a+""+c+""+b+"="+(a*b));
}
void div(char c)
{
System.out.println(a+""+c+""+b+"="+(a/b));
}
void getnumber(int x,int y)
{
a=x;
b=y;
}
public static void main(String ar[])
{
oper obj=new oper();
obj.getnumber(12,23);
obj.add('+');
obj.sub('-');
obj.mul('*');
obj.div('/');
}
}