import java.util.*;
class Vote
{
public static void main(String agrs[])
{

double age;
Scanner s=new Scanner(System.in);
System.out.println("Enter the age:");
age=s.nextDouble();
double news;
news=18-age;
if(age>18)
{
System.out.println("Eligible");
}
else
{
System.out.println("You are allowed to vote after"+news);
}}}
