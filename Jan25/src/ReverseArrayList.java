import java.util.*;

public class ReverseArrayList {
	public static void main(String[] args)
	{		
		ArrayList<Integer> arrayli = new ArrayList<Integer>();
		
		arrayli.add(9);
		arrayli.add(145);
		arrayli.add(878);
		arrayli.add(353);
		arrayli.add(5);
		System.out.println("Elements before reversing: ");
		System.out.println(arrayli);
			
		Collections.reverse(arrayli);
		
		System.out.println("\nElements after reversing: ");
		System.out.println(arrayli);
	}	
}
