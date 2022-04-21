import java.util.ArrayList;
import java.util.*; 

public class ArrayReverse {
	
  public static void main(String[] args) {
	  
    ArrayList<Integer> nums = new ArrayList<Integer>();
    
    nums.add(3);
    nums.add(4);
    nums.add(1);
    nums.add(9);
    
    System.out.println("normal" +nums);   
    
    Collections.sort(nums);
    
    System.out.println("ascending" + nums); 
    
    Collections.sort(nums, Collections.reverseOrder()); 
    
    System.out.println("descending" + nums);
    
    
    
  }
}