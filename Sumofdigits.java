import java.util.*;
class Sumofdigits
{
public static void main(String agrs[])
{
Scanner s=new Scanner(System.in);
int x;
x=s.nextInt();
while(x!=0)
{
rem=x%10;
sum+=rem;
x/=10;
}
System.out.println("Sum: "+sum);
}
}




