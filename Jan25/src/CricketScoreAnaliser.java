import java.util.*;
public class CricketScoreAnaliser
{
	float calcRunRate()
	{
		for (int number : ScoreAnalyzer)
		{
			double sum = 0;
			double runrate = 0;
	        sum += number;
	        runrate = sum/300;
	        return runrate;
	    }
	}
	public  addRunsToList()
	{		
		Scanner scsc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < ScoreAnalyzer.size(); i++)  
		{
		
		list.add(scsc.nextInt(ScoreAnalyzer.get(i)));	
	    }
	}
	int lowestRunsScored() extends CricketScoreAnaliser()
	{
		Collections.sort(ScoreAnalyzer);
		
		return ScoreAnalyzer.get(ScoreAnalyzer.size()-1); 
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ScoreAnalyzer = new LinkedList<Integer>();
			
		for(int i = 0; i < ScoreAnalyzer.size(); i++)  
		{
			System.out.println("Type  " + i +"  score");
			ScoreAnalyzer.add(sc.nextInt());	
		}
		sc.close();						 
		
		 System.out.println(calcRunRate());		 
		 System.out.println("Lowest run scored : "+ lowestRunsScored() );		 
		 System.out.println("Number of batsman : " + ScoreAnalyzer.size());
		 }

}
