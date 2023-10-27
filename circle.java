import java.util.*;
class circle 
{
    public static void main(String[] args) 
    {
        double pi=3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius:");
        double r = s.nextDouble();
        double area=pi*r*r;
        System.out.println("Area:"+area);

    }
}