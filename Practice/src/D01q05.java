import java.util.Scanner;
public class D01q05
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.close();
System.out.print(n%2==0?"Even":"Odd");
}
}