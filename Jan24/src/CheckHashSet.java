import java.util.*;

public class CheckHashSet {
    public static void main(String args[]) {
         
        HashSet<String> hs = new HashSet<String>();
     
        hs.add("Hello");
        hs.add("Raju");
        hs.add("Ramesh");
        hs.add("Suresh");
        hs.add("Haha");
           if (hs.contains("Hahaha")) {
            System.out.println("Yes haha was found in the list");
        } else {
            System.out.println("No haha was not found in the list");
        }
    }
}