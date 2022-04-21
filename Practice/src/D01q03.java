import java.util.Scanner;

public class D01q03 
   {
	public static void main(String args[])
	  {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		System.out.print(a>b?(a>c?a:c):(b>c?b:c));	
    	}
   }
