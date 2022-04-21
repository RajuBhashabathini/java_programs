import java.util.Scanner;
public class D01q04
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.close();
System.out.print(n%400==0 || (n%4==0 && n%100!=0)?"Leap":"Not Leap");
}
}