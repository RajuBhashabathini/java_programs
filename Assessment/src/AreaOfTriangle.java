import java.util.Scanner;

public class AreaOfTriangle 
{
	public static void main(String[] args)
	   {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter 1st side  of triangle");
		 int a = sc.nextInt();
		 System.out.println("enter 2nd side  of triangle");
		 int b = sc.nextInt();
		 System.out.println("enter 3rd side  of triangle");
		 int c = sc.nextInt();
		 sc.close();
		 
		 int s = (a + b + c)/2;
		 
		 double area = Math.sqrt((s)*(s-a)*(s-b)*(s-c));
		 System.out.println("the area of triangle is :" + area);
				 
		
	   }
}
