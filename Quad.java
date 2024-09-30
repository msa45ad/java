import java.util.*;
class Quad
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a:");
a=sc.nextInt();
System.out.println("Enter the value of b:");
b=sc.nextInt();
System.out.println("enter the value of c:");
c=sc.nextInt();
double d;
d=b*b-(4*a*c);
double r1,r2;
if(d<0)
{
System.out.println("Roots are imaginary and real roots aren't possible");
}
else if(d>0)
{
System.out.println("roots are real and distinct");
r1=((-b)+Math.sqrt(d))/2*a;
r2=((-b)-Math.sqrt(d))/2*a;
System.out.println("roots are:"+r1+","+r2);
}
else
{
r1=-b/(2*a);
r2=-b/(2*a);
System.out.println("roots are real and equal:"+r1+","+r2);
}
}

}