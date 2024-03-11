package BilalPack;
import java.util.HashMap;
public class Hashs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap <String, String> gadgetComp = new HashMap <String, String>();
       gadgetComp.put("Mobiles", "Samsung");
       gadgetComp.put("Computer", "Dell");
       gadgetComp.put("Laptop", "HP");
       gadgetComp.put("Mac", "Apple");
       
       
       //Get Single Value from HasMap
       
       System.out.println("Mobiles Values: "+ gadgetComp.get("Mobiles")+"\n");
       
       //Printing all hasMap Values
       System.out.println("Printing all hasMap Values : "+gadgetComp);
       
       //Removing Mac Values 
       gadgetComp.remove("Mac");
  
       
       System.out.println("Print HasMap after Subtracting Mac Values : " + gadgetComp);
       
       //Size of the HashMap
       System.out.println(gadgetComp.size());
       
       // HashMap Values printed by for each loop
       for (String i : gadgetComp.values()) {
    	   
    	   System.out.println(i);
       }
       
  
       
       //Removing all values from HashMap
       gadgetComp.clear();
       System.out.println("There are No values in HasMap: "+gadgetComp);
       
     HashMap <String, Integer> employees = new HashMap <String,Integer>();
       
       employees.put("John", 20);
       employees.put("Hannah", 18);
       employees.put("Mikkel", 16);
       employees.put("Walter", 55);
       
       
       for (String i: employees.keySet()) {
    	   System.out.println("Age of "+ i +" is : "+employees.get(i));
       }
       
      
       
       
       
       
	}

}
