import java.util.Scanner;

public class DuplicateArray 
{
	
	public static  void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter size of array");
		 int n = sc.nextInt();		
		 
		 int[] abcd = new int[n];
		 
		for(int i=0;i<n;i++)
		{				
		  System.out.println("print "+ (i+1)+  "input");		
		  abcd[i]= sc.nextInt();		  
		 }	
		sc.close();	
		
		
		for(int i=0;i<n;i++)
		{			
			System.out.println(abcd[i]);			
		}
				
	System.out.println("elimination of duplicate element in an array");
		
		for(int i =0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (abcd[i]==abcd[j])
					{
					for(int k=j;k<n-1;k++)
				    	{
					     abcd[k]=abcd[k+1];					
					    }	
					n--;
					j--;
					}    			
			}
		}
		System.out.println("after elimination");
		
		for(int i=0;i<n;i++)
		{			
			System.out.println(abcd[i]);			
		}
	 }
}
