package BilalPack;
import java.util.ArrayList;
import java.util.LinkedList;

public class LIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList <String> vehicles = new  LinkedList <String> ();		
		
		//Add Nodes to list vehicles
		
		vehicles.add("Bikes");
		vehicles.add("Cars");
		vehicles.add("Motors");
		
		//Add  items Simply
        vehicles.add("To remove");
		System.out.println("List after Simmple add: "+vehicles);
		
		
		//Add Nodes at end or from first of list
		vehicles.addFirst("FirstCar");
		System.out.println("List after add Node on first point : "+vehicles);
		
		vehicles.addLast("LastCar");
		System.out.println("List after add Node on Last point : "+vehicles);
		
		//Remove Nodes from First or last of list
		vehicles.removeFirst();
		System.out.println("List after Remove Node from first point : "+vehicles);
		
		vehicles.removeLast();
		System.out.println("List after Remove Node from Last point : "+vehicles);
		
		
		
		vehicles.remove("To remove");
		
		System.out.println(vehicles);
		
		System.out.println("At second Node of List is : "+vehicles.get(1));
		
		System.out.println("At First Node of List is : "+vehicles.getFirst());
		
		System.out.println("At Last Node of List is : "+vehicles.getLast());

		
		vehicles.remove(0);
        System.out.println("List After Remove node from 0 index "+vehicles); 
        
		
	}

}
