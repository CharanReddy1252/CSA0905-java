import java.util.*;
class Fibonacci1
{
public static void main(String agrs[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int i,c;
System.out.print("Enter a number:");
int num= s.nextInt();
System.out.print(a+"   "+b+"   ");
for(i=0;i<num;i++)
{
c=a+b;
a=b;
b=c;
System.out.print(c+"  ");
}
}}
