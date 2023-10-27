import java.util.*;
class Ageclassifier
{
public static void main(String agrs[])
{

int age;
Scanner s=new Scanner(System.in);
System.out.println("Enter the age:");
age=s.nextInt();
if(age>0 && age<=8)
{
System.out.println("kids");
}
else if(age>8 && age<=18)
{
System.out.println("Teenage");
}
else if(age>18 && age<=39)
{
System.out.println("Adults");
}
else if(age>39 && age<=59)
{
System.out.println(" Elders");
}
else if(age>59 )
{
System.out.println("Seniors");
}}}
