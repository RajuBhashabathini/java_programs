
import java.util.Scanner;
public class D01q02
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
sc.close();
System.out.print("Root 1: "+((-b-(Math.sqrt(b*b-4*a*c)))/2*a));
System.out.print("Root 2: "+((-b+(Math.sqrt(b*b-4*a*c)))/2*a));
}
}


