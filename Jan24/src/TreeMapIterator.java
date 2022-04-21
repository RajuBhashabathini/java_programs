import java.util.*;

 public class TreeMapIterator {
    public static void main(String args[]) {
        
    TreeMap<String, String> treemap = new TreeMap<String, String>();
    
    treemap.put("Fruit1", "Pear");
    treemap.put("Fruit2", "Apple");
    treemap.put("Fruit3", "Orange");
    treemap.put("Fruit4", "Papaya");
    treemap.put("Fruit5", "Banana");
   
    Set set = treemap.entrySet();
    
    Iterator itr = set.iterator();
    
    while(itr.hasNext())
    {
      Map.Entry pair = (Map.Entry)itr.next();
      
      System.out.println(pair.getKey() + " and " + pair.getValue());    
    }
    
    
    /*  Iterator<Integer> itr = treemap.keySet().iterator();
      while(itr.hasNext())
    {
      int k = itr.next();
      
      System.out.println(k + " : " + a.get(k));    
    } */
 
    
   /* Set<Map.Entry<String, String> > entries =  treemap.entrySet();
    
    for (Map.Entry<String, String> entry : entries)
    {
        System.out.println(entry.getKey() + "->" + entry.getValue());
    } */    
    
  }
}