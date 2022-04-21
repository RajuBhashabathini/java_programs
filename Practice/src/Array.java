import java.util.Scanner;

public class Array
{
	public static  void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter size of array");
		 int n = sc.nextInt();
		 int max= 0  ; 
		 double sum=0;
		 
		 int[] abcd = new int[n];
		for(int i=0;i<n;i++)
		{				
		  System.out.println("print "+ (i+1)+  "input");		
		  abcd[i]= sc.nextInt();		  
		 }	
		for(int i=0;i<n;i++)
		{			
			System.out.println(abcd[i]);			
		}
		
		for(int i=0;i<n;i++)
		{			
			sum+=abcd[i];			
		}
		System.out.println("the sum of elements is:" + sum);	
		
		for(int i=0;i<n;i++)
		{			
			
			if(max<abcd[i])
				max = abcd[i];		
		}
		System.out.println("max element of array is:" + max);
		
		double avg = sum/n;
		System.out.println("avg  of array is:" + avg);
		
		
	    int min = abcd[0];
		for(int i=0;i<n;i++)
		{			
			
			if(min>abcd[i])
				min = abcd[i];		
		}
		System.out.println("min element of array is:" + min);
		System.out.println("reverse an array is");
		
		for(int i=n-1;i>=0;i--)
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
				
		
        System.out.println("ascending an array");
		int temp = 0;
		for(int i =0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (abcd[i]>abcd[j])
					{
					temp=abcd[i];
					abcd[i]=abcd[j];
					abcd[j]=temp;
				    }	    			
			}
		}
		
		for(int i=0;i<n;i++)
		{			
			System.out.println(abcd[i]);			
		}
		 System.out.println("descending an array");
		
			for(int i =0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if (abcd[i]<abcd[j])
						{
						temp=abcd[i];
						abcd[i]=abcd[j];
						abcd[j]=temp;
					    }	    			
				}
			}
			
			for(int i=0;i<n;i++)
			{			
				System.out.println(abcd[i]);			
			}
		
	   sc.close();	
	   
	 }
}
