import java.util.Scanner;
public class D01q06
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.close();
int i=2;
while(true)
{
if((n%i==0 || n==1) && n!=2)
{
System.out.print("Not Prime");
break;
}
i++;
if(i>Math.sqrt(n))
{
System.out.print("Prime");
break;
}
}
}
}