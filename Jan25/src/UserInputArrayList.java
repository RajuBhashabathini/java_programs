import java.util.*;

public class UserInputArrayList 
{
	public static void main(String args[]) 
	{
	  Scanner sc = new Scanner(System.in); 
	  double sum = 0;
	  double average = 0;
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	
	System.out.println("Enter the number of Students");
	int n = sc.nextInt();
	
	for(int i = 0; i < n; i++)  
	{
		System.out.println("Type  " + i +"  input integer:");
		arraylist.add(sc.nextInt());	
	}
	sc.close();
	System.out.println("Marks :" + arraylist);
	System.out.println();
	System.out.println("3rd Student Marks : "+ arraylist.get(2));
	
	Collections.sort(arraylist);
	 
	System.out.println("Highest Marks : "+ arraylist.get(arraylist.size()-1));
	System.out.println();
	
	for (int number : arraylist)
	{
        sum += number;
        average = sum/n;
    }
	System.out.println("Average Marks :" + average);
	System.out.println("Sorted " + arraylist);
	
	}
}
