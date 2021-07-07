//Create a inheritance folder and inside the folder create another folder called one and inside one create two class files called 
//single and double.The single class file will be the base class and the double will be the derived class.Get values as input in 
//the base class and display the values in the derived class.[HINT:Use Constructors]
package inheritance.one;
import java.io.*;
public class doub
{
int num;
public doub()
{
System.out.println("Default Constructor");
}
public doub(int n)
{
num=n;
}
public void display_Values()
{
System.out.println("Value ="+ num);
}
}