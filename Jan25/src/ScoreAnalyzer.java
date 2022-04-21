import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ScoreAnalyzer
 {
    private LinkedList<Integer> runsData=new LinkedList<>();
     void addRunsToList(int r)
    {
     runsData.add(r);
    }
    float calcRunRate()
    {
    	int sum=0;
    	Iterator<Integer> itr=runsData.iterator();
    	while(itr.hasNext())
    		sum+=itr.next();
    	return 6*((float)sum/300);
      }
    int lowestRunsScored()
    {
    	return Collections.min(runsData);
    }
    void displayRuns()
    {
    	int j=1;
	for(int i:runsData)
		{
		System.out.print(j+"-"+i+" ");
		j++;
		}
    }
}