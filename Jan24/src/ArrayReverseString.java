import java.util.ArrayList;
import java.util.*; 

public class ArrayReverseString {
	
  public static void main(String[] args) {
	  
    ArrayList<String> names = new ArrayList<String>();
    
    names.add("Mercedez");
    names.add("Audi");
    names.add("Lamborghini");
    names.add("Bugatti");
    
    System.out.println("normal" +names);   
    
    Collections.sort(names);
    
    System.out.println("ascending" + names); 
    
    Collections.sort(names, Collections.reverseOrder()); 
    
    System.out.println("descending" + names);
    
    
    
  }
}