import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class ScoreCard2
{
public static void main(String[] args)
{
HashMap<String,Integer> m=new HashMap<>();
System.out.println("Enter name and Runs Scored");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String a[]=s.split(" ");
for(int i=0;i<a.length;i++)
{
String b[]=a[i].split("-");
m.put(b[0], Integer.parseInt(b[1]));
}
sc.close();
System.out.println("Players who batted");
for(HashMap.Entry<String, Integer> i:m.entrySet())
System.out.println(i.getKey());

HashMap<String, Integer> map=sortByKey(m);

System.out.println("Scores by Players");
int sum=0;
for(Map.Entry<String, Integer> i:map.entrySet())
{
System.out.println(i.getKey()+" : "+i.getValue());
sum=sum+i.getValue();
}
System.out.println("Total Score : "+sum);
for(Map.Entry<String,Integer> i:map.entrySet())
if(i.getValue()==Collections.max(m.values()))
System.out.println("Name of Highest Scorer : "+i.getKey());
System.out.println("Runs Scored by Dhoni : "+m.get("Dhoni"));
}
public static HashMap<String, Integer> sortByKey(HashMap<String, Integer> hm)
{
List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
{
public int compare(Map.Entry<String, Integer> object1, Map.Entry<String, Integer> object2)
{
return (object1.getKey()).compareTo(object2.getKey());
}
});
HashMap<String, Integer> result = new LinkedHashMap<String, Integer>();
for (Map.Entry<String, Integer> me : list)
{
result.put(me.getKey(), me.getValue());
}
return result;
}
}