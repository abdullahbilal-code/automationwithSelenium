package BilalPack;
import java.util.HashSet;
import java.util.Iterator;
public class SETS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashset used to store values of Objects belongs to same category.
		//Created new Hasset of bikes
		HashSet <String> bikes = new HashSet();
		
		
		bikes.add("Honda");
		bikes.add("Yahmaha");
		bikes.add("Suzuki");
		bikes.add("Metro");
		bikes.add("Mitsubishi");
		
		//print all bikes in one hash set
		System.out.println(bikes);
		
		//To check an item exists in set use contains method - Return boolean value  T&F.
		//Like if an exists
		
		System.out.println(bikes.contains("Suzuki"));
		
		
		//To remove an item use method remove()
		
		bikes.remove("Metro");
		System.out.println("Updated List of Bikes in Stock: "+bikes);

		
		//Check the size of a set
		
		System.out.println("There are total number of bikes in stock: "+bikes.size());
		
		
		//Looping through the set collection use a iterator method -- hasNext() and next() methods
		
		Iterator<String> itBike = bikes.iterator();
		while(itBike.hasNext()) {
			System.out.println("Bike :"+itBike.next());
		}
		
		
		
		//Clear All values from  the set 
		bikes.clear();
		System.out.println("Values in List: "+bikes);
		
	}

}
