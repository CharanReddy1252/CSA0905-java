import java.util.*;
class Swap
{
public static void main(String agrs[])
{
double a,b;
double temp;
Scanner s= new Scanner(System.in);
System.out.println("A:");
a= s.nextDouble();
System.out.println("B:");
b=s.nextDouble();
temp=a;
a=b;
b=temp;
System.out.println("A:"+a);
System.out.println("B:"+b);
}}