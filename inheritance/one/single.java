//Create a inheritance folder and inside the folder create another folder called one and inside one create two class files called 
//single and double.The single class file will be the base class and the double will be the derived class.Get values as input in 
//the base class and display the values in the derived class.[HINT:Use Constructors]
package inheritance.one;
import java.util.*;
public class single
{
int num;
public int get_Values()
{
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
return num;
}
}