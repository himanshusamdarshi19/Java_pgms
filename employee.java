//Prepare a payroll sheet for employees under grade 1,2,3 and 4 , where 1 is the highest and 4 is the lowest . The HRA for employees 
//is calculated as follows . For grade 1 employee HRA is 30% of basic pay subject to a max of Rs. 10000/-,grade2-20% of basic subject 
//to a max of 7500/-,HRA of grade 3 employee is 15% of basic subject to a max of 5000/- and grade 4 employee's HRA is 10% of basic pay.
class employee
{
public static void main(String ar[])
{
int grade,i,hra=0,basic_pay;
System.out.println("Enter the basic pay subject:");
basic_pay=Integer.parseInt(ar[0]);
System.out.println(basic_pay);
System.out.println("Enter the grade of the employee:");
grade=Integer.parseInt(ar[1]);
System.out.println(grade);
switch(grade)
{
case 1:
	hra=(30*basic_pay)/100;
	break;
case 2:
	hra=(20*basic_pay)/100;
	break;
case 3:
	hra=(15*basic_pay)/100;
	break;
case 4:
	hra=(10*basic_pay)/100;
	break;
default:
	System.out.println("Invalid Grade Entered");
}
System.out.println("HRA :"+hra);
}
}

