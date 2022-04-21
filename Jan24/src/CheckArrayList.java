import java.util.ArrayList;

public class CheckArrayList {
	
  public static void main(String[] args) {
	  
    ArrayList<String> cars = new ArrayList<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    System.out.println(cars);
    
    if (cars.contains("Volvo"))
    {
        System.out.println("yes Volvo was found in the list");
    }
    else {
        System.out.println("no Volvo was not found in the list");
    }
  }
}