import java.io.*;
class write_file
{
public static void main(String ar[])throws Exception
{
FileOutputStream fos=new FileOutputStream(F:/hello);
fos.close();
}
}
/*FileOutputStream fos=new FileOutputStream("F:/ABC.txt");
String s="welcome";
byte b[]=s.getBytes();
fos.write(b);
fos.close();/
/*File f2=new File("F:/welcome");
if(f2.mkdir())
{
System.out.println("Directory Created");
}
else
{
System.out.println("ALready exists");
}*/
/*String s="eye";
StringBuffer s1=new StringBuffer(s);
String s2=s1.reverse().toString().toString();//eye
s2.replace('y','v');
if(s.equals(s2))
System.out.println("Palindrome");
else
System.out.println("NOT");*/
/*StringBuffer s1=new StringBuffer("Hai Welcome");
System.out.println(s1.capacity()+"\t"+s1.length());
/*System.out.println(s1.capacity()+"\t"+s1.length());*/
/*String s="welcome to java program";
StringBuffer s1=new StringBuffer(s);
System.out.println((int)s.charAt(7)+s1.capacity());*/
/*String s="hello";
StringBuffer s1=new StringBuffer(s);
s1.insert(5,"w");
System.out.println(s1);*/
/*String s="Java";
StringBuffer s1=new StringBuffer(s);
String s2=s1.reverse();
System.out.println(s2);*/
/*char c[]={'h','i',' ','j','a','v','a'};
for(int i=0;i<c.length;i++)
{
if(i==0)
System.out.print(i);
if(c[i]==32)
System.out.print(i+1);*/
/*char c[]={'a','5','A','*'};
for(int i=0;i<c.length;i++)
{
if(!Character.isLetter(c[i]))
System.out.print(c[i]);}*/
/*int i=0,x=0;
char c[]={'a','5','A','*'};
while(i<c.length)
{
if(Character.isLetter(c[i]))
x=1;
i++;
}
System.out.println(x);*/
/*char c[]={'a','5','A','*'};   //' '};
System.out.println(Character.isDigit(c[1]));*/
/*char c[]={'A','P','P','L','E','t'};
String s=new String(c,1,3);
System.out.print(s);*/
/*String s="program";
char c[]=s.toCharArray();
System.out.print(c);
String s1=new String(c,1,5);
System.out.println(s1);*/
/*String s="java";
char c[]=new char[s.length()];
s.getChars(0,s.length(),c,1);
System.out.println(c);*/
/*String s="hi";
char []c=s.toCharArray();
String s1=new String(c,1,1);
System.out.println(s+s1);*/
/*String x;
String s="Java";
String s1="Programming";
String s2="Language";
s.concat(s1.concat(s2));
System.out.println(s.concat(s1.concat(s2)));*/
/*String s="String";
System.out.print(s.substring(1,5));
System.out.println(s);*/
/*char c[]={'p','g','m'};
String s=new String(c,0,2);
System.out.println(s);*/
/*String s="hello";
char a[]={'h','i'};
String s1[]=new String[a.length];
for(int i=0;i<a.length;i++)
s1[i]=a[i];
System.out.println(s);*/
/*char c[]={'a','b','c'};
char c1[]=new char[c.length];
int j=c.length-1;
for(int i=0;i<c1.length;i++)
{
c1[j]=c[i];
j--;
}
System.out.println(c1);*/
/*int i=7;
if(i%5==0)
{
System.out.println("One");
}
else if(i%5==1)
{
System.out.println("Two");
}
else
{
assert true:"Error";
System.out.println("Three");*/
/*int n=Integer.parseInt(ar[0]);
try
{
System.out.println("Test");
assert (n%2==0):"Odd No";
System.out.println("Even");
}
catch(AssertionError e)
{
System.out.println(e.getMessage());*/
/*String s="9874556453";
assert s.length()!=10:s;
System.out.println("must be 10 digits");*/
/*try
{
int year=2016;
int flag=year%4;
assert flag!=0:"Not Leap Year";
System.out.println("Leap Year");
}
catch(AssertionError e)
{
System.out.println(e.getMessage());
}*/