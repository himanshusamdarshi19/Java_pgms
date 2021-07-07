//Create a inheritance folder and inside the folder create another folder called one and inside one create two class files called 
//single and double.The single class file will be the base class and the double will be the derived class.Get values as input in 
//the base class and display the values in the derived class.[HINT:Use Constructors]
import inheritance.*;
import inheritance.one.single;
import inheritance.one.doub;
import java.util.*;
class inhrit
{
public static void main(String ar[])throws Exception
{
single si;
int num=si.get_Values();
doub a=new doub(num);
a.display_Values();
}
}