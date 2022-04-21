import java.util.ArrayList;

public class ListToArray {
   public static void main(String args[])
   {
      ArrayList<String> list = new ArrayList<String>();
      list.add("Apple");
      list.add("Orange");
      list.add("Banana");

      System.out.println(list);
      
      String[] myArray = new String[list.size()];
      list.toArray(myArray);

      for(int i=0; i<myArray.length; i++)
      {
         System.out.println(myArray[i]);
      }
   }
}