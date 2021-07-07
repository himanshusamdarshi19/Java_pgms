/*write a program to get the start meter reading and end meter reading from the user. Based on the 
number of units create a tarrif plan for calculating electricity charges.(Note:Price of One Unit is 
5 Rupees)*/
import java.io.*;
class reading
{
public static void main(String ar[])
{
int start,end,charges,unit;
start=Integer.parseInt(ar[0]);
end=Integer.parseInt(ar[1]);
//1 unit=5 Rupees
//unit:1-100= tariff:20 rupees/100 unit
//unit:100-500= tariff:40 rupees/100 unit
//unit:500-700= tariff:60 rupees/100 unit
//unit:700-1000= tariff:80 rupees/100 unit
//unit:1000 and more=tariff:100 rupees/100 unit
unit=end-start;
if(unit>=1 && unit<100)
{
charges=(unit*5)+(20*unit/100);
}
else if(unit>=100 && unit<500)
{
charges=(unit*5)+(40*unit/100);
}
else if(unit>=1 && unit<100)
{
charges=(unit*5)+(60*unit/100);
}
else if(unit>=1 && unit<100)
{
charges=(unit*5)+(80*unit/100);
}
else
{
charges=(unit*5)+(100*unit/100);
}
System.out.println("Electricity charges: "+charges);
}
}

