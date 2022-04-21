public class MyClass 
{
	public String reverseString(String str)
	{
		StringBuffer bstr=new StringBuffer(str);
		bstr.reverse();
		return bstr.toString();
	}
	public int reverseNumber(int num)
	{
		int rem=0,newn=0;
		while(num!=0)
		{
			rem=num%10;
			newn=newn*10+rem;
			num=num/10;
		}
		return newn;
	}
	public String caseChange(String str)
	{
		StringBuffer newStr=new StringBuffer(str);
		
		for(int i = 0; i < str.length(); i++)
		{
		
			if(Character.isLowerCase(str.charAt(i))) 
				{
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			     }
			else if(Character.isUpperCase(str.charAt(i))) 
				{
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
				}
	    }
	return newStr.toString();
	}
	public int[] revArray(int[] arr)
		{ int[] b=new int[arr.length];
		for(int i=0;i<arr.length;i++)
			{
			b[i]=arr[arr.length-1-i];
			}
		return b;
		}
}