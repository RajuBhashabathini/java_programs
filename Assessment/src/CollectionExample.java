import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionExample 
  {

	public static void main(String[] args) 
	  {
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(6);
		set.add(1);
		set.add(16);
		set.add(44);
		set.add(6);
		System.out.println(set);
		
		set.contains("16");
		
		Set<Integer> ts = new TreeSet<>();
		ts.add(4);
		ts.add(6);
		ts.add(1);
		ts.add(16);
		ts.add(44);
	    ts.add(6);
		System.out.println(ts);
		
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ArrayList<String> list = new ArrayList<>();
		list.add("John");
		list.add("Raju");
		list.add("Shesha");
		list.add("Praveen");
		list.add("John");
		System.out.println(list);
		
		list.add(2,"haha");
		
		System.out.println(list);
		
		Emp e1 = new Emp(1, "Vamshi", "sales");
		Emp e2 = new Emp(2, "venu", "developer");
		Emp e3 = new Emp(3, "raju", "mgr");
		
		List<Emp> abcd = new ArrayList<Emp>();
		abcd.add(e1);
		abcd.add(e2);
		abcd.add(e3);
		
		Iterator<Emp> ittr = abcd.iterator();
		
		while(ittr.hasNext())
		{
			Emp e = ittr.next(); 
			System.out.println(e.name);
		}
				
		

	}

}
