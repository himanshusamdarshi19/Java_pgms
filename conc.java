//Get the first name and the last name of the first person in the first constructor and get the first,middle and last name 
//of the second person in the second constructor and concatenate the values of person1 and person2.
import java.util.*;
class conc
{
String fullname,FName,MName,LName,sum;//sum=concatenated value of person1+person2
conc(String FName,String LName)
{
this.FName=FName+" ";
this.MName="";
this.LName=LName+" ";
sum="";
}
conc(String FName,String MName,String LName)
{
this.FName=FName+" ";
this.MName=MName+" ";
this.LName=LName+" ";
sum="";
}
void concat()
{
fullname=FName+MName+LName;
sum=sum+fullname;
}
public static void main(String ar[])throws Exception
{
String sum1;
sum1="";
conc n=new conc("Himanshu","Samdarshi");
n.concat();
sum1=sum1+n.sum;
System.out.println("Person1:"+n.fullname);
conc n1=new conc("Ram","prasad","bismil");
n1.concat();
sum1=sum1+n1.sum;
System.out.println("Person2:"+n1.fullname);
System.out.println("Concatenated value of person1+person2(Sum)="+sum1);
}
}