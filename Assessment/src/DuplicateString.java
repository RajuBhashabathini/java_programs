
public class DuplicateString
{
public static void main(String[] args)
   {
	String name = "Raajjuuu";
	int n = name.length();
	
	for(int i =0;i<name.length();i++)
	{
		for(int j=i+1;j<name.length();j++)
		{
			if (name.charAt(i)==name.charAt(j))
				{
				for(int k=j;k<n-1;k++)
			    	{
				     name[k]=name[k+1];					
				    }	
				n--;
				j--;
				}    			
		}
	}
   }
}
