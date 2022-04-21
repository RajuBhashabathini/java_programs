import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util. Scanner;
import java.util .Set;
import java.util.Map.Entry;
import java.util.Collections;

public class ScoreCard
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Map<String,Integer> map=new TreeMap<String,Integer>();
		System.out.println("entered scored runs");
		for(int i=0;i<5;i++)
		{
			String a = scan.next();
			Integer b =scan.nextInt();
			map.put(a,b);
		}
		scan.close();
		System.out.println("players who batted");
		Set<String> keyset=map.keySet();
		System.out.println(keyset);
		System.out.println("scores by players");
		System.out.println(map);
		int sum = 0;
		for (int val : map.values())
		{
			sum += val;
		}
		System.out.println("Total score"+sum);
		System.out.println("name of the highest score");
		int max=(Collections.max(map.values()));
		for (Entry<String, Integer> entry : map.entrySet())
		{
			if (entry.getValue()==max) 
			{
				System.out.println(entry.getKey());
			}
		}
		Iterator <Integer> i =map.values ().iterator ();
		System.out.println ("Run scored by Dhoni: " + i.next ());
	}
}