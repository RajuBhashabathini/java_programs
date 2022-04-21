import java.util.Scanner;
public class D01q07
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int s=0;
for(int i=0;i<5;i++)
{
a[i]=sc.nextInt();
s+=a[i];
}
sc.close();
System.out.println("Sum:"+s);
System.out.print("Avg:"+((float)s/5));
}
}