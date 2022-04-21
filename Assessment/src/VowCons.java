
public class VowCons
{
	public static  void main(String[] args)
	 {
		String name = "My name is Raju";
		int vc = 0, cc = 0;
		 name = name.toLowerCase();    
		 
		 for(int i = 0; i < name.length(); i++) 
		 {    
	          if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u')     
			// if(name.charAt(i) == ('a || e || i || o || u))        
			 
			 vc++;    
	            
	            else if(name.charAt(i) >= 'a' && name.charAt(i)<='z')
	            	  cc++;
	     }    
		
		 System.out.println("Number of vowels: " + vc);    
	     System.out.println("Number of consonants: " + cc);    
		
	 }
}
