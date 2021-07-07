//Create a package employee and get the details of 5 employees along with their salary.In the main program filter the employees by 
//their salary range.
package employee;
public class details
{
  private String name, address;
  private int year, salary;
  public details(String n, int y, int sal, String add){
    name = n;
    year = y;
    salary = sal;
    address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  public int getSalary(){
    return salary;
  }
  public String getAddress(){
    return address;
  }
}
