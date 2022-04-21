import java.util.Scanner;

	public class TestScoreAnalyzer
	{
		public static void main(String[] args)
		{
			ScoreAnalyzer sa=new ScoreAnalyzer();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Runs");
			String s=sc.nextLine();
			String a[]=s.split(" ");
			
			for(int i=0;i<a.length;i++)				
			sa.addRunsToList(Integer.parseInt(a[i]));
			sc.close();
			
			System.out.print("Runs Scored : ");
			sa.displayRuns();
			System.out.println("\nRunrate : "+sa.calcRunRate());
			System.out.println("Lowest Runs : "+sa.lowestRunsScored());
			System.out.println("Count of player who batted: "+a.length);
		}
}