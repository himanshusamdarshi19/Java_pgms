import employee.details;
class Emp
{
  public static void main(String[] args)
   {
    details e1 = new details("Robert", 1994, 500000, "64C- WallsStreet");
    details e2 = new details("Sam", 2000, 740000, "68d- WallsStreet");
    details e3 = new details("John", 1999, 600000, "26B- WallsStreet");
    details e4 = new details("Rozy", 2200, 840000, "67d- WallsStreet");
    details e5 = new details("Charlie", 2500, 770000, "69d- WallsStreet");
    System.out.println("Name\tYear of joining\tSalary\tAddress");
    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t"+e1.getSalary()+"\t"+e1.getAddress());  // printing details of employee 1
    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t"+e2.getSalary()+"\t"+e2.getAddress());  // printing details of employee 2
    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t"+e3.getSalary()+"\t"+e3.getAddress());  // printing details of employee 3
    System.out.println(e4.getName()+"\t"+e4.getYear()+"\t\t"+e4.getSalary()+"\t"+e4.getAddress());  // printing details of employee 4
    System.out.println(e5.getName()+"\t"+e5.getYear()+"\t\t"+e5.getSalary()+"\t"+e5.getAddress());  // printing details of employee 5
   }
}